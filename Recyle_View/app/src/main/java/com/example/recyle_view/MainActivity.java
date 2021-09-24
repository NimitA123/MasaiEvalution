package com.example.recyle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MenuList> menu;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.rvRecycleView);
        setContentView(R.layout.activity_main);
        initViews();
        BuildRecycleData();
        setRecycleViewAdapter();
     //   initViews();
        /****** initViews();
         buildStudentList();
         setRecycleView();
         *******/
        /***********

         private void buildStudentList(){
         Student student1 = new Student("Ankush", 21, "EMT1223");
         studentList.add(student1);
         Student student2 = new Student("Kunal",  21, "EMT1222");
         studentList.add(student2);
         for(int i = 0;   i < 13;    i++){
         Student student = new Student("XYZ"+i, 23, "EMSNA123");
         studentList.add(student);
         }
         }
         private void setRecycleView(){
         StudentAdapter studentAdapter = new StudentAdapter(studentList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2,LinearLayoutManager.VERTICAL, true );

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(studentAdapter);
        ***********/
    }




    private void setRecycleViewAdapter() {
        MyAdapter menuAdapter = new MyAdapter(menu);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(menuAdapter);
    }

    public void BuildRecycleData(){
        menu = new ArrayList<>();
        menu.add(new MenuList(R.drawable.samosa, "Samosa", 10) );
        menu.add(new MenuList(R.drawable.samosa, "Welcome", 80) );
        menu.add(new MenuList(R.drawable.chicken, "chicken", 140) );
        menu.add(new MenuList(R.drawable.medubada, "Welcome1", 20) );
        menu.add(new MenuList(R.drawable.idli, "Welcome2", 30 ));




    }
    private void initViews(){

        recyclerView = findViewById(R.id.rvRecycleView);
    }

}