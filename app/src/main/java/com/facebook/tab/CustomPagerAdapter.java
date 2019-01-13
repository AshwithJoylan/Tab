package com.facebook.tab;

import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class CustomPagerAdapter extends FragmentPagerAdapter {


    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {

            case 0:
                FirstFragment firstFragment = new FirstFragment();
                return  firstFragment;
            case 1:
                SecondFragment secondFragment = new SecondFragment();
                return  secondFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
