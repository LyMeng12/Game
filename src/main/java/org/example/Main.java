package org.example;

import org.example.DAB.DBConnection;
import org.example.DAB.Server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("\t  Welcome to Java Game.");
        System.out.println("====================================");
        sc.nextLine();
        boolean play = true;
        do {
            System.out.println("====================================");
            System.out.println("\t  Choose an option:");
            System.out.println("\t  1. Login Account 👾.");
            System.out.println("\t  2. Create Account 🤖.");
            System.out.println("\t  3. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
//                done
                case 1:{
                    System.out.println("=========================================");
                    System.out.println("\t  Welcome Login From User Account.");
                    System.out.print("Enter your username: ");
                    String name = sc.next();
                    System.out.print("Enter your password: ");
                    String password = sc.next();
                    try{
                        Connection con = DBConnection.getConnection();
                        PreparedStatement ps = con.prepareStatement("select * from tbl_user where Name = ? and Password = ?");
                        ps.setString(1, name);
                        ps.setString(2, password);
                        ResultSet rs = ps.executeQuery();
                        if(rs.next()) {
                            System.out.println("Login Successfully.🤖");
                            ArrayList<User> users = new ArrayList<>();
                            users.add(new User(rs.getString("Name"),rs.getDouble("Money")));
                            System.out.println("=============================");
                            System.out.println("\t  Welcome "+users.get(0).getName());
                        }else {
                            System.out.println("Login Failed!");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }break;
                case 2:{
                    System.out.println("=========================================");
                    System.out.println("\tWelcome From Login User Account.");
                    System.out.print("Enter your Username: ");
                    String name = sc.next();
                    System.out.print("Enter your Password: ");
                    String password = sc.next();
                    System.out.print("Enter your Confirm Password: ");
                    String confirmPassword = sc.next();
                    while (!password.equals(confirmPassword)){
                        System.out.println("Passwords do not match.");
                        System.out.print("Enter your Password: ");
                        password = sc.next();
                        System.out.print("Enter your Confirm Password: ");
                        confirmPassword = sc.next();
                    }
                    System.out.println("Create Account Already.🎊🎉");
                    System.out.print("Enter your Money: ");
                    double money = sc.nextDouble();
                    Server server = new Server();
                    server.setUser(name,password,money);
                }break;
                case 3:{
                    play = false;
                }break;
                case 5:{}break;
                default:{
                    play = true;
                }break;
            }
        }while (play);


    }
}