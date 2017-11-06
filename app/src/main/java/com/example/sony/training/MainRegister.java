package com.example.sony.training;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainRegister extends AppCompatActivity implements View.OnClickListener {

    private static final int GALLERY_REQUEST_CODE = 100;

    private EditText etRegisterName, etRegisterEmail, etRegisterPhone, etRegisterPass;
    private ImageView ivPhotos;
    private Button bRegister;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
        initEvents();
    }

    private void initViews() {
        etRegisterName = (EditText) findViewById(R.id.etRegisterNAS);
        etRegisterEmail = (EditText) findViewById(R.id.etLoginEA);
        etRegisterPhone = (EditText) findViewById(R.id.etRegisterP);
        etRegisterPass = (EditText) findViewById(R.id.etRegisterPW);

        ivPhotos = (ImageView) findViewById(R.id.ivRegister);

        bRegister = (Button) findViewById(R.id.bRegister);
    }

    private void initEvents() {
        ivPhotos.setOnClickListener(this);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivRegister:
                openGallery();
                break;
        }
    }

    private void openGallery() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GALLERY_REQUEST_CODE) {
            if (data != null) {
                Uri selectedImage = data.getData();
                Glide.with(MainRegister.this).load(selectedImage).into(ivPhotos);
            }
        }
    }
}
