package Projuct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame;
    JButton btn;
    JButton btn1;
    TextField textField;
    TextField textField1;
    MyFrame() {
        frame = new JFrame();

        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        JLabel label = new JLabel();
        label.setBounds(0, 70, 300, 430);
        label.setIcon(new ImageIcon(image));
        label.setHorizontalAlignment(label.RIGHT);
        label.setVerticalAlignment(label.TOP);


        JLabel label1 = new JLabel();
        label1.setBounds(300, 60, 500, 150);
        label1.setFont(new Font("MV Boli", Font.BOLD, 18));
        textField = new TextField();
        textField.setFont(new Font("MV Boli", Font.PLAIN, 18));
        textField.setBounds(0, 90, 330, 30);
        label1.setText("Enter Your Name:");
//        label1.setBackground(Color.cyan);
//        label1.setOpaque(true);
        label1.add(textField);

        JLabel label3 = new JLabel();
        label3.setBounds(300, 140, 500, 150);
        label3.setFont(new Font("MV Boli", Font.BOLD, 18));
        label3.setText("Enter Your Password:");
        textField1=new TextField();
        textField1.setFont(new Font("MV Boli", Font.BOLD, 18));
        textField1.setBounds(0, 90, 330, 30);
        label3.add(textField1);
//        label3.setBackground(Color.BLACK);
//        label3.setOpaque(true);



        btn = new JButton("Submit");
        btn.setFont(new Font("MV Boli", Font.PLAIN, 18));
        btn.setBounds(300, 300, 130, 50);
        btn.setFocusable(Boolean.FALSE);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(81, 51, 26));
        btn.addActionListener(this);

        btn1=new JButton("Register");
        btn1.setFont(new Font("MV Boli", Font.PLAIN, 18));
        btn1.setBounds(500, 300, 130, 50);
        btn1.setBackground(new Color(81, 51, 26));
        btn1.setFocusable(Boolean.FALSE);
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);




        JLabel label2 = new JLabel();
        label2.setBounds(0, 0, 800, 70);
        label2.setText("System GoJo");
        label2.setHorizontalAlignment(label2.CENTER);
        label2.setVerticalAlignment(label2.CENTER);
        label2.setFont(new Font("MV Boli", Font.BOLD, 35));



        frame.setIconImage(image);
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(189, 156, 127));
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(btn);
        frame.add(btn1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            if(textField.getText().equals("meng") || textField1.getText().equals("123")) {
                frame.dispose();
                new NewFrame();
            }

        }else if (e.getSource()==btn1){
            frame.dispose();
            new Register();
        }

    }
}
