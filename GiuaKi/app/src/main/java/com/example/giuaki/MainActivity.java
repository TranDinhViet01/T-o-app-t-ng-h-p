package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button dn;
    Button dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dn = findViewById(R.id.btn_actLogin_login);
        dk = findViewById(R.id.btn_actLogin_signup);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TrangChu.class);
                startActivity(intent);
            }
        });
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SighUp.class);
                startActivity(intent);
            }
        });
    }
}