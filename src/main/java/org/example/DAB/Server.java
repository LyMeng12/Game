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
    public void sethitory(String name , String item , double money) {
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_information (Name, Item, Data_time, Money) VALUES (?, ?, NOW(), ?)");
            ps.setString(1, name);
            ps.setString(2, item);
            ps.setDouble(3, money);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Create User Successfully.<UNK>");
            }else {
                System.out.println("Create User Failed!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setMoney(String name , double money) {
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE tbl_user SET Money=? WHERE Name=?");
            ps.setDouble(1, money);
            ps.setString(2, name);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("\t Start Game New.");
            }else {
                System.out.println("\t Start Game Failed!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void getPlayer(String name ){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from tbl_information where Name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("Name")+rs.getString("Item")+rs.getString("Data_time")+rs.getString("Money"));
            }else {
                System.out.println("No Have!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
