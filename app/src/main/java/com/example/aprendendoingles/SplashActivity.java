package com.example.aprendendoingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {splashScreen();}},3000);
    }

    private void splashScreen(){
        Intent i = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i);
        finish();
    }

}