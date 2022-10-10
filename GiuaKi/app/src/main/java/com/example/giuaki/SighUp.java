package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SighUp extends AppCompatActivity {
    Button dknx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh_up);
        dknx = findViewById(R.id.btn_signup);
        dknx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SighUp.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

