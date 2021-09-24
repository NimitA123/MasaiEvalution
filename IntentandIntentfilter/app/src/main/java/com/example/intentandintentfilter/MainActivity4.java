package com.example.intentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("Second_App");
                intent.setType("plain/text");
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> activitiesList = packageManager.queryIntentActivities(intent, 0);
                if (activitiesList.size() >= 1) {
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity4.this, "No such App found!", Toast.LENGTH_LONG).show();
                    // No activity found to handle email intent
                }
            }
        });
    }
}