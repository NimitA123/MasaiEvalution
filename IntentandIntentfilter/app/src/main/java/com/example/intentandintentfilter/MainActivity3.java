package com.example.intentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    public static final int CAMERA_PIC_REQUEST = 1;//firstly define this
    private Button btn;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.button_camera);
        btn1 = findViewById(R.id.button4);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_camera:
                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(photo);
                break;


            case R.id.button4:
                // do your code
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
                break;
            
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}