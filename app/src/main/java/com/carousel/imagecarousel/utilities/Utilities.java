package com.carousel.imagecarousel.utilities;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This class shall contain all of the common functions which can be accessed through out the app implementation.
 * This class features all static methods so that they can be referenced directly from any class.
 */

public class Utilities {

    /**
     * This functions return the width of the device the app is running on.
     * @param activity is the instance of calling activity required to get window manager.
     * @return the width of device in int format.
     */
    public static int getScreenWidth(Activity activity){
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /**
     * This functions return the height of the device the app is running on.
     * @param activity is the instance of calling activity required to get window manager.
     * @return the height of device in int format.
     */
    public static int getScreenHeight(Activity activity){
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}