/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author vinhp
 */
public class HoaDon {
    String mahoadon;
    String tenkhachhang;
    int giadichvu;
    String maphong;
    String tendichvu;
    int giaphong;
    String mahopdong;
    java.util.Date ngaytao;
    int tongtien;
    int dien;
    int nuoc;
    String trangthai;

    public HoaDon(String mahoadon, String mahopdong, Date ngaytao, int tongtien, int dien, int nuoc, String trangthai) {
        this.mahoadon = mahoadon;
        this.mahopdong = mahopdong;
        this.ngaytao = ngaytao;
        this.tongtien = tongtien;
        this.dien = dien;
        this.nuoc = nuoc;
        this.trangthai = trangthai;
    }
    
    

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public void setGiadichvu(int giadichvu) {
        this.giadichvu = giadichvu;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    public void setMahopdong(String mahopdong) {
        this.mahopdong = mahopdong;
    }

    public void setNgaytao(java.util.Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public void setDien(int dien) {
        this.dien = dien;
    }

    public void setNuoc(int nuoc) {
        this.nuoc = nuoc;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public HoaDon(String mahoadon, String tenkhachhang, int giadichvu, String maphong, String tendichvu, int giaphong, String mahopdong, Date ngaytao, int tongtien, int dien, int nuoc, String trangthai) {
        this.mahoadon = mahoadon;
        this.tenkhachhang = tenkhachhang;
        this.giadichvu = giadichvu;
        this.maphong = maphong;
        this.tendichvu = tendichvu;
        this.giaphong = giaphong;
        this.mahopdong = mahopdong;
        this.ngaytao = ngaytao;
        this.tongtien = tongtien;
        this.dien = dien;
        this.nuoc = nuoc;
        this.trangthai = trangthai;
    }

    public HoaDon() {
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public int getGiadichvu() {
        return giadichvu;
    }

    public String getMaphong() {
        return maphong;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public String getMahopdong() {
        return mahopdong;
    }

    public java.util.Date getNgaytao() {
        return ngaytao;
    }

    public int getTongtien() {
        return tongtien;
    }

    public int getDien() {
        return dien;
    }

    public int getNuoc() {
        return nuoc;
    }

    public String getTrangthai() {
        return trangthai;
    }

    


}
