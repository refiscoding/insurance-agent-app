package za.co.insuranceapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import ke.co.insuranceapp.Common.Common;
import ke.co.insuranceapp.Models.User;


public class SignIn extends AppCompatActivity {

    MaterialEditText edtphone,edtpass;
    Button btnsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnsign = findViewById(R.id.btnSign);
        //edtpass = findViewById(R.id.edtPass);
        //edtphone = findViewById(R.id.edtPhone);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference user_tbl = database.getReference("User");


        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog dialog = new ProgressDialog(SignIn.this);
                dialog.setMessage("Please Wait...");
                dialog.show();

                user_tbl.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        //check if user exists on database
                        if (dataSnapshot.child(edtphone.getText().toString()).exists()) {
                            //Getting user info from database
                            dialog.dismiss();

                            User user = dataSnapshot.child(edtphone.getText().toString()).getValue(User.class);

                            if (user.getPassword().equals(edtpass.getText().toString())) {
                                Intent intent = new Intent(SignIn.this,HomeActivity.class);
                                Common.currentUser = user;
                                startActivity(intent);
                                finish();

                            } else {
                                Toast.makeText(SignIn.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                            }
                        }else
                        {
                            dialog.dismiss();
                            Toast.makeText(SignIn.this, "User Does not exist!!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
