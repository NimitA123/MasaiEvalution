package com.example.intentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private EditText editTextTextPersonName3;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,  MainActivity2.class);
             editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
             editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
             editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
             intent.putExtra("edit1", editTextTextPersonName3.getText().toString());
             intent.putExtra("edit2", editTextTextPersonName2.getText().toString());
             intent.putExtra("edit3", editTextTextPersonName4.getText().toString());


             startActivity(intent);
            }
        });
    }
}