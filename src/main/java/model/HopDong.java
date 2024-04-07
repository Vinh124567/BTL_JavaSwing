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
public class HopDong {
    private java.util.Date ngayKi;
    private java.util.Date ngayHetHan;
    private String maHopDong;
    private String tenKhachHang;
    private java.util.Date ngaysinh;
    private String gioiTinh;
    private String sdt;
    private String email;
    private String diaChi;
    private int tienCoc;
   
    private String trangThai;
    private int giaDien;
    private int giaNuoc;
    private String maDichVu;
    private String cccd;
    
    private int giaphong;
    private String goidichvu;

    public HopDong(Date ngayKi, Date ngayHetHan, String maHopDong, String tenKhachHang, int tienCoc, String trangThai, int giaphong, String goidichvu, String maphong) {
        this.ngayKi = ngayKi;
        this.ngayHetHan = ngayHetHan;
        this.maHopDong = maHopDong;
        this.tenKhachHang = tenKhachHang;
        this.tienCoc = tienCoc;
        this.trangThai = trangThai;
        this.giaphong = giaphong;
        this.goidichvu = goidichvu;
        this.maphong = maphong;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public String getGoidichvu() {
        return goidichvu;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    public void setGoidichvu(String goidichvu) {
        this.goidichvu = goidichvu;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    
    private String maphong;

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }



    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienCoc(int tienCoc) {
        this.tienCoc = tienCoc;
    }

    

    

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setGiaDien(int giaDien) {
        this.giaDien = giaDien;
    }

    public void setGiaNuoc(int giaNuoc) {
        this.giaNuoc = giaNuoc;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

     public void setNgaySinh(java.util.Date ngayKi) {
        this.ngaysinh = ngaysinh;
    }

    public java.util.Date getNgaySinh() {
        return ngaysinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTienCoc() {
        return tienCoc;
    }

   public java.util.Date getNgayKi() {
        return ngayKi;
    }

    public void setNgayKi(java.util.Date ngayKi) {
        this.ngayKi = ngayKi;
    }

    public java.util.Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(java.util.Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getGiaDien() {
        return giaDien;
    }

    public int getGiaNuoc() {
        return giaNuoc;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public String getCccd() {
        return cccd;
    }

    public HopDong() {
    }

    
    
    public HopDong(String maHopDong, String tenKhachHang, Date ngaySinh, String gioiTinh, String sdt, String email, String diaChi, int tienCoc, Date ngayKi, Date ngayHetHan, String trangThai, int giaDien, int giaNuoc, String maDichVu, String cccd) {
        this.maHopDong = maHopDong;
        this.tenKhachHang = tenKhachHang;
        this.ngaysinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.tienCoc = tienCoc;
        this.ngayKi = ngayKi;
        this.ngayHetHan = ngayHetHan;
        this.trangThai = trangThai;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
        this.maDichVu = maDichVu;
        this.cccd = cccd;
    }

    
}
