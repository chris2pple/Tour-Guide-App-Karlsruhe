package com.tryouts.chris2pple.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle(R.string.title_header);

        /*View pager that will allow the user to swipe between fragments*/
        ViewPager viewPager = findViewById(R.id.viewpager);

        /*The adapter which knows which fragment should be shown on each page*/
        TabSelectorAdapter adapter=new TabSelectorAdapter(this, getSupportFragmentManager());

        /*The adapter to set onto the view pager*/
        viewPager.setAdapter(adapter);
        /*The Tablayout to give the Viewpager*/
        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
