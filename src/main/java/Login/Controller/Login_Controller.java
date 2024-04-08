/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login.Controller;

import Database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vinhp
 */
public class Login_Controller extends ConnectDB{
      
       public Boolean checkLogin(String username, String password) {
        Connection conn = getConnection(); 
        
        if (conn != null) {
            String query = "SELECT * FROM users WHERE name = ? AND password = ?";
            try (PreparedStatement psmt = conn.prepareStatement(query)) {
                psmt.setString(1, username);
                psmt.setString(2, password);
                try (ResultSet resultSet = psmt.executeQuery()) {
                    return resultSet.next(); 
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to establish connection to the database.");
        }
        return false; 
    }
}
