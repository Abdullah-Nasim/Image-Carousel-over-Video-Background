package com.carousel.imagecarousel.models;

import java.util.ArrayList;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This is a model class for images.
 * This class shall hold all the data for the images that will be displayed in the app.
 */

public class ImagesModel {

    private ArrayList<String> imagesUrls;

    public ImagesModel() {
        imagesUrls = new ArrayList<>();
    }

    public ArrayList<String> getImagesUrls() {
        return imagesUrls;
    }

}
