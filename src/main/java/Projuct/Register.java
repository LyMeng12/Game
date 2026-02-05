package Projuct;

import javax.swing.*;
import java.awt.*;

public class Register {
    JFrame frame;
    Register(){
        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));
        frame = new JFrame();

        frame.setIconImage(icon.getImage());
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800, 900);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(189, 156, 127));
    }
}
