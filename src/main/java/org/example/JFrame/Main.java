package org.example.JFrame;

import javax.swing.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JFrame");

        URL location = Main.class.getResource("/img/png.png");
        ImageIcon icon = new ImageIcon(location);
        frame.setIconImage(icon.getImage());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

