package org.example.JFrame;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JPanel = a GUI component that function as a container to hold other component.


        JPanel panel1 = new JPanel();

        panel1.setBackground(Color.BLACK);
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(250, 0, 250, 250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setBounds(0, 250, 500, 250);



        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JFrame");
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}

