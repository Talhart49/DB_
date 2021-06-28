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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\dashR.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);

        AHomeDelibtn = new JButton("Home Delivery");
        AHomeDelibtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        AHomeDelibtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddHomeDeli_D addHomeDeli_d=new AddHomeDeli_D();
                addHomeDeli_d.setVisible(true);
            }
        });
        AHomeDelibtn.setBounds(204, 265, 133, 29);
        Precep_Dashboard.add(AHomeDelibtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RLogin_D rLogin_d=new RLogin_D();

                rLogin_d.setVisible(true);


            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 133, 33);
        Precep_Dashboard.add(backbtn);

        JLabel addlbl = new JLabel("Add");
        addlbl.setForeground(new Color(255, 255, 255));
        addlbl.setFont(new Font("Tahoma", Font.PLAIN, 22));
        addlbl.setBounds(204, 116, 85, 34);
        Precep_Dashboard.add(addlbl);

        JButton Acustomerbtn = new JButton("Customer");
        Acustomerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddCustomer_D addCustomer_d =new AddCustomer_D();
                addCustomer_d.setVisible(true);
            }
        });
        Acustomerbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Acustomerbtn.setBounds(204, 209, 133, 29);
        Precep_Dashboard.add(Acustomerbtn);

        JButton Aorderbtn = new JButton("Order");
        Aorderbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddOrder_D addOrder_d=new AddOrder_D();
                addOrder_d.setVisible(true);
            }
        });
        Aorderbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aorderbtn.setBounds(204, 316, 133, 29);
        Precep_Dashboard.add(Aorderbtn);

        JButton AInhousebtn = new JButton("Order_Food");
        AInhousebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddFO_D addFO_d=new AddFO_D();
                addFO_d.setVisible(true);
            }
        });
        AInhousebtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        AInhousebtn.setBounds(204, 367, 133, 29);
        Precep_Dashboard.add(AInhousebtn);

        JButton ADeli_foodbtn = new JButton("Delivery_Food");
        ADeli_foodbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ADDFHD_D addfhd_d=new ADDFHD_D();
                addfhd_d.setVisible(true);
            }
        });
        ADeli_foodbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ADeli_foodbtn.setBounds(204, 418, 133, 29);
        Precep_Dashboard.add(ADeli_foodbtn);





        ///////////////////////////////////////



        JLabel Viewlbl = new JLabel("View/Search");
        Viewlbl.setForeground(new Color(255, 255, 255));
        Viewlbl.setFont(new Font("Tahoma", Font.PLAIN, 22));
        Viewlbl.setBounds(478, 116, 133, 34);
        Precep_Dashboard.add(Viewlbl);

        JButton Vcustomerbtn = new JButton("Customer");
        Vcustomerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewCustomer_D viewCustomer_d=new ViewCustomer_D();
                viewCustomer_d.setVisible(true);
            }
        });
        Vcustomerbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vcustomerbtn.setBounds(467, 209, 133, 29);
        Precep_Dashboard.add(Vcustomerbtn);

        JButton VHomeDelibtn = new JButton("Home Delivery");
        VHomeDelibtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewHomeDeli_D viewHomeDeli_d=new ViewHomeDeli_D();
                viewHomeDeli_d.setVisible(true);
            }
        });
        VHomeDelibtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VHomeDelibtn.setBounds(467, 265, 133, 29);
        Precep_Dashboard.add(VHomeDelibtn);

        JButton Vorderbtn = new JButton("Order");
        Vorderbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewOrder_D viewOrder_d=new ViewOrder_D();
                viewOrder_d.setVisible(true);
            }
        });
        Vorderbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vorderbtn.setBounds(467, 316, 133, 29);
        Precep_Dashboard.add(Vorderbtn);

        JButton VInhousebtn = new JButton("Order_Food");
        VInhousebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewFO_D viewFO_d=new ViewFO_D();
                viewFO_d.setVisible(true);
            }
        });
        VInhousebtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VInhousebtn.setBounds(467, 367, 133, 29);
        Precep_Dashboard.add(VInhousebtn);

        JButton VDeli_foodbtn = new JButton("Delivery_Food");
        VDeli_foodbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewFHD_D viewFHD_d=new ViewFHD_D();
                viewFHD_d.setVisible(true);
            }
        });
        VDeli_foodbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VDeli_foodbtn.setBounds(467, 418, 133, 29);
        Precep_Dashboard.add(VDeli_foodbtn);

        Precep_Dashboard.add(backgroundlabel);


        setLocationRelativeTo(null);



    }
}


