package com.example.sony.training;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButtonGoToActivitySecond,mButtonOpenGoogleDotCom,mButtonOpenGallery,
                mButtonOpenCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initEvents();
    }

    private void initViews(){
        mButtonGoToActivitySecond = (Button) findViewById(R.id.btnGoToActivity2);
        mButtonOpenGoogleDotCom = (Button) findViewById(R.id.btnOpenGoogleDotCom);
        mButtonOpenGallery = (Button) findViewById(R.id.btnOpenGallery);
        mButtonOpenCamera = (Button) findViewById(R.id.btnOpenCamera);
    }

    private void initEvents(){
        mButtonGoToActivitySecond.setOnClickListener(this);
        mButtonOpenGoogleDotCom.setOnClickListener(this);
        mButtonOpenGallery.setOnClickListener(this);
        mButtonOpenCamera.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGoToActivity2:
                openActivitySecond();
                break;
            case R.id.btnOpenGoogleDotCom:
                break;
            case R.id.btnOpenGallery:
                break;
            case R.id.btnOpenCamera:
                break;
        }
    }

    private void openActivitySecond(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
