package com.example.vegcart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

    Button BtnSignIn,Btn2SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        BtnSignIn=findViewById(R.id.BtnSignIn);
        Btn2SignUp=findViewById(R.id.Btn2SignUp);


        BtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_Activity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        Btn2SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_Activity.this, Registration.class);
                startActivity(i);
                finish();
            }
        });

    }
}