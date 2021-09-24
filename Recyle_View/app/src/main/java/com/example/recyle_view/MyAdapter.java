package com.example.recyle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

        private ArrayList<MenuList> Menu;
        public MyAdapter(ArrayList < MenuList > menuArrayList) {
            this.Menu = menuArrayList;
            //System.out.println(menuArrayList);

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder (@NonNull ViewHolder holder,int position){
            MenuList menu = Menu.get(position);
            holder.setData(menu);

        }

        @Override
        public int getItemCount () {
            return Menu.size();
        }
    }

