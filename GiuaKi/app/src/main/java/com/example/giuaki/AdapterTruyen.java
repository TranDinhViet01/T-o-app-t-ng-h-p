package com.example.giuaki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class AdapterTruyen extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Truyen> ListTruyen;

    public AdapterTruyen(Context context, int layout, List<Truyen> listTruyen) {
        this.context = context;
        this.layout = layout;
        ListTruyen = listTruyen;
    }

    @Override
    public int getCount() {
        return ListTruyen.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.Hinh);
        TextView textTen = (TextView) view.findViewById(R.id.TenTruyen);
        TextView textChuong = (TextView) view.findViewById(R.id.chuongTruyen);
        TextView textLuot = (TextView) view.findViewById(R.id.LuotTruyCap);
        Truyen truyen = ListTruyen.get(i);
        imgHinh.setImageResource(truyen.getHinh());
        textTen.setText(truyen.getTen());
        textChuong.setText(textChuong.getText()+truyen.getChuong());
        textLuot.setText(textLuot.getText()+truyen.getLuot());
        return view;
    }

}
