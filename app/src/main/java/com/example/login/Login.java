package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static maes.tech.intentanim.CustomIntent.customType;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText mTextUsername;
        final EditText mTextPassword;
        Button mButtonLogin;
        TextView mTextViewRegister;
        final CheckBox showpassword;
        final DatabaseHelper db;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db =  new DatabaseHelper(this);
        mTextUsername = findViewById(R.id.editText_username);
        mTextPassword = findViewById(R.id.editText_password);
        mButtonLogin = findViewById(R.id.button_login);
        showpassword = findViewById(R.id.showpassword);
        mTextViewRegister = (TextView)findViewById(R.id.textView_register);

        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(Login.this,RegisterActivity.class);
                startActivity(LoginIntent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();

                boolean res = db.checkUser(user,pwd);
                if(user.equals("")){
                    Toast.makeText(Login.this,"Logged Error!!",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(res){
                        Toast.makeText(Login.this,"Successfully Logged In",Toast.LENGTH_SHORT).show();
                        Intent LoginIntent = new Intent(Login.this,Profile.class);
                        LoginIntent.putExtra("username",user);
                        startActivity(LoginIntent);
                        customType(Login.this,"fadein-to-fadeout");
                    }
                    else
                    {
                        Toast.makeText(Login.this,"Logged Error!!",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    mTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });


    }

}
