package com.example.login.main;


import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.login.R;
import com.example.login.tab_1;
import com.example.login.tab_2;
import com.example.login.tab_3;
import com.example.login.tab_4;
import com.google.android.material.tabs.TabLayout;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                tab_1 tab1 = new tab_1();
                return tab1;
            case 1:
                tab_2 tab2 = new tab_2();
                return tab2;

            case 2:
                tab_3 tab3 = new tab_3();
                return tab3;

            case 3:
                tab_4 tab4 = new tab_4();
                return tab4;
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}