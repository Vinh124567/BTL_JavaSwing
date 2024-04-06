/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DichVu.Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import model.DichVu;
import model.Room;

/**
 *
 * @author vinhp
 */
public class DichVu_Controller extends ConnectDB {
    
   public ArrayList<DichVu> getDichVu() {
    ArrayList<DichVu> listDV = new ArrayList<>();
    try (Connection conn = getConnection();
         PreparedStatement psmt = conn.prepareStatement("SELECT * FROM dichvu");
         ResultSet rs = psmt.executeQuery()) {
        while (rs.next()) {
            DichVu a = new DichVu();
            a.setId(rs.getString("id"));
            a.setGia(rs.getInt("gia"));
            a.setTengoi(rs.getString("tengoi"));
            a.setMota(rs.getString("mota"));
            listDV.add(a);
        }
        System.out.println("Data retrieved successfully.");
    } catch (SQLException e) {
        System.out.println("Error while retrieving data: " + e.getMessage());
    }
    return listDV;
}
   
    public Map<String,String> getMaDichVu() {
        Map<String, String> DichVuMap = new HashMap<>();
        java.sql.Connection conn = getConnection();
        if (conn != null) {
            try {
                String sql = "SELECT * FROM dichvu";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String tenDichVu = resultSet.getString("tengoi");
                    DichVuMap.put(tenDichVu, id);
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
        return DichVuMap;
    }

    
}
