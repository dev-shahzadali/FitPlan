package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BMR extends AppCompatActivity {

    private double b1 = 0;
    private double b2 = 0;
    private Button calc, reset;
    private RadioButton male, female;
    private RadioButton sedentary, lightly, moderately, very, superActive;
    private RadioGroup gender, activity;
    private EditText age, height, weight;
    private TextView bmr, maintenance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);


        calcPrice();
    }


    public void calcPrice(){

        gender = (RadioGroup)findViewById(R.id.rg_Gender);
        activity = (RadioGroup)findViewById(R.id.rg_Activity);
        calc = (Button)findViewById(R.id.bt_calc);
        reset = (Button)findViewById(R.id.bt_reset);
        male = (RadioButton)findViewById(R.id.rd_Male);
        female = (RadioButton)findViewById(R.id.rd_Female);
        sedentary = (RadioButton)findViewById(R.id.rd_sedentary);
        lightly = (RadioButton)findViewById(R.id.rd_Lightly);
        moderately = (RadioButton)findViewById(R.id.rd_moderate);
        very = (RadioButton)findViewById(R.id.rd_active);
        superActive = (RadioButton)findViewById(R.id.rd_super);
        age = (EditText)findViewById(R.id.et_Age);
        height = (EditText)findViewById(R.id.et_Height);
        weight = (EditText)findViewById(R.id.et_Weight);
        bmr = (TextView)findViewById(R.id.tv_bmr);
        maintenance = (TextView)findViewById(R.id.tv_Maintenance);


        // Register  OnCheckedCahngeListener for rg_Gender

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.rd_Male){
                    b1 = 5;
                }

                if(checkedId == R.id.rd_Female){
                    b1 = -161;
                }


            }
        });


        activity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.rd_sedentary){
                    b2 = 1.25;
                }
                if(checkedId == R.id.rd_Lightly){
                    b2 = 1.375;
                }
                if(checkedId == R.id.rd_moderate){
                    b2 = 1.55;
                }
                if(checkedId == R.id.rd_active){
                    b2 = 1.725;
                }
                if(checkedId == R.id.rd_super){
                    b2 = 1.9;
                }
            }
        });


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double age_S;
                double weight_S;
                double height_S;
                double CalcBmr;
                double CalcMain;

                String bmr_S = "";
                String main_S = "";


                age_S = Double.parseDouble(age.getText().toString());
                weight_S = Double.parseDouble((weight.getText().toString()));
                height_S = Double.parseDouble(height.getText().toString());

                CalcBmr = ((10 * weight_S) + (6.25 * height_S) - (5 * age_S) + b1);
                CalcMain = CalcBmr * b2;

                calc.setEnabled(false);

                bmr.setText("Basal Metabolic Rate(BMR) =" + CalcBmr);
                maintenance.setText(" Daily Maintenance Calories = " + CalcMain + "" + "calories");

            }
        });


// Register  OnClickListener for btn_Clear

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1 = 0;
                b2 = 0;
                gender.clearCheck();
                activity.clearCheck();
                calc.setEnabled(true);
                age.getText().clear();
                height.getText().clear();
                weight.getText().clear();
                bmr.setText(null);
                maintenance.setText(null);
            }
        });




    }
}
