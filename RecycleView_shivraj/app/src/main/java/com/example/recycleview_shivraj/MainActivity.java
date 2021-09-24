package com.example.recycleview_shivraj;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnNameItemClicked {
    private RecyclerView recyclerView;
    ArrayList<String> names = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        names.add("Shiv");
        names.add("Jack");
        names.add("Rocky");

        adapter = new MyAdapter(names, this, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);


        /**
         * What is RecyclerView?
         * RecyclerView is a ViewGroup, which populates a list on a collection of data
         * provided with the help of ViewHolder and draws it to the user on-screen.
         *
         * Components of RecyclerView
         *
         * Adapter
         * ViewHolder
         * LayoutManager
         *
         * Adapter
         * It is a subclass of RecyclerView.Adapter class.
         * It takes the data set which has to be displayed to the user in RecyclerView.
         * It is like the main responsible class to bind the views and display it.
         *
         * Most of the tasks happen inside the adapter class of the recyclerView.
         *
         * ViewHolder
         * ViewHolder is a type of a helper class that helps us to draw the UI for
         * individual items that we want to draw on the screen.
         *
         * All the binding of Views of the individual items happens in this class.
         * It is a subclass of RecyclerView.ViewHolder class.
         *
         * LayoutManager
         * LayoutManager in recyclerView helps us to figure out how we need
         * to display the items on the screen.
         * It can be linearly or in a grid.
         * RecyclerView provides by default a few implementations of layoutManager
         * out of the box.
         *
         * It is like the governing body of recyclerView which tells the recyclerView's
         * adapter when to create a new view.
         *
         *
         *
         */
    }

    @Override
    public void onMyNameClicked(String name) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }

    @Override
    public void deleteItem(int position) {
        names.remove(position);
        adapter.notifyDataSetChanged();
    }
}