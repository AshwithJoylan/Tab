package com.facebook.tab;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager viewPager = findViewById(R.id.viewPAger);

        CustomPagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager());

        viewPager .setAdapter(adapter);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(Color.WHITE, Color.WHITE);
        tabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        tabLayout.getTabAt(0).setText("First");
        tabLayout.getTabAt(1).setText("Second");


//        viewPager.setCurrentItem(1);
    }
}
