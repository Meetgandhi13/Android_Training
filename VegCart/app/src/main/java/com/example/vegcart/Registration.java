package com.example.vegcart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity implements View.OnClickListener {
    Button BtnSubmit,Btn2LogIn;
    EditText EdtFullName,EdtuserName,EdtEmailId,EdtTxtPassword,EdtContactNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Btn2LogIn = findViewById(R.id.Btn2LogIn);
        Btn2LogIn.setOnClickListener(this);

        BtnSubmit = findViewById(R.id.BtnSubmit);
        BtnSubmit.setOnClickListener(this);

        EdtFullName = findViewById(R.id.EdtFullName);
        EdtuserName = findViewById(R.id.EdtuserName);
        EdtEmailId = findViewById(R.id.EdtEmailId);
        EdtTxtPassword = findViewById(R.id.EdtTxtPassword);
        EdtContactNo = findViewById(R.id.EdtFullName);

    }



            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registration.this, Login_Activity.class);
                startActivity(i);
                finish();
            }


    }

