package com.example.sony.training.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sony.training.TabFirstFragment;
import com.example.sony.training.TabSecondFragment;


public class ActivityPagerAdapter extends FragmentPagerAdapter {

    public ActivityPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TabFirstFragment();
        } else if (position == 1) {
            return new TabSecondFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
