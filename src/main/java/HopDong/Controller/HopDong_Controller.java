/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HopDong.Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Room;

/**
 *
 * @author vinhp
 */
public class HopDong_Controller  extends ConnectDB{
    
    public boolean addHopDong(HopDong hopdong) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO hopdong(mahopdong, tenkhachhang,ngaysinh,gioitinh,sdt, email,diachi,tiencoc,ngayki,ngayhethan,trangthai,giadien,gianuoc,madichvu,cccd) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1, hopdong.getMaHopDong());
            psmt.setString(2, hopdong.getTenKhachHang());
            psmt.setString(3, hopdong.getNgaySinh()); // Chuyển đổi từ java.util.Date sang java.sql.Date
            psmt.setString(4, hopdong.getGioiTinh());
            psmt.setString(5, hopdong.getSdt());
            psmt.setString(6, hopdong.getEmail());
            psmt.setString(7, hopdong.getDiaChi());
            psmt.setInt(8, hopdong.getTienCoc());
            psmt.setString(9, hopdong.getNgayKi());
            psmt.setString(10, hopdong.getNgayHetHan());
            psmt.setString(11, hopdong.getTrangThai());
            psmt.setInt(12, hopdong.getGiaDien());
            psmt.setInt(13, hopdong.getGiaNuoc());
            psmt.setString(14, hopdong.getMaDichVu());
            psmt.setString(15, hopdong.getCccd());
            
            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Tạo hợp đồng thành công.");
                return true; // Trả về true nếu thêm thành công
            } else {
                System.out.println("Tạo thất bạt.");
                return false; // Trả về false nếu thêm không thành công
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi thêm: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
        return false; // Trả về false nếu không thể kết nối đến cơ sở dữ liệu
    }
}

    public ResultSet displayDataHopDongForm(String id) {
             Connection conn = getConnection();
             ResultSet resultSet = null;
             try {
                 String query =
                     "SELECT hopdong.*, loaiphong.name AS tenloaiphong,phong.tang as tang ,phong.maphong as maphong," +
                     "dichvu.tengoi AS tengoidichvu, dichvu.id AS iddichvu, " +
                     "loaiphong.gia AS giaphong " +
                     "FROM hopdong " +
                     "INNER JOIN phong ON hopdong.mahopdong = phong.mahopdong " +
                     "INNER JOIN loaiphong ON phong.loaiphong = loaiphong.id " +
                     "INNER JOIN dichvu ON hopdong.madichvu = dichvu.id " +
                     "WHERE phong.maphong = ?";
                 PreparedStatement statement = conn.prepareStatement(query);
                 statement.setString(1, id); // Truyền tham số vào câu truy vấn
                 resultSet = statement.executeQuery();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             return resultSet;
         }
    
    public ArrayList<HopDong>  getHopDong(){
         Connection conn = getConnection();
        ArrayList<HopDong> listHopDong = new ArrayList<>(); // Khởi tạo danh sách
        if (conn != null) {
            String query = "SELECT * FROM hopdong"; // Truy vấn để lấy dữ liệu từ bảng phong
            try (PreparedStatement psmt = conn.prepareStatement(query);
                 ResultSet rs = psmt.executeQuery()) { // Thực hiện truy vấn SELECT và lấy kết quả
                while (rs.next()) {
                    // Tạo đối tượng Room từ dữ liệu trong kết quả
                    HopDong hopdong = new HopDong();
                    hopdong.setMaHopDong(rs.getString("mahopdong"));
                    hopdong.setTenKhachHang(rs.getString("tenkhachhang"));
                    hopdong.setNgaySinh(rs.getString("ngaysinh"));
                    hopdong.setGioiTinh(rs.getString("gioitinh"));
                    hopdong.setSdt(rs.getString("sdt"));
                    hopdong.setEmail(rs.getString("email"));
                    hopdong.setDiaChi(rs.getString("diachi"));
                    hopdong.setTienCoc(rs.getInt("tiencoc"));
                    hopdong.setNgayKi(rs.getString("ngayki"));
                    hopdong.setNgayHetHan(rs.getString("ngayhethan"));
                    hopdong.setTrangThai(rs.getString("trangthai"));
                    hopdong.setGiaDien(rs.getInt("giadien"));
                    hopdong.setGiaNuoc(rs.getInt("gianuoc"));
                    hopdong.setMaDichVu(rs.getString("madichvu"));
                    hopdong.setCccd(rs.getString("cccd"));
                    listHopDong.add(hopdong);
                }
                System.out.println("Data retrieved successfully.");
            } catch (SQLException e) {
                System.out.println("Error while retrieving data: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return listHopDong;
    }
    
    public boolean deleteHopDong(String id) {
        Connection conn = getConnection();
        if (conn != null) {
            String query = "DELETE FROM hopdong WHERE mahopdong = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                // Thiết lập giá trị tham số cho câu lệnh SQL
                psmt.setString(1, id);
                int rowsDeleted = psmt.executeUpdate(); // Thực thi truy vấn xóa

                // Kiểm tra xem có dòng nào đã bị xóa không
                if (rowsDeleted > 0) {
                    System.out.println("Contract deleted successfully.");
                    return true; // Trả về true nếu xóa thành công
                } else {
                    System.out.println("Contract not found or failed to delete.");
                }
            } catch (SQLException e) {
                System.out.println("Error while deleting Contract: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return false; // Trả về false nếu xóa không thành công
    }

}


