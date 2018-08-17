package com.carousel.imagecarousel.activities.main_activity;

import android.net.Uri;

import com.carousel.imagecarousel.models.VideosModel;

/**
 * Created by Abdullah on 8/17/2018
 *
 * This is a presenter class for main activity.
 * This class will be responsible for performing the logical operations of main activity.
 */

public class MainPresenter {

    private VideosModel videosModel;

    private int currentPlayingVideo = -1;

    public MainPresenter() {
        videosModel = new VideosModel();
    }

    Uri getVideoUri(){
        videosModel.getVideoUrls().add("http://184.72.239.149/vod/smil:BigBuckBunny.smil/playlist.m3u8");
        videosModel.getVideoUrls().add("http://playertest.longtailvideo.com/adaptive/wowzaid3/playlist.m3u8");
        videosModel.getVideoUrls().add("http://cdn-fms.rbs.com.br/hls-vod/sample1_1500kbps.f4v.m3u8");
        return Uri.parse(videosModel.getVideoUrls().get(++currentPlayingVideo));
    }
}
