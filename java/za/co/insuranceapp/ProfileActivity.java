package ke.co.insuranceapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ke.co.insuranceapp.Models.User;
import ke.co.insuranceapp.Utils.SharedPreference;

public class ProfileActivity extends AppCompatActivity {

    EditText fNameTv,otherNameTv,idTv,phoneTv,emailTv,currentPasswordTv,newPasswordTv;

    SharedPreference sharedPreference;
    User me;

    Boolean hasChanges = false;

    Button saveButton,changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("My Profile");

//        sharedPreference = new SharedPreference(this);
//        me = sharedPreference.getUser();

        fNameTv = findViewById(R.id.fnameTv);
        otherNameTv = findViewById(R.id.lnameTv);
        idTv = findViewById(R.id.idTv);
        phoneTv = findViewById(R.id.phoneTv);
        emailTv = findViewById(R.id.email);

        currentPasswordTv = findViewById(R.id.passwordTv);
        newPasswordTv = findViewById(R.id.new_passwordTv);

        saveButton = findViewById(R.id.save_button);
        changeBtn = findViewById(R.id.change_button);

//        initProfile();
//
//        saveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveUser();
//            }
//        });
//
//        changeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                changePassword();
//            }
//        });
    }

    private void saveUser() {
        String fname = fNameTv.getText().toString();
        String otherName = otherNameTv.getText().toString();
        String id = idTv.getText().toString();
        String phone = phoneTv.getText().toString();
        String email = emailTv.getText().toString();
    }
//
//    private void initProfile() {
//
//        if (me.getEmail().trim().isEmpty()){
//            return;
//        }
//
//        fNameTv.setText(me.getFname());
//        otherNameTv.setText(me.getLname());
//        idTv.setText(me.getId_passport());
//        phoneTv.setText(me.getPhone());
//        emailTv.setText(me.getEmail());
//
//        monitorChanges();
//    }

//    private void monitorChanges() {
//
//
//        fNameTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                hasChanges = !fNameTv.getText().toString().equals(me.getFname());
//            }
//        });
//
//        otherNameTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                hasChanges = !otherNameTv.getText().toString().equals(me.getFname());
//            }
//        });
//
//        idTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                hasChanges = !idTv.getText().toString().equals(me.getFname());
//            }
//        });
//
//        phoneTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                hasChanges = !phoneTv.getText().toString().equals(me.getFname());
//            }
//        });
//
//        emailTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                hasChanges = !emailTv.getText().toString().equals(me.getFname());
//            }
//        });
//    }
//
//    public void changePassword(){
//        String email = sharedPreference.getUser().getEmail();
//        String password = currentPasswordTv.getText().toString();
//        String current_password = newPasswordTv.getText().toString();
//    }

    public static Intent getIntent(Context ctx){
        return new Intent(ctx, ProfileActivity.class);
    }

//    @Override
//    public void onFocusChange(View v, boolean hasFocus) {
//        if (hasChanges){
//            saveButton.setEnabled(true);
//        }
//    }
}
