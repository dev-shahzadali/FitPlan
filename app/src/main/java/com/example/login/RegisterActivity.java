package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextConfirmPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);
        mTextUsername = findViewById(R.id.editText_username);
        mTextPassword = findViewById(R.id.editText_password);
        mTextConfirmPassword = findViewById(R.id.editText_confirmPassword);
        mButtonRegister = findViewById(R.id.button_register);
        mTextViewLogin = findViewById(R.id.textView_login);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity.this,Login.class);
                startActivity(LoginIntent);
            }
        });

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                String cnf_pwd = mTextConfirmPassword.getText().toString().trim();

                if (user.matches("")) {
                    Toast.makeText(RegisterActivity.this, "Enter Username!!", Toast.LENGTH_SHORT).show();
                }

                if (pwd.matches("")) {
                    Toast.makeText(RegisterActivity.this, "Enter Password!!", Toast.LENGTH_SHORT).show();
                }

                else{
                    if(pwd.equals(cnf_pwd)){
                        long val = db.addUser(user,pwd);
                        if(val > 0) {
                            Toast.makeText(RegisterActivity.this, "You Have Successfully Registered", Toast.LENGTH_SHORT).show();
                            Intent moveToLogin = new Intent(RegisterActivity.this, Login.class);
                            startActivity(moveToLogin);
                        }
                        else{
                            Toast.makeText(RegisterActivity.this,"Registration Error!!",Toast.LENGTH_SHORT).show();
                        }

                        Toast.makeText(RegisterActivity.this,"You Have Successfully Registered",Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(RegisterActivity.this, Login.class);
                        startActivity(moveToLogin);
                    }
                    else{
                        Toast.makeText(RegisterActivity.this,"Password is not matching!!",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}
