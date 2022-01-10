package com.example.login;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class HomePage extends AppCompatActivity {

    private Button login,register,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        login = findViewById(R.id.Login);
        register = findViewById(R.id.Register);
        exit = findViewById(R.id.Exit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogPage = new Intent(HomePage.this,Login.class);
                startActivity(LogPage);
                customType(HomePage.this,"fadein-to-fadeout");
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LogPage = new Intent(HomePage.this,RegisterActivity.class);
                startActivity(LogPage);
                customType(HomePage.this,"fadein-to-fadeout");
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });
    }
}
