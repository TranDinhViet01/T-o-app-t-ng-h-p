package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaoTruyen extends AppCompatActivity {
    Button Back;
    Button AddDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_truyen);
        Back = (Button) findViewById(R.id.btn_Back);
        AddDS = (Button) findViewById(R.id.ThemDS);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaoTruyen.this ,ListViewDS.class);
                startActivity(intent);
            }
        });
        AddDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaoTruyen.this ,ListViewDS.class);
                startActivity(intent);
            }
        });
    }
}