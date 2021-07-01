import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RLogin_D extends JFrame {

    private JPanel Plogin;
    private JButton Log_button;
    private JButton backbtn;
    private JTextField userfield;
    private JPasswordField passwordField;


    public static void main(String[] args) {
        RLogin_D frame = new RLogin_D();
        frame.setVisible(true);
    }


    public RLogin_D() {


        initComponents();

    }





    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Plogin = new JPanel();
        Plogin.setBackground(Color.GRAY);
        setContentPane(Plogin);
        Plogin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("loginR.jpg"));
        backgroundlabel.setBounds(0,0,1370, 749);





        JLabel user_label = new JLabel("User Name");
        user_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
        user_label.setForeground(Color.DARK_GRAY);
        user_label.setBounds(479, 355, 102, 40);
        Plogin.add(user_label);


        JLabel pass_label = new JLabel("Password");
        pass_label.setBackground(Color.WHITE);
        pass_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pass_label.setForeground(Color.DARK_GRAY);
        pass_label.setBounds(479, 423, 102, 42);
        Plogin.add(pass_label);

        userfield = new JTextField();
        userfield.setFont(new Font("Tahoma", Font.PLAIN, 15));
        userfield.setBounds(618, 355, 283, 44);
        Plogin.add(userfield);
        userfield.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setBounds(618, 424, 283, 44);
        Plogin.add(passwordField);

        Log_button = new JButton("Log_in");
        Log_button.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Log_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Lname=userfield.getText();
                String Lpassword=passwordField.getText();
                if (Lname.isBlank() && Lpassword.isBlank()){
                    JOptionPane.showMessageDialog(null,"Not Found, Enter Again");
                }
                Connection connection;
                try {
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from receptionist where name = ? and password = ?");
                    checkCredsQuery.setString(1, Lname);
                    checkCredsQuery.setString(2, Lpassword);
                    if (checkCredsQuery.executeUpdate() == 0) {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password!");



                    } else {
                        JOptionPane.showMessageDialog(null,"Found");
                        dispose();
                        Recep_Dashboard_D recep_dashboard_d=new Recep_Dashboard_D();
                        recep_dashboard_d.setVisible(true);
                    }

                } catch (SQLException em) {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
                }


            }
        });
        Log_button.setBounds(613, 490, 123, 29);
        Plogin.add(Log_button);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                First_Page_D first_page_d=new First_Page_D();
                first_page_d.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(Color.DARK_GRAY);
        backbtn.setBounds(0, 0, 139, 33);
        Plogin.add(backbtn);

        Plogin.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


