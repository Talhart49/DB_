import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddAdmin_D extends JFrame {

    private JPanel PaddAdmin;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JTextField emailfld;
    private JPasswordField passwordfld;


    public static void main(String[] args) {
        AddAdmin_D frame = new AddAdmin_D();
        frame.setVisible(true);
    }


    public AddAdmin_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddAdmin = new JPanel();
        PaddAdmin.setBackground(new Color(107, 103, 91));
        setContentPane(PaddAdmin);
        PaddAdmin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(681, 11, 601, 365);
        PaddAdmin.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        PaddAdmin.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        namelbl.setForeground(new Color(255,255,255));
        namelbl.setBounds(548, 424, 102, 42);
        PaddAdmin.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddAdmin.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 645, 116, 40);
        PaddAdmin.add(Addbtn);

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
        PaddAdmin.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.WHITE);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        cniclbl.setBounds(548, 482, 102, 42);
        PaddAdmin.add(cniclbl);

        JLabel emaillbl = new JLabel("Email :");
        emaillbl.setForeground(Color.WHITE);
        emaillbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        emaillbl.setBounds(548, 535, 102, 42);
        PaddAdmin.add(emaillbl);

        JLabel passwordlbl = new JLabel("Password :");
        passwordlbl.setForeground(Color.WHITE);
        passwordlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        passwordlbl.setBounds(548, 590, 102, 42);
        PaddAdmin.add(passwordlbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddAdmin.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 480, 283, 44);
        PaddAdmin.add(cnicfld);

        emailfld = new JTextField();
        emailfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        emailfld.setColumns(10);
        emailfld.setBounds(714, 535, 283, 44);
        PaddAdmin.add(emailfld);

        passwordfld = new JPasswordField();
        passwordfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordfld.setBounds(714, 590, 283, 44);
        PaddAdmin.add(passwordfld);
        setLocationRelativeTo(null);



    }
}


