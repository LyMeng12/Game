package org.example.DAB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Server {
    public void setUser(String name , String password , double money) {
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into tbl_user(Name,Password,Money) values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setDouble(3, money);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Create User Successfully.🎉🎊");
            }else {
                System.out.println("Create User Failed!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
