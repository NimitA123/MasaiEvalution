package com.example.recycleview_setitemnotifychanged;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView text1;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        text1 = itemView.findViewById(R.id.textView);


    }

    public void setData(Model menu) {
        text1.setText(menu.getTxt()+"");


    }
}