package com.example.vegcart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent i=new Intent(Splash_Screen.this, Registration.class);
                startActivity(i);
                finish();
            }
        },2500);

    }
}