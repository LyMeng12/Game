package org.example.JFrame;


import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(
                Main.class.getResource("/img/png.png")
        );
        Image img = icon.getImage().getScaledInstance(
                250,350,Image.SCALE_SMOOTH
        );

//        JLabel
        label.setIcon(new ImageIcon(img));
        label.setSize(300,400);
        label.setText("I'm GoJo.");
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setHorizontalTextPosition(label.CENTER);
        label.setVerticalTextPosition(label.TOP);
        label.setIconTextGap(-25);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setForeground(Color.BLUE);



//        JFrame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("GoJo.");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setSize(300,400);
        frame.add(label);
    }
}

