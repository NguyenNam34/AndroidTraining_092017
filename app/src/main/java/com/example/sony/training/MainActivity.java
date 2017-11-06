package com.example.sony.training;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etEmailAddress, etPassword;
    private Button bLogin;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
        initEvents();
    }

    private void initViews() {
        etEmailAddress = (EditText) findViewById(R.id.etLoginEA);
        etPassword = (EditText) findViewById(R.id.etLoginPW);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegister = (TextView) findViewById(R.id.tvLoginR);
    }

    private void initEvents() {
        bLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bLogin:
                openSuccessLogin();
                break;
            case R.id.tvLoginR:
                openMainRegister();
                break;
        }
    }

    private void openMainRegister() {
        Intent intent = new Intent(this, MainRegister.class);
        startActivity(intent);
    }

    private void openSuccessLogin() {
        String email = etEmailAddress.getText().toString();
        String pass = etPassword.getText().toString();
        if (email.equals("nam@gmail.com") && pass.equals("123qwe")) {
            Intent intent = new Intent(this, SuccessLogin.class);
            startActivity(intent);
        }

    }
}
