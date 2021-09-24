package com.example.recyle_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView mtvTextName;
    private TextView mtvTextPrice;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ItemViews(itemView);

        /****
         * All the view will present inside this ViewHolder class
         *
         */
    }
    private void ItemViews(View itemView){
        imageView = itemView.findViewById(R.id.imageView);
        mtvTextName = itemView.findViewById(R.id.textView);
        mtvTextPrice = itemView.findViewById(R.id.textView2);
    }



    public void setData(MenuList menu){
        imageView.setImageResource(menu.getImage());
        mtvTextName.setText(menu.getName());
        mtvTextPrice.setText(menu.getPrice()+"");
    }


}
