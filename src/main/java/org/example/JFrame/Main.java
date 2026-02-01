package org.example.JFrame;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//      JLayerPane = Swing container that provides a
//                   third dimension for positioning components ex. depth, Z-index


        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();


        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.setBounds(0, 0, 100, 100);

        label2.setBackground(Color.GREEN);
        label2.setOpaque(true);
        label2.setBounds(50, 50, 100, 100);

        label3.setBackground(Color.BLUE);
        label3.setOpaque(true);
        label3.setBounds(100, 100, 100, 100);


        JLayeredPane layeredPane = new JLayeredPane(); // DEFAULT<PALETTE<MODEL<POPUP<DRAG
        layeredPane.setBounds(0, 0, 800, 600);
//        layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
//        layeredPane.add(label2, JLayeredPane.POPUP_LAYER);
//        layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame("JLayerPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.add(layeredPane);





    }
}

