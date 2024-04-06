/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Room.Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Room;

/**
 *
 * @author vinhp
 */
public class Room_Controller extends ConnectDB {
    
    public boolean addRoom(Room room) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "INSERT INTO phong(maphong, loaiphong, mota, trangthai, tang) "
                     + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu lệnh INSERT
            psmt.setString(1, room.getMaPhong());
            psmt.setInt(2, room.getLoaiPhong());
            psmt.setString(3, room.getMoTa());
            psmt.setString(4, room.getTrangThai());
            psmt.setInt(5, room.getTang());
            
            // Thực hiện câu lệnh INSERT
            int rowsInserted = psmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Room added successfully.");
                return true; // Trả về true nếu thêm thành công
            } else {
                System.out.println("Failed to add room.");
                return false; // Trả về false nếu thêm không thành công
            }
        } catch (SQLException e) {
            System.out.println("Error while adding room: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
        return false; // Trả về false nếu không thể kết nối đến cơ sở dữ liệu
    }
}
 
 public ArrayList<Room> getRoom() {
        Connection conn = getConnection();
        ArrayList<Room> listRoom = new ArrayList<>(); // Khởi tạo danh sách
        if (conn != null) {
            String query = "SELECT * FROM phong"; // Truy vấn để lấy dữ liệu từ bảng phong
            try (PreparedStatement psmt = conn.prepareStatement(query);
                 ResultSet rs = psmt.executeQuery()) { // Thực hiện truy vấn SELECT và lấy kết quả
                while (rs.next()) {
                    // Tạo đối tượng Room từ dữ liệu trong kết quả
                    Room room = new Room();
                    room.setMaPhong(rs.getString("maphong"));
                    room.setMahopdong(rs.getString("mahopdong"));
                    room.setLoaiPhong(rs.getInt("loaiphong"));
                    room.setMoTa(rs.getString("mota"));
                    room.setTrangThai(rs.getString("trangthai"));
                    room.setTang(rs.getInt("tang"));
             
                    listRoom.add(room);
                }
                System.out.println("Data retrieved successfully.");
            } catch (SQLException e) {
                System.out.println("Error while retrieving data: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return listRoom;
    }
    
    public boolean deleteRoom(String id) {
        Connection conn = getConnection();
        if (conn != null) {
            String query = "DELETE FROM phong WHERE maphong = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                // Thiết lập giá trị tham số cho câu lệnh SQL
                psmt.setString(1, id);
                int rowsDeleted = psmt.executeUpdate(); // Thực thi truy vấn xóa

                // Kiểm tra xem có dòng nào đã bị xóa không
                if (rowsDeleted > 0) {
                    System.out.println("Room deleted successfully.");
                    return true; // Trả về true nếu xóa thành công
                } else {
                    System.out.println("Room not found or failed to delete.");
                }
            } catch (SQLException e) {
                System.out.println("Error while deleting room: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return false; // Trả về false nếu xóa không thành công
    }
    
    public boolean updateRoom(Room room) {
    Connection conn = getConnection();
    if (conn != null) {
        String query = "UPDATE phong SET  loaiphong = ?, mota = ?, trangthai = ?, tang = ? WHERE maphong = ?";
        try (PreparedStatement psmt = conn.prepareStatement(query)) {
            // Thiết lập giá trị tham số cho câu lệnh SQL
            psmt.setInt(1, room.getLoaiPhong());
            psmt.setString(2, room.getMoTa());
            psmt.setString(3, room.getTrangThai());
            psmt.setInt(4, room.getTang());
            psmt.setString(5, room.getMaPhong());
            int rowsUpdated = psmt.executeUpdate(); // Thực thi truy vấn cập nhật

            // Kiểm tra xem có bao nhiêu dòng đã được cập nhật
            if (rowsUpdated > 0) {
                System.out.println("Room updated successfully.");
                return true; // Trả về true nếu cập nhật thành công
            } else {
                System.out.println("Room not found or failed to update.");
            }
        } catch (SQLException e) {
            System.out.println("Error while updating room: " + e.getMessage());
        }
    } else {
        System.out.println("Failed to establish connection to the database.");
    }
    return false; // Trả về false nếu cập nhật không thành công
}


    
    
}
