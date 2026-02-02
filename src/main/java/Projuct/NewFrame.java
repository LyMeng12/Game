package Projuct;

import javax.swing.*;
import java.awt.*;

public class NewFrame {
    JFrame frame;
    NewFrame() {
        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        frame = new JFrame();
        frame.setIconImage(image);
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(189, 156, 127));

    }
}
