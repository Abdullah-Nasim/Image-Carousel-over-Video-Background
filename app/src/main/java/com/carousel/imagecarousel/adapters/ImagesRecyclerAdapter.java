package com.carousel.imagecarousel.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.carousel.imagecarousel.R;
import com.carousel.imagecarousel.adapters.viewholders.ImagesRecyclerViewHolder;
import com.carousel.imagecarousel.utilities.Utilities;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Abdullah on 8/17/2018.
 *
 * This is a Recycler Adapter for Images Carousel.
 * This adapter shall hold the data set of images and shall renter the views accordingly.
 */

public class ImagesRecyclerAdapter extends RecyclerView.Adapter<ImagesRecyclerViewHolder> {

    private ArrayList<String> mDataSet;

    private Activity activity;

    public ImagesRecyclerAdapter(ArrayList<String> mDataSet, Activity activity) {
        this.mDataSet = mDataSet;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ImagesRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImagesRecyclerViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_recycler_item, parent, false));    }

    @Override
    public void onBindViewHolder(@NonNull ImagesRecyclerViewHolder holder, int position) {
        holder.itemView.getLayoutParams().width = Utilities.getScreenWidth(activity)/3;
        Picasso.get().load(mDataSet.get(position % mDataSet.size())).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
