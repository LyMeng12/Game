package org.example.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends JFrame implements ActionListener{


    JPanel label;
    JPanel label1;
    JPanel label2;
    JPanel label3;
    JPanel label4;

    JButton btn;
    JButton btn1;

    JFrame frame;
    JLayeredPane layeredPane;
    MyFrame(){
        ImageIcon icon = new ImageIcon(
                Main.class.getResource("/img/png.png")
        );
        Image image = icon.getImage().getScaledInstance(
                200,200,Image.SCALE_SMOOTH
        );
        ImageIcon icon2 = new ImageIcon(Main.class.getResource("/img/11.png"));
        Image image2 = icon2.getImage().getScaledInstance(
                200,200,Image.SCALE_SMOOTH
        );

        ImageIcon icon4 = new ImageIcon(Main.class.getResource("/img/left.png"));
        Image image4 = icon4.getImage().getScaledInstance(
                50,50,Image.SCALE_SMOOTH
        );

        ImageIcon icon5 = new ImageIcon(Main.class.getResource("/img/right.png"));
        Image image5 = icon5.getImage().getScaledInstance(
                50,50,Image.SCALE_SMOOTH
        );

        ImageIcon icon3 = new ImageIcon(Main.class.getResource("/img/12.webp"));
        Image image3 = icon3.getImage().getScaledInstance(
                200,200,Image.SCALE_SMOOTH
        );

        btn = new JButton();
        btn1 = new JButton();

        btn.setIcon(new ImageIcon(image4));
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setFocusable(Boolean.FALSE);
        btn.setBounds(110,110,100,100);
        btn.addActionListener(this);

        btn.setSize(100,50);

        btn1.setIcon(new ImageIcon(image5));
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setBounds(110,110,100,100);
        btn1.setFocusable(Boolean.FALSE);
        btn1.addActionListener(this);
        btn1.setSize(100,50);

//        label1
        label = new JPanel();
        label.setBounds(0,0,300,300);
        label.setBackground(Color.red);
        label.add(btn);

        label1 = new JPanel();
        label1.setBounds(300,0,300,300);
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
//        label1.setHorizontalTextPosition(btn1.CENTER);
//        label1.setVerticalTextPosition(btn1.CENTER);
        label1.add(btn1);

        label2 = new JPanel();
        label2.setBounds(0,300,600,300);
        label2.setBackground(Color.BLUE);
        label2.setOpaque(true);

        label3 = new JPanel();
        label3.setBounds(0,300,600,300);
        label3.setBackground(Color.black);
        label3.setOpaque(true);

        label4 = new JPanel();
        label4.setBounds(0,300,600,300);
        label4.setBackground(Color.GRAY);
        label4.setOpaque(true);

        layeredPane = new JLayeredPane();
        layeredPane.add(label,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
        layeredPane.setBounds(0,0,600,600);

//        frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(image);
        frame.setSize(600,600);
        frame.setLayout(null);

        frame.add(layeredPane);
    }
    int i = 0;
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            i++;
            if (i > 3) i = 1;
            System.out.println("i = "+i);
        }

        if (e.getSource() == btn1) {
            i--;
            if (i < 1) i = 3;
            System.out.println("i = "+i);
        }

        switch (i) {
            case 1 -> layeredPane.add(label2, Integer.valueOf(1));
            case 2 -> layeredPane.add(label3, Integer.valueOf(1));
            case 3 -> layeredPane.add(label4, Integer.valueOf(1));
        }

        layeredPane.repaint();

    }

}
