package org.example;

import org.example.DAB.DBConnection;
import org.example.DAB.Server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
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
                            boolean plays = true;
                            do {
                                System.out.println("=============================");
                                System.out.println("\t  Welcome "+users.get(0).getName());
                                System.out.println("\t1 Profile "+users.get(0).getName()+"🐻.");
                                System.out.println("\t2 Play Game 🎮.");
                                System.out.println("\t3 Deposit and withdraw money💸.");
                                System.out.println("\t4 History📋.");
                                System.out.println("\t5 Exit.");
                                System.out.print("Enter your choice: ");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:{
                                        System.out.println("==================================");
                                        System.out.println("\t Welcome "+users.get(0).getName());
                                        System.out.println("\t1 User_Name: "+users.get(0).getName());
                                        System.out.println("\t2 Money: "+users.get(0).getMoney()+"💵");
                                        System.out.println("==================================");
                                        sc.nextLine();
                                    }break;
//                                    done
                                    case 2:{
                                        String[] item = {"🪙","🍒","🍑","🍎"};
                                        Random r = new Random();
                                        String again ;
                                        String games="winner";
                                        System.out.println("===============================================");
                                        System.out.println("Welcome "+users.get(0).getName()+"to Game Java.🎮");
                                        System.out.println("This Random 🪙🍒🍑🍎.");
                                        System.out.println("1.🪙🪙🪙 = x7💵");
                                        System.out.println("2.🍒🍒🍒 = x6💵");
                                        System.out.println("3.🍑🍑🍑 = x5💵");
                                        System.out.println("4.🍎🍎🍎 = x4💵");
                                        System.out.println("5.🪙🪙 = x2💵");
                                        System.out.println("6.🍒🍒 or 🍑🍑 or 🍎🍎 = x1💵");
                                        if(users.get(0).getMoney()!=0){
                                            do {
                                                System.out.println("Your Money: "+users.get(0).getMoney()+"💵");
                                                System.out.print("Enter your Money (1$-"+users.get(0).getMoney()+"$): ");
                                                double money = sc.nextInt();
                                                while (money<1 || money>users.get(0).getMoney()) {
                                                    System.out.println("Enter your Money again (1$-up): ");
                                                    money = sc.nextInt();
                                                }
                                                Server server = new Server();
                                                server.setMoney(users.get(0).getName(),(users.get(0).getMoney()-money));
                                                users.get(0).setDabMoney(money);
                                                users.get(0).getMoney();

                                                String a = item[r.nextInt(item.length)];
                                                String b = item[r.nextInt(item.length)];
                                                String c = item[r.nextInt(item.length)];
                                                System.out.println("=========================================");
                                                System.out.println();
                                                System.out.println("\t 🎰 " + a + " | " + b + " | " + c);
                                                System.out.println();
                                                System.out.println("=========================================");

                                                if (a.equals(b)&&b.equals(c)) {
                                                    switch (a) {
                                                        case "🪙" :{
                                                            double  winner = money*7;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x7 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;
                                                        case "🍒" :{
                                                            double  winner = money*6;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x6 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;
                                                        case "🍑" :{
                                                            double  winner = money*5;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x5 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;
                                                        case "🍎" :{
                                                            double  winner = money*4;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x4 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;

                                                        default:{
                                                            games="loess";
                                                            System.out.println("You are Loess!🦦");
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                    }
                                                }
                                                else if(a.equals(b)) {
                                                    games="winner";
                                                    switch (a){
                                                        case "🪙" :{
                                                            double  winner = money*2;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x2 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;
                                                        case "🍒" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);
                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        case "🍑" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);
                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        case "🍎" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);
                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        default:{
                                                            games="loess";
                                                            System.out.println("You are Loess!🦦");
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                    }
                                                }else if(b.equals(c)) {
                                                    games="winner";
                                                    switch (b){
                                                        case "🪙" :{
                                                            double  winner = money*2;
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money Winner: "+money+"x2 ="+winner);
                                                            System.out.println("Your have Money: "+(users.get(0).getMoney()+winner));
                                                            users.get(0).setAddMoney(winner);
                                                            server.setMoney(users.get(0).getName(),(winner+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,winner);
                                                        }break;
                                                        case "🍒" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);
                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        case "🍑" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);
                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        case "🍎" :{
                                                            System.out.println("You Winner 🎊🎉.");
                                                            System.out.println("Your  Money: "+money);
                                                            users.get(0).setAddMoney(money);

                                                            server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                        default:{
                                                            games="loess";
                                                            System.out.println("You are Loess!🦦");
                                                            server.sethitory(users.get(0).getName(),games,money);
                                                        }break;
                                                    }
                                                }else {
                                                    games="loess";
                                                    System.out.println("You are Loess!🦦");
                                                    server.sethitory(users.get(0).getName(),games,money);
                                                }
                                                System.out.print("Play more?(y/n): ");
                                                again = sc.next();
                                                while (!again.equals("y") && !again.equals("n")) {
                                                    System.out.print("Choose again(y/n): ");
                                                    again = sc.next();
                                                }
                                                if (again.equals("n")) {
                                                    System.out.println("Game Over!");
                                                }
                                            }while (users.get(0).getMoney()!=0 && !again.equals("n"));
                                        }else {
                                            System.out.println("You not have enough money!");
                                        }

                                    }break;
                                    case 3:{
                                        boolean changemoney=true;
                                        do {
                                            System.out.println("=============================================");
                                            System.out.println("\t Welcome to Deposit and withdraw money💼.");
                                            System.out.println("1.Deposit Money.");
                                            System.out.println("2.Withdraw Money.");
                                            System.out.println("3.History.");
                                            System.out.println("4. Exit");
                                            System.out.print("Enter your choice: ");
                                            int choosmoney = sc.nextInt();
                                            switch (choosmoney) {
                                                case 1:{
                                                    String Deposit= "Deposit";
                                                    System.out.println("You have Money "+users.get(0).getMoney());
                                                    System.out.print("Setup Money: ");
                                                    double  money = sc.nextDouble();
                                                    Server server = new Server();
                                                    server.setWDMoney(users.get(0).getName(),Deposit,money);
                                                    server.setMoney(users.get(0).getName(),(money+users.get(0).getMoney()));
                                                    users.get(0).setAddMoney(money);
                                                }break;
                                                case 2:{
                                                    String Deposit= "Withdraw";
                                                    System.out.println("You have Money "+users.get(0).getMoney());
                                                    System.out.print("Setup Money: ");
                                                    double  money = sc.nextDouble();
                                                    Server server = new Server();
                                                    server.setWDMoney(users.get(0).getName(),Deposit,money);
                                                    server.setMoney(users.get(0).getName(),(users.get(0).getMoney()-money));
                                                    users.get(0).setDabMoney(money);
                                                }break;
                                                case 3:{
                                                    System.out.println("==================================");
                                                    System.out.println("\t Welcome to Recipe📋.");
                                                    Server server = new Server();
                                                    server.getWDMoney(users.get(0).getName());

                                                }break;
                                                case 4:{
                                                    changemoney=false;
                                                }break;
                                                default:{
                                                    changemoney=true;
                                                }break;
                                            }
                                        }while (changemoney);
                                    }break;
                                    case 4:{
                                        System.out.println("==================================");
                                        System.out.println("\t This is a history game.");
                                        System.out.println("==================================");
                                        Server server = new Server();
                                        server.getPlayer(users.get(0).getName());
                                    }break;
                                    case 5:{
                                        plays = false;
                                        users.remove(0);
                                    }break;
                                    default:{
                                        plays = true;
                                    }break;
                                }
                            }while(plays);
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
//                done
                case 5:{}break;
                default:{
                    play = true;
                }break;
            }
        }while (play);


    }
}