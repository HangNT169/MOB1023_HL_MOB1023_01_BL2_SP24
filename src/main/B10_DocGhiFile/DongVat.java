/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B10_DocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class DongVat implements Serializable{ // DUNG DE LAM VIEC DOC GHI VAO FILE 
    // IMPLEMENT SERIALIZABLE => THEM DUNG THU TU VAO FILE K BI LON XON VA DAO DU LIEU

    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDongVat, String tenDongVat, int canNang, boolean gioiTinh) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
