package com.example.investnation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int i) {
        super(fm);
        mNumOfTabs = i;
    }

    public Fragment getItem(int position){

        switch (position){
            case 0:
                savingstab a = new savingstab();
                return a;

            case 1:
                investtab b = new investtab();
                return b;
            case 2:
                finliteracytab c = new finliteracytab();
                return c;

            default:
                return null;
        }


    }

    public int getCount(){
        return mNumOfTabs;
    }

}
