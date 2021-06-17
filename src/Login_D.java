import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login_D extends JFrame {

    private JPanel Plogin;
    private JButton Log_button;
    private JButton backbtn;
    private JTextField userfield;
    private JPasswordField passwordField;


    public static void main(String[] args) {
        Login_D frame = new Login_D();
        frame.setVisible(true);
    }


    public Login_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Plogin = new JPanel();
        Plogin.setBackground(new Color(107, 103, 91));
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
//                Sign_Upp s1=new Sign_Upp();
                String Lname=userfield.getText();
                String Lpassword=passwordField.getText();
                if (Lname.isBlank() && Lpassword.isBlank()){
                    JOptionPane.showMessageDialog(null,"Not Found, Enter Again");
                }

//                else if (Sign_Upp.Log_in(Lname,Lpassword)){
////                    dispose();
////                    OrderG orderG=new OrderG();
////                    orderG.setVisible(true);
//                }
                else {
                    userfield.setText(" ");
                    passwordField.setText(" ");
                    JOptionPane.showMessageDialog(null,"Not Found, Enter Again");
                }
            }
        });
        Log_button.setBounds(714, 694, 116, 40);
        Plogin.add(Log_button);

        backbtn = new JButton("Back");
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                dispose();
//                Admin a=new Admin();
//                a.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(10, 41, 154, 42);
        Plogin.add(backbtn);
        setLocationRelativeTo(null);



    }
}


