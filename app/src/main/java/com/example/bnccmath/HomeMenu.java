package com.example.bnccmath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HomeMenu extends AppCompatActivity {

    private TabLayout tabCounter;
    private ViewPager viewCounter;
    private FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        tabCounter = findViewById(R.id.counter);
        viewCounter = findViewById(R.id.viewCounter);

        tabCounter.setupWithViewPager(viewCounter);

        setUpCounter(viewCounter);
    }

    private void setUpCounter (ViewPager viewCounter){ //kalau error ganti viewCounter ke viewPager
        if (fragmentAdapter == null){
            fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
            fragmentAdapter.addFragment(new Counter(), "Counter");
            fragmentAdapter.addFragment(new AreaCalculator(), "Area Calculator");
            fragmentAdapter.addFragment(new VolumeCalculator(), "Volume Calculator");
            viewCounter.setAdapter(fragmentAdapter);
        }
    }
}