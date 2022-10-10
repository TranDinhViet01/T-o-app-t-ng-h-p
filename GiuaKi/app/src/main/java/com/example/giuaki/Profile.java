package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button Back;
    Button SignOut;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Back = (Button) findViewById(R.id.btn_back);
        SignOut = (Button) findViewById(R.id.btn_logout);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, TrangChu.class);
                startActivity(intent);
            }
        });
        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}