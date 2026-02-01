package org.example.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton btn;
    JButton btn2;
    JLabel lbl;
    MyFrame() {

        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        btn = new JButton();
        btn.setText("HI");
        btn.setIcon(new ImageIcon(image));
        btn.setBounds(100, 100, 150, 70);
        btn.addActionListener(this);
        btn.setHorizontalTextPosition(btn.CENTER);
        btn.setIconTextGap(-10);
        btn.setFocusable(false);
        btn.setForeground(Color.CYAN);
        btn.setVerticalTextPosition(btn.BOTTOM);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setOpaque(true);
        btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btn.setFont(new Font("Serif", Font.PLAIN, 20));

        btn2 = new JButton();
        btn2.setBounds(300, 100, 150, 70);
        btn2.setText("Bye");
        btn2.setIcon(new ImageIcon(image));
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setHorizontalTextPosition(btn2.CENTER);
        btn2.setIconTextGap(-10);
        btn2.setVerticalTextPosition(btn2.BOTTOM);
        btn2.setOpaque(true);
        btn2.addActionListener(this);
        btn2.setFocusable(false);
        btn2.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        lbl = new JLabel(new ImageIcon(image1));
        lbl.setBounds(150,250,200,200);
        lbl.setVisible(false);
        lbl.setText("Hello! I'm GoJo!");
        lbl.setForeground(Color.blue);
        lbl.setHorizontalTextPosition(btn.CENTER);
        lbl.setVerticalTextPosition(btn.TOP);
        lbl.setFont(new Font("Serif", Font.PLAIN, 20));
        lbl.setIconTextGap(-25);





        this.setTitle("I'm GoJo.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(btn);
        this.add(lbl);
        this.add(btn2);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            lbl.setVisible(true);
            System.out.println("I'm GoJo.");
        }
        else if (e.getSource()==btn2){
            lbl.setVisible(false);
        }
    }
}
