package com.wdharmana.mysimpletab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyTabAdapter extends FragmentPagerAdapter {

    private String[] listTitle;
    private List<Fragment> listFragment;

    public MyTabAdapter(FragmentManager fm, List<Fragment> listFragment, String[] listTitle) {
        super(fm);
        this.listTitle = listTitle;
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle[position];
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }
}