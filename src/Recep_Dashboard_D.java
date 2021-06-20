import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Recep_Dashboard_D extends JFrame {

    private JPanel Precep_Dashboard;
    private JButton AHomeDelibtn;
    private JButton backbtn;


    public static void main(String[] args) {
        Recep_Dashboard_D frame = new Recep_Dashboard_D();
        frame.setVisible(true);
    }


    public Recep_Dashboard_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Precep_Dashboard = new JPanel();
        Precep_Dashboard.setBackground(new Color(107, 103, 91));
        setContentPane(Precep_Dashboard);
        Precep_Dashboard.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(973, 11, 309, 93);
        Precep_Dashboard.add(backgroundlabel);

        AHomeDelibtn = new JButton("Home Delivery");
        AHomeDelibtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        AHomeDelibtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        AHomeDelibtn.setBounds(204, 199, 133, 40);
        Precep_Dashboard.add(AHomeDelibtn);

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
        backbtn.setBounds(0, 0, 154, 42);
        Precep_Dashboard.add(backbtn);

        JLabel addlbl = new JLabel("Add");
        addlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        addlbl.setBounds(213, 83, 85, 34);
        Precep_Dashboard.add(addlbl);

        JButton Acustomerbtn = new JButton("Customer");
        Acustomerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Acustomerbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Acustomerbtn.setBounds(204, 148, 133, 40);
        Precep_Dashboard.add(Acustomerbtn);

        JButton Aorderbtn = new JButton("Order");
        Aorderbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Aorderbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aorderbtn.setBounds(204, 250, 133, 40);
        Precep_Dashboard.add(Aorderbtn);

        JButton AInhousebtn = new JButton("Order_Food");
        AInhousebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        AInhousebtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        AInhousebtn.setBounds(204, 301, 133, 40);
        Precep_Dashboard.add(AInhousebtn);

        JButton ADeli_foodbtn = new JButton("Delivery_Food");
        ADeli_foodbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        ADeli_foodbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ADeli_foodbtn.setBounds(204, 352, 133, 40);
        Precep_Dashboard.add(ADeli_foodbtn);





        ///////////////////////////////////////



        JLabel Viewlbl = new JLabel("View/Search");
        Viewlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Viewlbl.setBounds(479, 83, 121, 34);
        Precep_Dashboard.add(Viewlbl);

        JButton Vcustomerbtn = new JButton("Customer");
        Vcustomerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vcustomerbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vcustomerbtn.setBounds(467, 148, 133, 40);
        Precep_Dashboard.add(Vcustomerbtn);

        JButton VHomeDelibtn = new JButton("Home Delivery");
        VHomeDelibtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        VHomeDelibtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VHomeDelibtn.setBounds(467, 199, 133, 40);
        Precep_Dashboard.add(VHomeDelibtn);

        JButton Vorderbtn = new JButton("Order");
        Vorderbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vorderbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vorderbtn.setBounds(467, 250, 133, 40);
        Precep_Dashboard.add(Vorderbtn);

        JButton VInhousebtn = new JButton("Order_Food");
        VInhousebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        VInhousebtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VInhousebtn.setBounds(467, 301, 133, 40);
        Precep_Dashboard.add(VInhousebtn);

        JButton VDeli_foodbtn = new JButton("Delivery_Food");
        VDeli_foodbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        VDeli_foodbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VDeli_foodbtn.setBounds(467, 352, 133, 40);
        Precep_Dashboard.add(VDeli_foodbtn);
        setLocationRelativeTo(null);



    }
}


