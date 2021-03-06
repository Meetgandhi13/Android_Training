package com.example.android_technical_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button MainClick1, MainClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainClick1 = findViewById(R.id.MainClick1);
        MainClick2 = findViewById(R.id.MainClick2);


        MainClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Videos Added in Database",Toast.LENGTH_SHORT).show();
            }
        });

        MainClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, activity_video_list.class);
                startActivity(i);
            }
        });
    }
}