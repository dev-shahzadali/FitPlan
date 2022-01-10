package com.example.login;

public class Facts {

    private String mFact;
    private int mImage;

    public Facts(int mImage, String mFact) {
        this.mFact = mFact;
        this.mImage = mImage;
    }

    public String getmFact() {
        return mFact;
    }

    public int getmImage() {
        return mImage;
    }
}

