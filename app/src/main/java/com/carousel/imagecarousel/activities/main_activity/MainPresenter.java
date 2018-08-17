package com.carousel.imagecarousel.activities.main_activity;

import android.net.Uri;

import com.carousel.imagecarousel.models.ImagesModel;
import com.carousel.imagecarousel.models.VideosModel;

import java.util.ArrayList;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This is a presenter class for main activity.
 * This class will be responsible for performing the logical operations of main activity.
 */

public class MainPresenter {

    private VideosModel videosModel;

    private ImagesModel imagesModel;

    private int currentPlayingVideo = -1;

    MainPresenter() {
        videosModel = new VideosModel();
        imagesModel = new ImagesModel();
    }

    /**
     * The method function will initialize the model class for videos.
     * This method will populate the model with possible video urls and shall return the expected
     * Uri when needed.
     *
     * @return shall contain the expected Uri by the Main Activity.
     */
    Uri getVideoUri(){
        if(currentPlayingVideo == 2)
            currentPlayingVideo = -1;
        videosModel.getVideoUrls().add("http://184.72.239.149/vod/smil:BigBuckBunny.smil/playlist.m3u8");
        videosModel.getVideoUrls().add("http://playertest.longtailvideo.com/adaptive/wowzaid3/playlist.m3u8");
        videosModel.getVideoUrls().add("http://cdn-fms.rbs.com.br/hls-vod/sample1_1500kbps.f4v.m3u8");
        return Uri.parse(videosModel.getVideoUrls().get(++currentPlayingVideo));
    }

    /**
     * The following method will initialize the model class for images.
     * This method will populate the model with list of different image urls as per the information form
     * requirements document.
     *
     * @return shall contain the list of image Urls.
     */
    ArrayList<String> getImageUrls(){
        for(int i =0; i < 7; i++){
            imagesModel.getImagesUrls().add("https://picsum.photos/300/20" + i);
        }
        return imagesModel.getImagesUrls();
    }
}
