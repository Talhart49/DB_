import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ALogin_D extends JFrame {

    private JPanel Plogin;
    private JButton Log_button;
    private JButton backbtn;
    private JTextField userfield;
    private JPasswordField passwordField;


    public static void main(String[] args) {
        ALogin_D frame = new ALogin_D();
        frame.setVisible(true);
    }


    public ALogin_D() {


        initComponents();

    }

    public void login_chk(String name,String password){


    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Plogin = new JPanel();
        Plogin.setBackground(new Color(49, 46, 41, 15));
        setContentPane(Plogin);
        Plogin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(681, 11, 601, 365);
        Plogin.add(backgroundlabel);




        JLabel user_label = new JLabel("User Name");
        user_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
        user_label.setForeground(new Color(255,255,255));
        user_label.setBounds(537, 553, 102, 40);
        Plogin.add(user_label);


        JLabel pass_label = new JLabel("Password");
        pass_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pass_label.setForeground(new Color(255,255,255));
        pass_label.setBounds(537, 623, 102, 42);
        Plogin.add(pass_label);

        userfield = new JTextField();
        userfield.setFont(new Font("Tahoma", Font.PLAIN, 15));
        userfield.setBounds(714, 547, 283, 44);
        Plogin.add(userfield);
        userfield.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setBounds(714, 621, 283, 44);
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
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where name = ? and password = ?");
                    checkCredsQuery.setString(1, Lname);
                    checkCredsQuery.setString(2, Lpassword);
                    if (checkCredsQuery.executeUpdate() == 0) {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password!");

                        PreparedStatement queryStatement = connection.prepareStatement("select * from admin");

                        ResultSet result = queryStatement.executeQuery();
                        System.out.println("ID\tName\tphone\tname\tExperonece");
                        while (result.next()) {
                            System.out.println(result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4) +"\t" + result.getString(5));
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,"Found");
                    }

                } catch (SQLException em) {
                    em.printStackTrace();
                }

////                Sign_Upp s1=new Sign_Upp();
//                String Lname=userfield.getText();
//                String Lpassword=passwordField.getText();
//                if (Lname.isBlank() && Lpassword.isBlank()){
//                    JOptionPane.showMessageDialog(null,"Not Found, Enter Again");
//                }
//
////                else if (Sign_Upp.Log_in(Lname,Lpassword)){
//////                    dispose();
//////                    OrderG orderG=new OrderG();
//////                    orderG.setVisible(true);
////                }
//                else {
//                    userfield.setText(" ");
//                    passwordField.setText(" ");
//                    JOptionPane.showMessageDialog(null,"Not Found, Enter Again");
//                }
            }
        });
        Log_button.setBounds(714, 659, 116, 40);
        Plogin.add(Log_button);

        backbtn = new JButton("Back");
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                First_Page_D first_page_d=new First_Page_D();
                first_page_d.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(10, 41, 154, 42);
        Plogin.add(backbtn);
        setLocationRelativeTo(null);



    }
}

