package com.carousel.imagecarousel.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.carousel.imagecarousel.R;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This is a ViewHolder Class for Carousel Recycler Adapter.
 */

public class ImagesRecyclerViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public ImagesRecyclerViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.carousel_image_view);
    }
}
