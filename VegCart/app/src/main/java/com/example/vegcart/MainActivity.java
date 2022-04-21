package com.example.vegcart;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayoutMain;
    ViewPager viewPagerMain;


    protected void onCrete(Bundle savedInstanceStateBundle) {

        setContentView(R.layout.activity_main);

//        tabLayoutMain.findViewById(R.id.tabLayoutMain);
//        viewPagerMain=findViewById(R.id.viewPagerMain);


        tabLayoutMain.addTab(tabLayoutMain.newTab().setText("Home"));
        tabLayoutMain.addTab(tabLayoutMain.newTab().setText("Sport"));
        tabLayoutMain.addTab(tabLayoutMain.newTab().setText("Movie"));
        tabLayoutMain.setTabGravity(TabLayout.GRAVITY_FILL);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }



    private TabLayout tabLayout;

    public MainActivity(TabLayout tabLayoutMain) {
        this.tabLayoutMain = tabLayoutMain;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View viewPager = findViewById(R.id.viewPagerMain);

        // setting up the adapter
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add the fragments
        //viewPagerAdapter.add(new activity_one(), "Activity 1");
        viewPagerAdapter.add(new Fruits(), "Fruits");
//        viewPagerAdapter.add(new Page3(), "Page 3");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
//        tabLayout = findViewById(tabLayoutMain);
//        tabLayout.setupWithViewPager(viewPager);
    }

}