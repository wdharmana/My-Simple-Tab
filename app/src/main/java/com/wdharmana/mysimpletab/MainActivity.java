package com.wdharmana.mysimpletab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupAdapter();

    }

    private void setupAdapter() {

        String[] listTitle = {"Main Course", "Dessert", "Drink"};

        List<Fragment> listFragment = new ArrayList<>();
        listFragment.add(MainFragment.newInstance(listTitle[0]));
        listFragment.add(MainFragment.newInstance(listTitle[1]));
        listFragment.add(MainFragment.newInstance(listTitle[2]));

        MyTabAdapter sectionsPagerAdapter = new MyTabAdapter(getSupportFragmentManager(), listFragment, listTitle);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }


}
