/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loaiphong.controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import model.LoaiPhong;
import model.Room;

/**
 *
 * @author vinhp
 */
public class LoaiPhong_Controller  extends ConnectDB {

    public LoaiPhong_Controller() {
    }
    
    
     public Map<String, Integer> getLoaiPhongData() {
        Map<String, Integer> loaiPhongMap = new HashMap<>();
        java.sql.Connection conn = getConnection();
        if (conn != null) {
            try {
                String sql = "SELECT * FROM loaiphong";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String tenLoaiPhong = resultSet.getString("name");
                    loaiPhongMap.put(tenLoaiPhong, id);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return loaiPhongMap;
    }
     
    public LoaiPhong getGiaPhong(String maPhong) {
         LoaiPhong a=new LoaiPhong();
    Connection conn = getConnection();
    if (conn != null) {
        String query = "SELECT loaiphong.name as name, loaiphong.gia as gia,loaiphong.id as id FROM loaiphong INNER JOIN phong ON phong.loaiphong = loaiphong.id WHERE phong.maphong=?";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, maPhong);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
               
                a.setId(resultSet.getInt("id"));
                a.setGia(resultSet.getInt("gia"));
                a.setTen(resultSet.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return a;
}



}
