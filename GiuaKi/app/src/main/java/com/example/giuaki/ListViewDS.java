package com.example.giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewDS extends AppCompatActivity {
    ListView lv;
    ArrayList<Truyen> ArrayTruyen;
    AdapterTruyen adapter;
    EditText truyen;
    Button Back;
    Button Add;
    Button AddTruyen;
    int stop = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv = (ListView) findViewById(R.id.listview);
        Back = (Button) findViewById(R.id.btn_Back);
        Add = (Button) findViewById(R.id.btn_Add);
        AddTruyen = (Button) findViewById(R.id.AddTruyen);
        truyen = (EditText) findViewById(R.id.EditTruyen);
        ArrayTruyen = new ArrayList<>();
        ArrayTruyen.add(new Truyen( R.drawable.items,"Trò Chơi Này Cũng Quá Chân Thật","1008","0"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Bảo Tàng Thợ Săn","580","0"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Vô Cùng Đơn Giản Luyện Cái Võ","245","0"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Người Tại Thần Quỷ, Nhục Thân Vô Hạn Thôi Diễn","67","0"));
        ArrayTruyen.add(new Truyen( R.drawable.items,"Trấn Long Đình","849","0"));
        adapter = new AdapterTruyen(ListViewDS.this, R.layout.activity_items, ArrayTruyen);
        lv.setAdapter(adapter);
        View dk = findViewById(R.id.btn_Profile);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewDS.this, Profile.class);
                startActivity(intent);
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(stop == 0) {
                    Intent intent = new Intent(ListViewDS.this, TaoTruyen.class);
                    startActivity(intent);
                }
                else
                    stop = 0;
            }
        });
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                stop = 1;
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ListViewDS.this);
                alertDialog.setTitle("Thông Báo!");
                alertDialog.setMessage("Bạn có chắc chắn muốn xóa Items này?");
                int so = i;
                alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ArrayTruyen.remove(so);
                        adapter.notifyDataSetChanged();
                    }
                });
                alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDialog.show();
                return false;
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewDS.this, TrangChu.class);
                startActivity(intent);
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout layout = (LinearLayout) findViewById(R.id.Add);
                if(layout.getVisibility()==view.VISIBLE)
                    layout.setVisibility(view.GONE);
                else
                    layout.setVisibility(view.VISIBLE);
            }
        });
        AddTruyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenTruyen = truyen.getText().toString();
                ArrayTruyen.add(new Truyen( R.drawable.items,tenTruyen,"0","0"));
                adapter.notifyDataSetChanged();
            }
        });


    }
}