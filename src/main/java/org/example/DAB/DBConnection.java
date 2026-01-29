package org.example.DAB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_game?useSSL=false&serverTimezone=UTC",
            "root",
            "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
