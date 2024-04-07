/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon_Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import model.HoaDon;
import model.HopDong;
import model.Room;


/**
 *
 * @author vinhp
 */
public class HoaDon_Controller extends ConnectDB {

public HoaDon getHoaDonById(String id) {
    Connection conn = getConnection();
    HoaDon hoadon = null;
    if (conn != null) {
        String query = 
            "SELECT hoadon.*, dichvu.gia AS giadichvu, hopdong.mahopdong AS mahopdong, loaiphong.gia AS giaphong, hopdong.tenkhachhang AS tenkhachhang, dichvu.tengoi AS tendichvu, phong.maphong AS maphong\n" +
            "FROM hoadon\n" +
            "INNER JOIN hopdong ON hoadon.mahopdong = hopdong.mahopdong\n" +
            "INNER JOIN phong ON phong.mahopdong = hopdong.mahopdong\n" +
            "INNER JOIN dichvu ON hopdong.madichvu = dichvu.id\n" +
            "INNER JOIN loaiphong ON phong.loaiphong = loaiphong.id\n" +
            "WHERE hoadon.mahoadon = ?;";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setString(1, id);
            try (ResultSet rs = psmt.executeQuery()) {
                while (rs.next()) {
                    hoadon = new HoaDon(); // Tạo một đối tượng mới trong mỗi vòng lặp
                    hoadon.setMahopdong(rs.getString("mahopdong"));
                    hoadon.setTenkhachhang(rs.getString("tenkhachhang"));
                    hoadon.setGiaphong(rs.getInt("giaphong"));
                    hoadon.setNgaytao(rs.getDate("ngaytao"));
                    hoadon.setTrangthai(rs.getString("trangthai"));
                    hoadon.setMaphong(rs.getString("maphong"));
                    hoadon.setTongtien(rs.getInt("tongtien"));
                    hoadon.setDien(rs.getInt("dien"));
                    hoadon.setNuoc(rs.getInt("nuoc"));
                    hoadon.setTrangthai(rs.getString("trangthai"));
                    hoadon.setGiadichvu(rs.getInt("giadichvu"));
                    hoadon.setTendichvu(rs.getString("tendichvu"));
                    hoadon.setMahoadon(rs.getString("mahoadon"));
                }
                System.out.println("Data retrieved successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving data: " + e.getMessage());
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return hoadon;
}

public boolean addHoaDon(HoaDon hoadon) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO hoadon(mahoadon,mahopdong,ngaytao,dien,nuoc,tongtien,trangthai) "
                     + "VALUES (?, ?, ?, ?, ?,?,?)";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1, hoadon.getMahoadon());
            psmt.setString(2, hoadon.getMahopdong());
            psmt.setDate(3,new java.sql.Date(hoadon.getNgaytao().getTime()));
            psmt.setInt(4, hoadon.getDien());
            psmt.setInt(5, hoadon.getNuoc());
            psmt.setInt(6, hoadon.getTongtien());
            psmt.setString(7, hoadon.getTrangthai());
            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm hóa đơn thành công.");
                return true; // Trả về true nếu thêm thành công
            } else {
                System.out.println("Thêm hóa đơn thất bạu.");
                return false; // Trả về false nếu thêm không thành công
            }
        } catch (SQLException e) {
            System.out.println("Lỗi trong khi thêm: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    } else {
        System.out.println("Thất bại trong khi thêm.");
        return false; // Trả về false nếu không thể kết nối đến cơ sở dữ liệu
    }
}

public ResultSet getDetailRoomById(String id) {
    Connection conn = getConnection();
    ResultSet resultSet = null;
    try {
        String query =
            "SELECT hopdong.*, loaiphong.name AS tenloaiphong, phong.tang AS tang, phong.maphong AS maphong, " +
            "dichvu.tengoi AS tendichvu, dichvu.gia AS giadichvu, loaiphong.gia AS giaphong " +
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

public ArrayList<HoaDon> getAllHoaDon(String id) {
    Connection conn = getConnection();
    ArrayList<HoaDon> listHoaDon = new ArrayList<>(); // Khởi tạo danh sách
    if (conn != null) {
        String query;
        if (id != null && !id.isEmpty()) {
            query = "SELECT hoadon.*, phong.maphong AS maphong, hopdong.tenkhachhang " +
                    "FROM hoadon " +
                    "INNER JOIN phong ON hoadon.mahopdong = phong.mahopdong " +
                    "INNER JOIN hopdong ON hoadon.mahopdong = hopdong.mahopdong " +
                    "WHERE hoadon.mahopdong = ?";
        } else {
            query = "SELECT hoadon.*, phong.maphong AS maphong, hopdong.tenkhachhang " +
                    "FROM hoadon " +
                    "INNER JOIN phong ON hoadon.mahopdong = phong.mahopdong " +
                    "INNER JOIN hopdong ON hoadon.mahopdong = hopdong.mahopdong ";
        }
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            if (id != null && !id.isEmpty()) {
                psmt.setString(1, id);
            }
            try (ResultSet rs = psmt.executeQuery()) {
                while (rs.next()) {
                    // Tạo đối tượng HoaDon từ dữ liệu trong kết quả
                    HoaDon hoadon = new HoaDon();
                    hoadon.setMahoadon(rs.getString("mahoadon"));
                    hoadon.setMahopdong(rs.getString("mahopdong"));
                    hoadon.setMaphong(rs.getString("maphong"));
                    hoadon.setTenkhachhang(rs.getString("tenkhachhang"));
                    hoadon.setNgaytao(rs.getDate("ngaytao"));
                    hoadon.setTongtien(rs.getInt("tongtien"));
                    hoadon.setTrangthai(rs.getString("trangthai"));
                    listHoaDon.add(hoadon);
                }
                System.out.println("Data retrieved successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving data: " + e.getMessage());
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return listHoaDon;
}

public ArrayList<HoaDon> getAllHoaDonThanhToan() {
    Connection conn = getConnection();
    ArrayList<HoaDon> listHoaDon = new ArrayList<>(); // Khởi tạo danh sách
    if (conn != null) {
        String query = "SELECT hoadon.*, phong.maphong AS maphong, hopdong.tenkhachhang " +
                       "FROM hoadon " +
                       "INNER JOIN phong ON hoadon.mahopdong = phong.mahopdong " +
                       "INNER JOIN hopdong ON hoadon.mahopdong = hopdong.mahopdong " +
                       "WHERE hoadon.trangthai = 'Đã thanh toán'";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            try (ResultSet rs = psmt.executeQuery()) {
                while (rs.next()) {
                    HoaDon hoadon = new HoaDon();
                    hoadon.setMahoadon(rs.getString("mahoadon"));
                    hoadon.setMahopdong(rs.getString("mahopdong"));
                    hoadon.setMaphong(rs.getString("maphong"));
                    hoadon.setTenkhachhang(rs.getString("tenkhachhang"));
                    hoadon.setNgaytao(rs.getDate("ngaytao"));
                    hoadon.setTongtien(rs.getInt("tongtien"));
                    hoadon.setTrangthai(rs.getString("trangthai"));
                    listHoaDon.add(hoadon);
                }
                System.out.println("Data retrieved successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving data: " + e.getMessage());
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return listHoaDon;
}

public ArrayList<HoaDon> getAllHoaDonChuaThanhToan() {
    Connection conn = getConnection();
    ArrayList<HoaDon> listHoaDon = new ArrayList<>(); // Khởi tạo danh sách
    if (conn != null) {
        String query = "SELECT hoadon.*, phong.maphong AS maphong, hopdong.tenkhachhang " +
                       "FROM hoadon " +
                       "INNER JOIN phong ON hoadon.mahopdong = phong.mahopdong " +
                       "INNER JOIN hopdong ON hoadon.mahopdong = hopdong.mahopdong " +
                       "WHERE hoadon.trangthai = 'Chưa thanh toán'";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            try (ResultSet rs = psmt.executeQuery()) {
                while (rs.next()) {
                    HoaDon hoadon = new HoaDon();
                    hoadon.setMahoadon(rs.getString("mahoadon"));
                    hoadon.setMahopdong(rs.getString("mahopdong"));
                    hoadon.setMaphong(rs.getString("maphong"));
                    hoadon.setTenkhachhang(rs.getString("tenkhachhang"));
                    hoadon.setNgaytao(rs.getDate("ngaytao"));
                    hoadon.setTongtien(rs.getInt("tongtien"));
                    hoadon.setTrangthai(rs.getString("trangthai"));
                    listHoaDon.add(hoadon);
                }
                System.out.println("Data retrieved successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving data: " + e.getMessage());
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return listHoaDon;
}


 public boolean deletehoaDon(String id){
        Connection conn = getConnection();
        if (conn != null) {
            String query = "DELETE FROM hoadon WHERE mahoadon = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                // Thiết lập giá trị tham số cho câu lệnh SQL
                psmt.setString(1, id);
                int rowsDeleted = psmt.executeUpdate(); // Thực thi truy vấn xóa

                // Kiểm tra xem có dòng nào đã bị xóa không
                if (rowsDeleted > 0) {
                    System.out.println("Xóa hóa đơn thành công .");
                    return true; // Trả về true nếu xóa thành công
                } else {
                    System.out.println("Không tìm thấy hóa đơn cần xóa.");
                }
            } catch (SQLException e) {
                System.out.println("Lỗi : " + e.getMessage());
            }
        } else {
            System.out.println("Kết nối CSDL thất bại .");
        }
        return false; // Trả về false nếu xóa không thành công
    }
    
 public boolean updateHoaDon(HoaDon hoadon) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "UPDATE hoadon SET  mahoadon = ? , ngaytao=? ,  dien= ?, nuoc = ?, tongtien = ? , trangthai=? WHERE mahoadon = ?";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập giá trị tham số cho câu lệnh SQL
            psmt.setString(1, hoadon.getMahoadon());
            psmt.setDate(2, new java.sql.Date(hoadon.getNgaytao().getTime()));
            psmt.setInt(3, hoadon.getDien());
            psmt.setInt(4, hoadon.getNuoc());
            psmt.setInt(5,hoadon.getTongtien());
            psmt.setString(6,hoadon.getTrangthai());
            psmt.setString(7,hoadon.getMahoadon());
            int rowsUpdated = psmt.executeUpdate(); // Thực thi truy vấn cập nhật

            // Kiểm tra xem có bao nhiêu dòng đã được cập nhật
            if (rowsUpdated > 0) {
                System.out.println("Cập nhập hóa đơn thành công.");
                return true; // Trả về true nếu cập nhật thành công
            } else {
                System.out.println("Cập nhập hóa đơn thất bại.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhập hóa đơn: " + e.getMessage());
        }
    } else {
        System.out.println("Kết nối CSDL thất bại.");
    }
    return false; // Trả về false nếu cập nhật không thành công
}


}

