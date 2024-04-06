/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinhp
 */
public class LoaiPhong {
     private int id;
    private String ten;
    int gia;

    public LoaiPhong(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public LoaiPhong(int id, String ten, int gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public LoaiPhong() {
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    

}
