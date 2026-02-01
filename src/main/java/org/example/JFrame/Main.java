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
//      FlowLayout = places components in a row , sized at their preferred size.
//                   IF the horizontal space in the container is too small,
//                   the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
    }
}

