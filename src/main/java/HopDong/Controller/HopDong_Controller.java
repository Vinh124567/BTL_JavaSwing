/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HopDong.Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Room;


public class HopDong_Controller  extends ConnectDB{
    
public boolean addHopDong(HopDong hopdong,String maphong) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO hopdong(mahopdong, tenkhachhang,ngaysinh,gioitinh,sdt, email,diachi,tiencoc,ngayki,ngayhethan,trangthai,giadien,gianuoc,madichvu,cccd) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?)";
          String updatePhongQuery = "UPDATE phong SET mahopdong = ? WHERE maphong = ?";
        try (PreparedStatement psmt = conn.prepareStatement(query);
                 PreparedStatement updatePhongPsmt = conn.prepareStatement(updatePhongQuery);) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1, hopdong.getMaHopDong());
            psmt.setString(2, hopdong.getTenKhachHang());
            psmt.setDate(3, new java.sql.Date(hopdong.getNgaySinh().getTime())); // Chuyển đổi từ java.util.Date sang java.sql.Date
            psmt.setString(4, hopdong.getGioiTinh());
            psmt.setString(5, hopdong.getSdt());
            psmt.setString(6, hopdong.getEmail());
            psmt.setString(7, hopdong.getDiaChi());
            psmt.setInt(8, hopdong.getTienCoc());
            psmt.setDate(9, new java.sql.Date(hopdong.getNgayKi().getTime())); // Chuyển đổi ngày ki từ java.util.Date sang java.sql.Date
            psmt.setDate(10, new java.sql.Date(hopdong.getNgayHetHan().getTime())); // Chuyển đổi ngày hết hạn từ java.util.Date sang java.sql.Date
            psmt.setString(11, hopdong.getTrangThai());
            psmt.setInt(12, hopdong.getGiaDien());
            psmt.setInt(13, hopdong.getGiaNuoc());
            psmt.setString(14, hopdong.getMaDichVu());
            psmt.setString(15, hopdong.getCccd());
            
            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Tạo hợp đồng thành công.");
                 updatePhongPsmt.setString(1, hopdong.getMaHopDong());
                 updatePhongPsmt.setString(2, maphong);
                  int rowsUpdatedPhong = updatePhongPsmt.executeUpdate();
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
                    hopdong.setNgaySinh(rs.getDate("ngaysinh"));
                    hopdong.setGioiTinh(rs.getString("gioitinh"));
                    hopdong.setSdt(rs.getString("sdt"));
                    hopdong.setEmail(rs.getString("email"));
                    hopdong.setDiaChi(rs.getString("diachi"));
                    hopdong.setTienCoc(rs.getInt("tiencoc"));
                    hopdong.setNgayKi(rs.getDate("ngayki"));
                    hopdong.setNgayHetHan(rs.getDate("ngayhethan"));
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

    public List<HopDong> getAllHopDong() {
        List<HopDong> hopDongList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection(); // Kết nối tới cơ sở dữ liệu
            
            // Câu truy vấn để lấy tất cả các hợp đồng
            String query = "SELECT hopdong.*, loaiphong.name AS tenloaiphong, phong.tang AS tang, phong.maphong AS maphong, "
                         + "dichvu.tengoi AS tengoidichvu, dichvu.id AS iddichvu, loaiphong.gia AS giaphong "
                         + "FROM hopdong "
                         + "INNER JOIN phong ON hopdong.mahopdong = phong.mahopdong "
                         + "INNER JOIN loaiphong ON phong.loaiphong = loaiphong.id "
                         + "INNER JOIN dichvu ON hopdong.madichvu = dichvu.id";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            // Duyệt qua kết quả trả về và tạo đối tượng HopDong từ mỗi hàng
            while (rs.next()) {
                HopDong hopDong = new HopDong();
                hopDong.setMaHopDong(rs.getString("mahopdong"));
                hopDong.setMaphong(rs.getString("maphong"));
                hopDong.setTenKhachHang(rs.getString("tenkhachhang"));
                hopDong.setNgayKi(rs.getDate("ngayki"));
                hopDong.setNgayHetHan(rs.getDate("ngayhethan"));
                hopDong.setTienCoc(rs.getInt("tiencoc"));
                hopDong.setGoidichvu(rs.getString("tengoidichvu"));
                hopDong.setTrangThai(rs.getString("trangthai"));
                hopDong.setGiaphong(rs.getInt("giaphong"));
  
                hopDongList.add(hopDong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
        }
        
        return hopDongList;
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
    
public boolean checkQueryResult(String id) {
    Connection conn = getConnection();
    String query = "SELECT * FROM hopdong "
            + "INNER JOIN hoadon ON hopdong.mahopdong = hoadon.mahopdong "
            + "WHERE hopdong.mahopdong = ? and hoadon.trangthai='Chưa thanh toán'";
    try (PreparedStatement psmt = conn.prepareStatement(query)) {
        psmt.setString(1, id);
        try (ResultSet resultSet = psmt.executeQuery()) {
            if (resultSet.next()) {
                return true; 
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; 
}


 public boolean updateTrangThai(String id) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "UPDATE hopdong SET trangthai = 'Hết hạn' WHERE mahopdong = ?";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setString(1, id);
            int rowsUpdated = psmt.executeUpdate(); 
            if (rowsUpdated > 0) {
                System.out.println("Cập nhật hợp đồng thành công.");
                return true;
            } else {
                System.out.println("Không tìm thấy hợp đồng để cập nhật.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi cập nhật: " + e.getMessage());
        }
    } else {
        System.out.println("Kết nối đến cơ sở dữ liệu thất bại.");
    }
    return false; // Trả về false nếu cập nhật không thành công
}

}


