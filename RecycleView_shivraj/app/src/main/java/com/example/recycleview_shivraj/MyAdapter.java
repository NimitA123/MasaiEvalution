package com.example.recycleview_shivraj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<String> myNames = new ArrayList<>();
    Context context;
    OnNameItemClicked mListener;

    MyAdapter(ArrayList<String> names, Context context, OnNameItemClicked listener){
        myNames = names;
        this.context = context;
        mListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.names_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = myNames.get(position);
        holder.nameTv.setText(name);

        holder.closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.deleteItem(position);
            }
        });

        holder.nameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onMyNameClicked(name);

            }
        });

    }

    @Override
    public int getItemCount() {
        return myNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTv;
        ImageView closeImage;

        public ViewHolder(@NonNull View view) {
            super(view);

            nameTv = view.findViewById(R.id.textView);
            closeImage = view.findViewById(R.id.deleteImage);

        }
    }
}