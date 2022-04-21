package com.example.android_technical_test;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

public class activity_video_list extends Activity {
    private RecyclerView recyclerView;
    private RecyclerAdapter RecyclerAdapter;
    private Uri fileUri;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter = new RecyclerAdapter(this);

        recyclerView.setAdapter(RecyclerAdapter);


    }
}
