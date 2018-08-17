package com.carousel.imagecarousel.models;

import java.util.ArrayList;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This is a model class for videos.
 * This class shall hold all the data for the videos that will be played in the app.
 */

public class VideosModel {
    private ArrayList<String> videoUrls;

    public VideosModel() {
        videoUrls = new ArrayList<>();
    }

    public ArrayList<String> getVideoUrls() {
        return videoUrls;
    }
}
