package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.login.main.SectionsPagerAdapter;

import static maes.tech.intentanim.CustomIntent.customType;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView recepecard,pedometercard,logoutcard,bmi,bmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Defining Card
        recepecard = findViewById(R.id.recipes);
        pedometercard = findViewById(R.id.pedometer);
        bmi = findViewById(R.id.BMI);
        logoutcard = findViewById(R.id.logout);
        bmr = findViewById(R.id.bmr);

        //Add click listener to the cards
        recepecard.setOnClickListener(this);
        pedometercard.setOnClickListener(this);
        bmi.setOnClickListener(this);
        logoutcard.setOnClickListener(this);
        bmr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()) {
            case R.id.recipes: i = new Intent(this, Recipes.class);startActivity(i);customType(Dashboard.this,"fadein-to-fadeout"); break;
            case R.id.pedometer: i = new Intent(this,Pedometer.class);startActivity(i);customType(Dashboard.this,"fadein-to-fadeout"); break;
            case R.id.BMI: i = new Intent(this,BMI.class);startActivity(i);customType(Dashboard.this,"fadein-to-fadeout"); break;
            case R.id.bmr: i = new Intent(this,BMR.class);startActivity(i);customType(Dashboard.this,"fadein-to-fadeout"); break;
            case R.id.logout: i = new Intent(this,HomePage.class);startActivity(i);customType(Dashboard.this,"fadein-to-fadeout");
            finish();break;
            default:break;
        }
    }
}
