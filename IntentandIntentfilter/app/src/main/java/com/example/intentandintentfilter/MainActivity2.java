package com.example.intentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
   private Button button;
   private EditText editTextTextPersonName5;
   private EditText editTextTextPersonName6;
   private EditText editTextTextPersonName7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name1 = intent.getStringExtra("edit1");
        String name2 = intent.getStringExtra("edit2");
        String name3 = intent.getStringExtra("edit3");
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5.setText(name1);
        editTextTextPersonName6.setText(name2);
        editTextTextPersonName7.setText(name3);
        Go_To_Main3();


    }
    public void Go_To_Main3(){
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

}