package ke.co.insuranceapp;

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

import ke.co.insuranceapp.Models.User;


public class SignUp extends AppCompatActivity {

    MaterialEditText etphone,etpass,etname;
    Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       // etphone = findViewById(R.id.etPhone);
       // etpass = findViewById(R.id.etPass);
       // etname = findViewById(R.id.etName);

        btnreg = findViewById(R.id.btnRegister);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference user_tbl = database.getReference("User");


        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog dialog = new ProgressDialog(SignUp.this);
                dialog.setMessage("Please Wait...");
                dialog.show();


                user_tbl.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        //check if user is in database
                        if(dataSnapshot.child(etphone.getText().toString()).exists())
                        {
                            dialog.dismiss();
                            Toast.makeText(SignUp.this, "Phone Number is Already registered..", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            dialog.dismiss();

                            User user = new User();

                            user_tbl.child(etphone.getText().toString()).setValue(user);

                            Toast.makeText(SignUp.this, "Sign Up Successful..", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignUp.this, HomeActivity.class);
                            startActivity(intent);

                            finish();

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
