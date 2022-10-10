package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangChu extends AppCompatActivity {
    Button dn;
    Button dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        dn = findViewById(R.id.btn_actLogin_login);
        dk = findViewById(R.id.btn_actLogin_signup);

        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangChu.this, ListViewDS.class);
                startActivity(intent);
            }
        });
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangChu.this,Profile.class);
                startActivity(intent);
            }
        });
    }
}