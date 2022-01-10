package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import static maes.tech.intentanim.CustomIntent.customType;

public class Profile extends AppCompatActivity {

    TextView name;
    String username;
    Button dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.Username);
        username = getIntent().getStringExtra("username");
        name.setText(username);

        dashboard = findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent todashboard = new Intent(Profile.this, Dashboard.class);
                startActivity(todashboard);
                customType(Profile.this,"fadein-to-fadeout");
            }
        });

    }
}
