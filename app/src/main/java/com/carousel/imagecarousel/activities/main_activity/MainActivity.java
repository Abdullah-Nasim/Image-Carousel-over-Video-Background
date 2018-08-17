package com.carousel.imagecarousel.activities.main_activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.VideoView;

import com.carousel.imagecarousel.R;

/**
 * Created by Abdullah on 8/17/2018
 *
 * This is the MainActivity which is the first activity which loads on app start.
 * This activity will feature the video view for playing the video and a recycler view for image carousel.
 */

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnInfoListener {

    private VideoView videoView;

    private ProgressBar progressBar;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter();

        intiViews();
        setupBackgroundVideo();
    }

    private void intiViews() {
        videoView = findViewById(R.id.video_view);
        progressBar = findViewById(R.id.progress_bar);
    }

    private void setupBackgroundVideo() {
        try {
            videoView.setVideoURI(mainPresenter.getVideoUri());
            videoView.requestFocus();
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);
                    mp.setVolume(0,0);
                    mp.setOnInfoListener(MainActivity.this);
                    mp.setScreenOnWhilePlaying(true);
                    videoView.start();
                }
            });
        } catch (Exception e) {
            progressBar.setVisibility(View.GONE);
            e.printStackTrace();
        }
    }

    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        return false;
    }
}
