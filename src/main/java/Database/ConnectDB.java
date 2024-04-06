/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.DriverManager;

/**
 *
 * @author vinhp
 */
public class ConnectDB {
    String hostName="localhost";
    String username="root";
    String pass="";
    String dbName="qlt";
    String urlString = "jdbc:mysql://" + hostName + "/" + dbName + "?user=" + username + "&password=" + pass;
    public java.sql.Connection getConnection(){
        java.sql.Connection conn= null;
        try {
            conn=DriverManager.getConnection(urlString);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
