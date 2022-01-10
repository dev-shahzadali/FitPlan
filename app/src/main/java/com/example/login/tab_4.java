package com.example.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.Collections;

public class tab_4 extends Fragment {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4, container, false);

        mImageView = (ImageView)view.findViewById(R.id.imageView4);
        mTextView = (TextView)view.findViewById(R.id.fact4);
        mButton = (Button)view.findViewById(R.id.factButton4);

        ShowRandomFact();


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowRandomFact();
            }
        });



        return view;

    }

    public void ShowRandomFact(){
        ShuffleFacts();
        mImageView.setImageResource(factArray[0].getmImage());
        mTextView.setText(factArray[0].getmFact());
    }

    Facts f01 = new Facts(R.drawable.thirtyone, "STEAK & RICE \n\nGrilled Steak \nBrown Rice \nSauteed Broccoli \nBottle of Water");
    Facts f02 = new Facts(R.drawable.thirtytwo, "CHICKEN ATTACK \n\n150g Grilled Chicken \nGrilled Portobello Mushrooms \n100g Baked Sweet Potato \nBottle of Water");
    Facts f03 = new Facts(R.drawable.thirtythree, "SAUSAGE DELIGHT \n\nTurkey Sausage with Red Peppers & Onions \nBaked Sweet Potato \nBottle of Water ");
    Facts f04 = new Facts(R.drawable.thirtyfour, "SHRIMP \n\nGrilled Shrimp \nAngel Hair Pasta with Garlic and Olive Oil \nBottle of Water");
    Facts f05 = new Facts(R.drawable.thirtyfive, "ROUND STEAK & POTATO \n\nTop Round Steak \nBaked Sweet Potato \nGrilled Asparagus \nBottle of Water");
    Facts f06 = new Facts(R.drawable.thirtysix, "SIRLOIN STEAK & POTATO \n\nGrilled Sirloin Steak with Garlic Butter \nBaked Sweet Potato \nSauteed Broccoli \nBottle of Water");
    Facts f07 = new Facts(R.drawable.thirtyseven, "CHICKEN & RICE  \n\nLemon Grilled Chicken \nBrown Rice \nGrilled Mixed Vegetables \nBottle of Water");
    Facts f08 = new Facts(R.drawable.thirtyeight, "TUNA  \n\n150g Grilled Tuna \nJasmine Rice \nWilted Spinach \nBottle of Water");
    Facts f09 = new Facts(R.drawable.thirtynine, "CHICKEN ATTACK 2 \n\nGrilled Chicken Breast with Roasted Apples & Onions \nBaked Sweet Potato \nCous Cous \nGrilled Mixed Vegetables \nBottle of Water");
    Facts f10 = new Facts(R.drawable.forty, "CAJUN \n\nCajun Chicken Breast \nCous Cous \nBaked Sweet Potato \nGrilled Mixed Vegetables \nBottle of Water");


    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

    public void ShuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }
}
