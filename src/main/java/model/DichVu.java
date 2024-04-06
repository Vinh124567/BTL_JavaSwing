/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinhp
 */
public class DichVu {
    String id;
    String tengoi;
    int gia;
    String mota;

    public DichVu() {
    }

    public DichVu(String id, String tengoi, int gia, String mota) {
        this.id = id;
        this.tengoi = tengoi;
        this.gia = gia;
        this.mota = mota;
    }

    public String getId() {
        return id;
    }

    public String getTengoi() {
        return tengoi;
    }

    public int getGia() {
        return gia;
    }

    public String getMota() {
        return mota;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTengoi(String tengoi) {
        this.tengoi = tengoi;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

   

   

    
}
