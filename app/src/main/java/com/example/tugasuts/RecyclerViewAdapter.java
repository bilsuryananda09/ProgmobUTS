package com.example.tugasuts;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImagesNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImagesDetails = new ArrayList<>();
    private ArrayList<String> mImagesDeskripsi = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mImagesNames, ArrayList<String> mImages, ArrayList<String> mImagesDetails, ArrayList<String> mImagesDeskripsi,Context mContext) {
        this.mImagesNames = mImagesNames;
        this.mImages = mImages;
        this.mContext = mContext;
        this.mImagesDetails = mImagesDetails;
        this.mImagesDeskripsi = mImagesDeskripsi;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);


        holder.imageDetail.setText(mImagesDetails.get(position));
        holder.imageName.setText(mImagesNames.get(position));


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on :" + mImagesNames.get(position));

                Toast.makeText(mContext, mImagesNames.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImagesNames.get(position));
                intent.putExtra("image_asal", mImagesDetails.get(position));
                intent.putExtra("image_deskripsi", mImagesDeskripsi.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImagesNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        TextView imageDetail;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageDetail = itemView.findViewById(R.id.image_detail);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }
}
