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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import model.LoaiPhong;


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
     
    public Map<Integer,String > getLoaiPhongData1() {
        Map<Integer,String> loaiPhongMap = new HashMap<>();
        java.sql.Connection conn = getConnection();
        if (conn != null) {
            try {
                String sql = "SELECT * FROM loaiphong";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String tenLoaiPhong = resultSet.getString("name");
                    loaiPhongMap.put(id,tenLoaiPhong);
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
    
    public ArrayList<LoaiPhong> getLoaiPhong(){
         Connection conn = getConnection();
        ArrayList<LoaiPhong> listLoaiPhong = new ArrayList<>(); // Khởi tạo danh sách
        if (conn != null) {
            String query = "SELECT * FROM loaiphong"; // Truy vấn để lấy dữ liệu từ bảng phong
            try (PreparedStatement psmt = conn.prepareStatement(query);
                 ResultSet rs = psmt.executeQuery()) { // Thực hiện truy vấn SELECT và lấy kết quả
                while (rs.next()) {
                    LoaiPhong loaiphong = new LoaiPhong();
                    loaiphong.setId(rs.getInt("id"));
                    loaiphong.setTen(rs.getString("name"));
                    loaiphong.setGia(rs.getInt("gia"));
             
                    listLoaiPhong.add(loaiphong);
                }
                System.out.println("Data retrieved successfully.");
            } catch (SQLException e) {
                System.out.println("Error while retrieving data: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return listLoaiPhong;
    }
    
    public Boolean updateLoaiPhong(LoaiPhong loaiphong){
    Connection conn = getConnection();
    if (conn != null) {
        String query = "UPDATE loaiphong SET  name = ?, gia = ? where id=?";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
   
            psmt.setString(1, loaiphong.getTen());
            psmt.setInt(2,loaiphong.getGia());
            psmt.setInt(3, loaiphong.getId());
          
            int rowsUpdated = psmt.executeUpdate(); // Thực thi truy vấn cập nhật

            // Kiểm tra xem có bao nhiêu dòng đã được cập nhật
            if (rowsUpdated > 0) {
                System.out.println("Cập nhập loại phòng thành công.");
                return true; // Trả về true nếu cập nhật thành công
            } else {
                System.out.println("Không tìm thấy loại phòng để cập nhập.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi cập nhập: " + e.getMessage());
        }
    } else {
        System.out.println("Kết nối đến database thất bại.");
    }
    return false; // Trả về false nếu cập nhật không thành công
    }
    
    public Boolean insertLoaiPhong(LoaiPhong loaiphong){
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO loaiphong(name,gia) "
                     + "VALUES (?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1, loaiphong.getTen());
            psmt.setInt(2, loaiphong.getGia());

            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm loại phòng thành công.");
                return true; // Trả về true nếu thêm thành công
            } else {
                System.out.println("Thêm loại phòng thất bại.");
                return false; // Trả về false nếu thêm không thành công
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi thêm loai phòng: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    } else {
        System.out.println("Lỗi khi kết nối tới CSDL.");
        return false; // Trả về false nếu không thể kết nối đến cơ sở dữ liệu
    }
    }
    
    public Boolean deleteLoaiPhong(int id){
         Connection conn = getConnection();
        if (conn != null) {
            String query = "DELETE FROM loaiphong WHERE id = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                
                psmt.setInt(1,id);
                int rowsDeleted = psmt.executeUpdate(); // Thực thi truy vấn xóa

                // Kiểm tra xem có dòng nào đã bị xóa không
                if (rowsDeleted > 0) {
                    System.out.println("Xóa thành công.");
                    return true; // Trả về true nếu xóa thành công
                } else {
                    System.out.println("Không tìm thấy loại phòng cần xóa.");
                }
            } catch (SQLException e) {
                System.out.println("Lỗi trong khi xóa: " + e.getMessage());
            }
        } else {
            System.out.println("Lỗi kết nối tới CSDL.");
        }
        return false; // Trả về false nếu xóa không thành công
    }

}
