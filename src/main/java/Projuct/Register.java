package Projuct;

import javax.swing.*;
import java.awt.*;

public class Register {
    JFrame frame;
    JButton btn;
    JPasswordField pass;
    JPasswordField comfripass;
    JLabel lbl_title;
    JLabel lbl_name;
    JLabel lbl_password;
    JLabel lbl_comfripassword;
    JLabel lbl_btn;
    Register(){
        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));

        lbl_title = new JLabel();
        lbl_title.setText("Register");
        lbl_title.setHorizontalAlignment(lbl_title.CENTER);
        lbl_title.setVerticalAlignment(lbl_title.CENTER);
        lbl_title.setFont(new Font("Arial", Font.PLAIN, 30));
        lbl_title.setBackground(Color.WHITE);
        lbl_title.setOpaque(true);

        lbl_name = new JLabel();
        lbl_name.setText("User Name:");
        TextField textField_name = new TextField();
        textField_name.setEditable(false);
        textField_name.setBounds(130,35,330,30);
        lbl_name.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_name.add(textField_name);
        lbl_name.setHorizontalAlignment(lbl_name.LEFT);
        lbl_name.setVerticalAlignment(lbl_name.CENTER);

        lbl_password = new JLabel();
        lbl_password.setText("Password:");
        pass = new JPasswordField();
        pass.setBounds(130,20,330,30);
        lbl_password.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_password.add(pass);
        lbl_password.setHorizontalAlignment(lbl_password.LEFT);
        lbl_password.setVerticalAlignment(lbl_password.CENTER);




        frame = new JFrame();
        frame.setIconImage(icon.getImage());
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800, 900);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(189, 156, 127));
        frame.add(lbl_title);
        frame.add(lbl_name);
        frame.add(lbl_password);

        lbl_title.setBounds(0, 0, frame.getWidth(), 70);
        lbl_name.setBounds(180, 80, frame.getWidth(), 100);
        lbl_password.setBounds(180, 150, frame.getWidth(), 70);

    }
}
