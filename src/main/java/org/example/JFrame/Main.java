package org.example.JFrame;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.blue); // Create Border
        ImageIcon icon = new ImageIcon(
                Main.class.getResource("/img/png.png")
        );
        Image img = icon.getImage().getScaledInstance(
                250,350,Image.SCALE_SMOOTH
        );

//        JLabel
        label.setIcon(new ImageIcon(img)); //set img
        label.setText("I'm GoJo.");//set Text
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);// display background color
        label.setHorizontalTextPosition(label.CENTER); // set text LEFT RIGHT or CENTER of Img
        label.setVerticalTextPosition(label.TOP); // set text TOP  BOTTM or CENTER of Img
        label.setBorder(border); // display Border
        label.setIconTextGap(-70); // set gap of text to img
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set size text and fomt text
        label.setForeground(Color.BLUE); //set color text
        label.setVerticalAlignment(label.CENTER);// set vertical position of icon+text within label
        label.setHorizontalAlignment(label.CENTER);//set Horizontal position of icon+text within label
//        label.setBounds(100, 100, 300, 400); // set x,y position within frame as dimensions



//        JFrame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("GoJo.");
        frame.setVisible(true);
//        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
//        frame.setSize(300,400);
        frame.add(label);
        frame.pack();
    }
}

