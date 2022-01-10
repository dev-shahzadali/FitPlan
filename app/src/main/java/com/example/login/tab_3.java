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

public class tab_3 extends Fragment {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);

        mImageView = (ImageView)view.findViewById(R.id.imageView3);
        mTextView = (TextView)view.findViewById(R.id.fact3);
        mButton = (Button)view.findViewById(R.id.factButton3);

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

    Facts f01 = new Facts(R.drawable.twentyone, "GRILLED PASTA \n\n1 Bowl Pasta \n100g Grilled Chicken \nLow Fat Curd \nBottle of Water");
    Facts f02 = new Facts(R.drawable.twentytwo, "TUNA SALAD \n\n100g Tuna \nSalad with Fat Free Mayo \nWhole Wheat Pita \n1 Apple \nBottle of Water");
    Facts f03 = new Facts(R.drawable.twentythree, "TURKEY BREAST \n\nTurkey Breast on Whole Wheat Wrap \nMustard Sauce & Fat Free Cheese \nFat Free Curd \nBottle of Water ");
    Facts f04 = new Facts(R.drawable.twentyfour, "TURKEY BURGER \n\nTurkey Burger with Onions,Lettuce \nFat Free Curd & Swizz Cheese \nBottle of Water");
    Facts f05 = new Facts(R.drawable.twentyfive, "CAJUN WRAP \n\n150g Cajun Grilled Chicken \nWhole Wheat Wrap \nGrilled Asparagus \nBottle of Water");
    Facts f06 = new Facts(R.drawable.twentysix, "EGG ATTACK \n\nEgg White & Pepper Omelet \nWhole Wheat Wrap \nFat Free Curd & Swizz Cheese \nBottle of Water");
    Facts f07 = new Facts(R.drawable.twentyseven, "CANNED TUNA WRAP\n\nCanned Tuna in Water \nFat Free Mayo \nGrilled Mixed Vegetables \nWhole Wheat Wrap \nBottle of Water");
    Facts f08 = new Facts(R.drawable.twentyeight, "GRILLED CHICKEN WRAP\n\n150g Grilled Chicken \nWhole Wheat Wrap with Onions & BBQ Sauce \nFat Free Yogurt \nBottle of Water");
    Facts f09 = new Facts(R.drawable.twentynine, "PEANUT BUTTER SANDWICH\n\nPeanut Butter & Jelly Sandwich on Whole Wheat Bread \nFat Free Curd \nBottle of Water");
    Facts f10 = new Facts(R.drawable.thirty, "CAJUN POTATO BOWL\n\nCajun Chicken Breast \nCous Cous \nBaked Sweet Potato \nGrilled Mixed Vegetables \nBottle of Water");


    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

    public void ShuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }
}
