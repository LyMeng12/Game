package Projuct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame implements ActionListener {
    JFrame frame;

    JLabel label_header;
    JLabel label_btn;

    JButton btn_Dashboard;
    JButton btn_Drink;
    JButton btn_Category;
    JButton btn_Employee;
    JButton btn_Logout;

    JLabel label_Dashboard;
    JLabel label_Employee;
    JLabel label_Category;
    JLabel label_Drink;

    NewFrame() {
        ImageIcon icon = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        ImageIcon icon1 = new ImageIcon(Main.class.getResource("/img/png.png"));
        Image image1 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        ImageIcon Dashborad_icon = new ImageIcon(Main.class.getResource("/btn_icon/dashboard.png"));
        Image Dashborad = Dashborad_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon Drink_icon = new ImageIcon(Main.class.getResource("/btn_icon/soda.png"));
        Image Drink = Drink_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon Category_icon = new ImageIcon(Main.class.getResource("/btn_icon/shopping.png"));
        Image Category = Category_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon Employee_icon = new ImageIcon(Main.class.getResource("/btn_icon/group.png"));
        Image Employee = Employee_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon Logout_icon = new ImageIcon(Main.class.getResource("/btn_icon/logout.png"));
        Image Logout = Logout_icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);



        btn_Dashboard = new JButton();
        btn_Drink = new JButton();
        btn_Category = new JButton();
        btn_Employee = new JButton();
        btn_Logout = new JButton();



        btn_Dashboard.setIcon(new ImageIcon(Dashborad));
        btn_Dashboard.setText("Dashboard");
        btn_Dashboard.addActionListener(this);
        btn_Dashboard.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btn_Dashboard.setBounds(0, 0, 300, 70);
        btn_Dashboard.setFocusable(false);
        btn_Dashboard.setBackground(new Color(175, 123, 88));
        btn_Dashboard.setForeground(Color.black);
        btn_Dashboard.setBorder(BorderFactory.createLineBorder(new Color(81, 51, 26)));


        btn_Drink.setIcon(new ImageIcon(Drink));
        btn_Drink.setText("Drinks");
        btn_Drink.addActionListener(this);
        btn_Drink.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btn_Drink.setSize(new Dimension(300, 70));
        btn_Drink.setFocusable(false);
        btn_Drink.setBackground(new Color(81, 51, 26));
        btn_Drink.setBounds(0, 70, 300, 70);
        btn_Drink.setForeground(Color.WHITE);
        btn_Drink.setEnabled(true);
        btn_Drink.setBorder(BorderFactory.createLineBorder(new Color(81, 51, 26)));


        btn_Category.setIcon(new ImageIcon(Category));
        btn_Category.setText("Categories");
        btn_Category.addActionListener(this);
        btn_Category.setFocusable(false);
        btn_Category.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btn_Category.setBackground(new Color(81, 51, 26));
        btn_Category.setForeground(Color.WHITE);
        btn_Category.setBounds(0, 140, 300, 70);
        btn_Category.setEnabled(true);
        btn_Category.setBorder(BorderFactory.createLineBorder(new Color(81, 51, 26)));

        btn_Employee.setIcon(new ImageIcon(Employee));
        btn_Employee.setText("Employees");
        btn_Employee.addActionListener(this);
        btn_Employee.setFocusable(false);
        btn_Employee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btn_Employee.setBackground(new Color(81, 51, 26));
        btn_Employee.setForeground(Color.WHITE);
        btn_Employee.setBounds(0, 210, 300, 70);
        btn_Employee.setEnabled(true);
        btn_Employee.setBorder(BorderFactory.createLineBorder(new Color(81, 51, 26)));

        btn_Logout.setIcon(new ImageIcon(Logout));
        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(this);
        btn_Logout.setBackground(Color.RED);
        btn_Logout.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btn_Logout.setForeground(Color.WHITE);
        btn_Logout.setBounds(0, 800, 300, 70);
        btn_Logout.setFocusable(false);
        btn_Logout.setBorder(BorderFactory.createLineBorder(Color.red));




        label_header = new JLabel();
        label_header.setIcon(new ImageIcon(image1));
        label_header.setText("GoJo Drink Shop");
        label_header.setBackground(Color.WHITE);
        label_header.setVerticalAlignment(SwingConstants.CENTER);
        label_header.setHorizontalAlignment(SwingConstants.CENTER);
        label_header.setForeground(new Color(89, 50, 41));
        label_header.setFont(new Font("Arial", Font.BOLD, 20));
        label_header.setOpaque(true);
        label_header.setVisible(true);

        label_btn = new JLabel();
        label_btn.setBackground(new Color(81, 51, 26));
        label_btn.setOpaque(true);
        label_btn.setLayout(null);
        label_btn.setBorder(BorderFactory.createLineBorder(new Color(81, 51, 26)));
        label_btn.setVisible(true);
        label_btn.add(btn_Dashboard);
        label_btn.add(btn_Drink);
        label_btn.add(btn_Category);
        label_btn.add(btn_Employee);
        label_btn.add(btn_Logout);



        label_Dashboard = new JLabel();
        label_Dashboard.setBackground(Color.GREEN);
        label_Dashboard.setOpaque(true);
        label_Dashboard.setVisible(true);

        label_Category= new JLabel();
        label_Category.setBackground(Color.black);
        label_Category.setOpaque(true);
        label_Category.setVisible(false);

        label_Employee= new JLabel();
        label_Employee.setBackground(Color.red);
        label_Employee.setOpaque(true);
        label_Employee.setVisible(false);

        label_Drink= new JLabel();
        label_Drink.setBackground(Color.blue);
        label_Drink.setOpaque(true);
        label_Drink.setVisible(false);



        frame = new JFrame();
        frame.setIconImage(image);
        frame.setTitle("GoJo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(189, 156, 127));
        frame.add(label_header);
        frame.add(label_btn);
        frame.add(label_Dashboard);
        frame.add(label_Category);
        frame.add(label_Employee);
        frame.add(label_Drink);



        label_header.setBounds(0, 0, frame.getWidth(), 80);
        label_btn.setBounds(0, 80, 300, frame.getHeight());
        label_Dashboard.setBounds(300, 80, frame.getWidth(), frame.getHeight());
        label_Drink.setBounds(300,80, frame.getWidth(), frame.getHeight());
        label_Employee.setBounds(300,80, frame.getWidth(), frame.getHeight());
        label_Category.setBounds(300,80, frame.getWidth(), frame.getHeight());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btn_Logout){
            frame.dispose();
            new MyFrame();
        }else if (e.getSource()== btn_Employee){
            btn_Employee.setBackground(new Color(175, 123, 88));
            btn_Employee.setForeground(Color.black);

            btn_Dashboard.setBackground(new Color(81, 51, 26));
            btn_Dashboard.setForeground(Color.WHITE);

            btn_Category.setBackground(new Color(81, 51, 26));
            btn_Category.setForeground(Color.WHITE);

            btn_Drink.setBackground(new Color(81, 51, 26));
            btn_Drink.setForeground(Color.WHITE);
            label_Employee.setVisible(true);
            label_Dashboard.setVisible(false);
            label_Drink.setVisible(false);
            label_Category.setVisible(false);

        }else if (e.getSource()== btn_Dashboard){
            btn_Dashboard.setBackground(new Color(175, 123, 88));
            btn_Dashboard.setForeground(Color.black);

            btn_Employee.setBackground(new Color(81, 51, 26));
            btn_Employee.setForeground(Color.WHITE);

            btn_Category.setBackground(new Color(81, 51, 26));
            btn_Category.setForeground(Color.WHITE);

            btn_Drink.setBackground(new Color(81, 51, 26));
            btn_Drink.setForeground(Color.WHITE);

            label_Employee.setVisible(false);
            label_Dashboard.setVisible(true);
            label_Drink.setVisible(false);
            label_Category.setVisible(false);

        } else if (e.getSource() == btn_Drink) {
            btn_Drink.setBackground(new Color(175, 123, 88));
            btn_Drink.setForeground(Color.black);

            btn_Dashboard.setBackground(new Color(81, 51, 26));
            btn_Dashboard.setForeground(Color.WHITE);

            btn_Employee.setBackground(new Color(81, 51, 26));
            btn_Employee.setForeground(Color.WHITE);

            btn_Category.setBackground(new Color(81, 51, 26));
            btn_Category.setForeground(Color.WHITE);

            label_Employee.setVisible(false);
            label_Dashboard.setVisible(false);
            label_Drink.setVisible(true);
            label_Category.setVisible(false);

        }else if (e.getSource() == btn_Category){
            btn_Category.setBackground(new Color(175, 123, 88));
            btn_Category.setForeground(Color.black);

            btn_Employee.setBackground(new Color(81, 51, 26));
            btn_Employee.setForeground(Color.WHITE);

            btn_Dashboard.setBackground(new Color(81, 51, 26));
            btn_Dashboard.setForeground(Color.WHITE);

            btn_Drink.setBackground(new Color(81, 51, 26));
            btn_Drink.setForeground(Color.WHITE);

            label_Employee.setVisible(false);
            label_Dashboard.setVisible(false);
            label_Drink.setVisible(false);
            label_Category.setVisible(true);
        }
    }
}
