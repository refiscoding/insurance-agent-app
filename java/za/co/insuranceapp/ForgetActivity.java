package ke.co.insuranceapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ke.co.insuranceapp.Utils.SharedPreference;


public class ForgetActivity extends AppCompatActivity {

    SharedPreference sharedPreference;

    EditText emailField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        setTitle("Forgot Password");



        findViewById(R.id.submitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailField.getText().toString().trim();
                if (!email.isEmpty() && email.contains("@")){
                    Toast.makeText(ForgetActivity.this, "Please check your email, we have sent you a new password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public static Intent getIntent (Context ctx){
        return new Intent(ctx,ForgetActivity.class);
    }
}