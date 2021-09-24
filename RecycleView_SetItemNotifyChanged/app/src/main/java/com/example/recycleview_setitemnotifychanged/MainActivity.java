package com.example.recycleview_setitemnotifychanged;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private   Button btn1;

    private MyAdapter myAdapter;
    private Model model;
    private ArrayList<Model> arrayList = new ArrayList<Model>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        BuildData();
        setRecycleView();




    }

    private void setRecycleView() {
        myAdapter = new MyAdapter(arrayList, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
       // recyclerView.setLayoutManager(linearLayout);

    }

    private void BuildData() {
        arrayList.add(new Model(1));




    }


    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
        btn1 =  findViewById(R.id.IncrementBtn);
        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Model  model = new Model(1);
                arrayList.add(model);
                myAdapter.notifyDataSetChanged();





            }
        });





    }
}