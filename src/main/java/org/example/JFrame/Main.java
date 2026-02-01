package org.example.JFrame;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//      Layout Manager = Defines the natural Layout fir components within a container
//        3 common managers
//      BorderLayout = a BorderLayout places components in areas: NORTH,SOUTH,WEST,EAST,CENTER
//                     All extra is placed in center area.
//        new MyFrame();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.LIGHT_GRAY);
        panel8.setBackground(Color.PINK);
        panel9.setBackground(Color.MAGENTA);
        panel10.setBackground(Color.ORANGE);

        panel6.setPreferredSize(new Dimension(80,80));
        panel7.setPreferredSize(new Dimension(80,80));
        panel8.setPreferredSize(new Dimension(80,80));
        panel9.setPreferredSize(new Dimension(80,80));
        panel10.setPreferredSize(new Dimension(80,80));

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.MAGENTA);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.WEST);


        panel2.setLayout(new BorderLayout(5,5));

        panel2.add(panel6, BorderLayout.NORTH);
        panel2.add(panel7, BorderLayout.SOUTH);
        panel2.add(panel8, BorderLayout.EAST);
        panel2.add(panel9, BorderLayout.WEST);
        panel2.add(panel10, BorderLayout.CENTER);
    }
}

