package com.example.androidtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class SplashScreen extends AppCompatActivity {


    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent i = new Intent(SplashScreen.this, FirstPageOfClick.class);
                startActivity(i);
                finish();
            }
        },5000);

    }
}