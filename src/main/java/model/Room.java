/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinhp
 */
public class Room {
    private String maPhong;
    private String mahopdong;
    private int loaiPhong;
    private String moTa;
    private String trangThai;
    private int tang;

    public void setMahopdong(String mahopdong) {
        this.mahopdong = mahopdong;
    }

    public String getMahopdong() {
        return mahopdong;
    }

    public Room(String maPhong, int loaiPhong, String moTa, String trangThai,  int tang) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.tang = tang;
    }

    public Room(String maPhong, String mahopdong, int loaiPhong, String moTa, String trangThai, int tang) {
        this.maPhong = maPhong;
        this.mahopdong = mahopdong;
        this.loaiPhong = loaiPhong;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.tang = tang;
    }
    

   
    
    

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

   
    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

  
    public void setTang(int tang) {
        this.tang = tang;
    }




    public Room() {
    }

    public String getMaPhong() {
        return maPhong;
    }

   
    public int getLoaiPhong() {
        return loaiPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

  

    public int getTang() {
        return tang;
    }

}
