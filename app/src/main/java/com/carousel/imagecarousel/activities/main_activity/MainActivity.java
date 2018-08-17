package com.carousel.imagecarousel.activities.main_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.carousel.imagecarousel.R;

/**
 * Created by Abdullah on 8/17/2018
 *
 * This is the MainActivity which is the first activity which loads on app start.
 * This activity will feature the video view for playing the video and a recycler view for image carousel.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
