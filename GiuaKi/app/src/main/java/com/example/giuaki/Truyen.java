package com.example.giuaki;

public class Truyen {
    private int hinh;
    private String ten;
    private String chuong;
    private String luot;

    public String getLuot() {
        return luot;
    }

    public void setLuot(String luot) {
        this.luot = luot;
    }

    public Truyen(int hinh, String ten, String chuong, String luot) {
        this.hinh = hinh;
        this.ten = ten;
        this.chuong = chuong;
        this.luot = luot;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuong() {
        return chuong;
    }

    public void setChuong(String chuong) {
        this.chuong = chuong;
    }
}
