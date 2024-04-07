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
import model.LoaiPhong;
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
   
    public Boolean updateDichVu(DichVu dichvu){
    Connection conn = getConnection();
    if (conn != null) {
        String query = "UPDATE dichvu SET  tengoi = ?, gia = ? , mota=? where id=?";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
   
            psmt.setString(1, dichvu.getTengoi());
            psmt.setInt(2,dichvu.getGia());
            psmt.setString(3, dichvu.getMota());
            psmt.setString(4,dichvu.getId());

          
            int rowsUpdated = psmt.executeUpdate(); // Thực thi truy vấn cập nhật

            // Kiểm tra xem có bao nhiêu dòng đã được cập nhật
            if (rowsUpdated > 0) {
                System.out.println("Cập nhập dịch vụ thành công.");
                return true; // Trả về true nếu cập nhật thành công
            } else {
                System.out.println("Không tìm thấy dịch vụ để cập nhập.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi cập nhập: " + e.getMessage());
        }
    } else {
        System.out.println("Kết nối đến database thất bại.");
    }
    return false; // Trả về false nếu cập nhật không thành công
    }
    
    public Boolean insertDichVu(DichVu dichvu){
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO dichvu(id,tengoi,gia,mota) "
                     + "VALUES (?,?, ?,?)";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1,dichvu.getId());
            psmt.setString(2,dichvu.getTengoi());
            psmt.setInt(3,dichvu.getGia());
            psmt.setString(4,dichvu.getMota());

            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm dịch vụ thành công.");
                return true; // Trả về true nếu thêm thành công
            } else {
                System.out.println("Thêm dịch vụ thất bại.");
                return false; // Trả về false nếu thêm không thành công
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi thêm dịch vụ: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    } else {
        System.out.println("Lỗi khi kết nối tới CSDL.");
        return false; // Trả về false nếu không thể kết nối đến cơ sở dữ liệu
    }
    }
    
    public Boolean deleteDichVu(String id){
         Connection conn = getConnection();
        if (conn != null) {
            String query = "DELETE FROM dichvu WHERE id = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                
                psmt.setString(1,id);
                int rowsDeleted = psmt.executeUpdate(); // Thực thi truy vấn xóa

                // Kiểm tra xem có dòng nào đã bị xóa không
                if (rowsDeleted > 0) {
                    System.out.println("Xóa thành công.");
                    return true; // Trả về true nếu xóa thành công
                } else {
                    System.out.println("Không tìm thấy dịch vụ cần xóa.");
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
