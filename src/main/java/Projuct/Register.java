package Projuct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register implements ActionListener {


    TextField textField_name;
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
        textField_name = new TextField();
        textField_name.setEditable(true);
        textField_name.setBounds(190,35,330,30);
        lbl_name.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_name.add(textField_name);
        lbl_name.setHorizontalAlignment(lbl_name.LEFT);
        lbl_name.setVerticalAlignment(lbl_name.CENTER);

        lbl_password = new JLabel();
        lbl_password.setText("Password:");
        pass = new JPasswordField();
        pass.setBounds(190,20,330,30);
        lbl_password.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_password.add(pass);
        lbl_password.setHorizontalAlignment(lbl_password.LEFT);
        lbl_password.setVerticalAlignment(lbl_password.CENTER);

        lbl_comfripassword = new JLabel();
        lbl_comfripassword.setText("ConfirmPassword :");
        comfripass = new JPasswordField();
        comfripass.setBounds(190,20,330,30);
        lbl_comfripassword.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl_comfripassword.add(comfripass);
        lbl_comfripassword.setHorizontalAlignment(lbl_comfripassword.LEFT);
        lbl_comfripassword.setVerticalAlignment(lbl_comfripassword.CENTER);


        btn = new JButton("Submit");
        btn.setFont(new Font("MV Boli", Font.PLAIN, 18));
        btn.setBounds(300, 300, 130, 50);
        btn.setFocusable(Boolean.FALSE);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(81, 51, 26));
        btn.addActionListener(this);

        frame = new JFrame();
        frame.setIconImage(icon.getImage());
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(189, 156, 127));
        frame.add(lbl_title);
        frame.add(lbl_name);
        frame.add(lbl_password);
        frame.add(lbl_comfripassword);
        frame.add(btn);

        lbl_title.setBounds(0, 0, frame.getWidth(), 70);
        lbl_name.setBounds(120, 80, frame.getWidth(), 100);
        lbl_password.setBounds(120, 150, frame.getWidth(), 70);
        lbl_comfripassword.setBounds(120, 205, frame.getWidth(), 70);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            if (textField_name.getText().equals("") && pass.getText().equals("") && comfripass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields","Error",JOptionPane.INFORMATION_MESSAGE);
                textField_name.setText("");
                pass.setText("");
                comfripass.setText("");
            }else {
                if (!pass.getText().equals(comfripass.getText())) {
                    JOptionPane.showMessageDialog(null, "Please Enter Password Again!","Error",JOptionPane.INFORMATION_MESSAGE);
                    pass.setText("");
                    comfripass.setText("");
                }
                else {
                    frame.dispose();
                    JOptionPane.showOptionDialog(frame,"Create New User is successful","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
                    new MyFrame();
                }
            }
        }
    }
}
