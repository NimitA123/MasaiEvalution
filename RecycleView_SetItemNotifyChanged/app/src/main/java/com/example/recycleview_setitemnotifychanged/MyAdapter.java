package com.example.recycleview_setitemnotifychanged;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<Model> arrayList = new ArrayList<>();

    public MyAdapter(ArrayList<Model> arrayList, MainActivity mainActivity) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model menu= arrayList.get(position);
        holder.setData(menu);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
