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

public class tab_1 extends Fragment {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);


        mImageView = (ImageView)view.findViewById(R.id.imageView);
        mTextView = (TextView)view.findViewById(R.id.fact);
        mButton = (Button)view.findViewById(R.id.factButton);

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

    Facts f01 = new Facts(R.drawable.one, "FRENCH TOAST \n\nWhole Wheat French Toast \nGlass of Skim Milk \nHigh Grade Omega-3s ");
    Facts f02 = new Facts(R.drawable.two, "OATMEAL \n\n1 cup oatmeal + 1 scoop whey \nHigh Grade Omega-3's \nGlass of Skim Milk");
    Facts f03 = new Facts(R.drawable.three, "PROTEIN SMOOTHIE \n\n2 cups of Skim Milk \n1 banana \n1tbsp peanut butter \n1 Scoop protein powder \nFresh Strawberries/Blueberries \n1tbsp Flax Seeds ");
    Facts f04 = new Facts(R.drawable.four, "PUMPKIN WAFFLES \n\nWhole Wheat Waffles \nPumpkin Butter \nGlass of Skim Milk \n1 tbsp grounded flax seeds");
    Facts f05 = new Facts(R.drawable.five, "EGG START \n\n5 Scrambled Egg whites \n100g chicken fillet \n2 Slices of Whole Wheat Bread \n1 Glass Almond Milk");
    Facts f06 = new Facts(R.drawable.six, "OATMEAL 2 \n\nBowl of oats with milk \n2 scoops whey \nHandful of Almonds/Cashews/Peanut \n1tbsp grounded flax seeds");
    Facts f07 = new Facts(R.drawable.seven, "OATMEAL 3 \n\nBowl of oats with milk \nHigh grade Omega-3's \nFat Free Yogurt");
    Facts f08 = new Facts(R.drawable.eight, "EGG ATTACK \n\n5 Egg White / 1 Whole Egg Omelet \nWhole Wheat Toast \nHigh Grade Omega-3's");
    Facts f09 = new Facts(R.drawable.nine, "PROTEIN FEST \n\nBowl of Oatmeal(add Cinnamon + Walnuts) \nScrambled Egg Whites \nGlass of Skim Milk \n1tbsp chia seeds");
    Facts f10 = new Facts(R.drawable.ten, "PEANUT BUTTER WAFFLES \n\nWhole Wheat Waffles \nPumpkin Butter \nGlass of Skim Milk \n1tbsp grounded flax seeds");


    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

    public void ShuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }








}
