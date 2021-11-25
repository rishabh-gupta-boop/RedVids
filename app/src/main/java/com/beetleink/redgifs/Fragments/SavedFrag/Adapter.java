package com.beetleink.redgifs.Fragments.SavedFrag;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beetleink.redgifs.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder>  {
   Context context;
    ArrayList<Integer> imagesArrayList;

    public Adapter(Context context, ArrayList<Integer> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.saved_fragement_adapter_videoview, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load(imagesArrayList.get(position))
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return imagesArrayList.size();
    }




}
