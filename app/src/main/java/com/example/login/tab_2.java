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

public class tab_2 extends Fragment {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, container, false);


        mImageView = (ImageView)view.findViewById(R.id.imageView2);
        mTextView = (TextView)view.findViewById(R.id.fact2);
        mButton = (Button)view.findViewById(R.id.factButton2);

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

    Facts f01 = new Facts(R.drawable.eleven, "PROTEIN BREAK \n\nProtein Shake \nHandful of Walnuts \nGrapes");
    Facts f02 = new Facts(R.drawable.twelve, "PEANUT BANANA BREAD \n\nHalf Peanut Butter and banana Sandwich on Whole wheat Bread \nBottle of Water");
    Facts f03 = new Facts(R.drawable.thirteen, "NUTTY APPLE\n\nPeanut Butter \nSliced Green Apple \nBottle of Water ");
    Facts f04 = new Facts(R.drawable.fourteen, "FRUITY \n\n25-30 Grapes \nLow Fat Mozzarella String Cheese \nBottle of Water");
    Facts f05 = new Facts(R.drawable.fifteen, "GREEK YOGURT ECSTASY\n\nGreek Yogurt \nHoney & Almonds \nBottle of Water");
    Facts f06 = new Facts(R.drawable.sisteen, "PROTEIN DELIGHT \n\nProtein Shake \nGreek Yogurt \nHandful of Almonds");
    Facts f07 = new Facts(R.drawable.seventeen, "COTTAGE BERRIES \n\nCottage Cheese \nFresh Strawberries \nBottle of Water");
    Facts f08 = new Facts(R.drawable.eighteen, "CHEEKY WRAP\n\nTurkey/Chicken \nWhole Wheat Wrap \nBottle of Water");
    Facts f09 = new Facts(R.drawable.nineteen, "PROTEIN POPCORN\n\nAir Popped Popcorn \nProtein Shake \nBottle of Water");
    Facts f10 = new Facts(R.drawable.twenty, "TURKUS \n\nTurkey/Beef Jerky \nSaltine Crackers \nBottle of Water");


    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

    public void ShuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }


}

