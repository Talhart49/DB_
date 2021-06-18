import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Admin_Dashboard_D extends JFrame {

    private JPanel Padmin_Dashboard;
    private JButton Areceptionistbtn;
    private JButton backbtn;


    public static void main(String[] args) {
        Admin_Dashboard_D frame = new Admin_Dashboard_D();
        frame.setVisible(true);
    }


    public Admin_Dashboard_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Padmin_Dashboard = new JPanel();
        Padmin_Dashboard.setBackground(new Color(107, 103, 91));
        setContentPane(Padmin_Dashboard);
        Padmin_Dashboard.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(973, 11, 309, 93);
        Padmin_Dashboard.add(backgroundlabel);

        Areceptionistbtn = new JButton("Receptionist");
        Areceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Areceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Areceptionistbtn.setBounds(204, 199, 116, 40);
        Padmin_Dashboard.add(Areceptionistbtn);

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
        Padmin_Dashboard.add(backbtn);

        JLabel addlbl = new JLabel("Add");
        addlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        addlbl.setBounds(213, 83, 85, 34);
        Padmin_Dashboard.add(addlbl);

        JButton Aadminbtn = new JButton("Admin");
        Aadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Aadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aadminbtn.setBounds(204, 148, 116, 40);
        Padmin_Dashboard.add(Aadminbtn);

        JButton Achefbtn = new JButton("Chef");
        Achefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Achefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Achefbtn.setBounds(204, 250, 116, 40);
        Padmin_Dashboard.add(Achefbtn);

        JButton Awaiterbtn = new JButton("Waiter");
        Awaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Awaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Awaiterbtn.setBounds(204, 301, 116, 40);
        Padmin_Dashboard.add(Awaiterbtn);

        JButton ADeli_Manbtn = new JButton("Delivery Man");
        ADeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        ADeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ADeli_Manbtn.setBounds(204, 352, 116, 40);
        Padmin_Dashboard.add(ADeli_Manbtn);

        JButton Aingredientsbtn = new JButton("Ingredients");
        Aingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Aingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aingredientsbtn.setBounds(204, 403, 116, 40);
        Padmin_Dashboard.add(Aingredientsbtn);

        JButton Adealsbtn = new JButton("Deals");
        Adealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Adealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Adealsbtn.setBounds(204, 454, 116, 40);
        Padmin_Dashboard.add(Adealsbtn);

        JButton Astatisticsbtn = new JButton("Statistics");
        Astatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Astatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Astatisticsbtn.setBounds(204, 505, 116, 40);
        Padmin_Dashboard.add(Astatisticsbtn);

        JButton Afood_itemsbtn = new JButton("Food_Items");
        Afood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Afood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Afood_itemsbtn.setBounds(204, 556, 116, 40);
        Padmin_Dashboard.add(Afood_itemsbtn);

        JButton Acooksbtn = new JButton("Cooks");
        Acooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Acooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Acooksbtn.setBounds(204, 607, 116, 40);
        Padmin_Dashboard.add(Acooksbtn);

        JButton Adishbtn = new JButton("Dishes");
        Adishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Adishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Adishbtn.setBounds(204, 658, 116, 40);
        Padmin_Dashboard.add(Adishbtn);





        ///////////////////////////////////////



        JLabel Viewlbl = new JLabel("View");
        Viewlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Viewlbl.setBounds(462, 83, 85, 34);
        Padmin_Dashboard.add(Viewlbl);

        JButton Vadminbtn = new JButton("Admin");
        Vadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vadminbtn.setBounds(431, 148, 116, 40);
        Padmin_Dashboard.add(Vadminbtn);

        JButton Vreceptionistbtn = new JButton("Receptionist");
        Vreceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vreceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vreceptionistbtn.setBounds(431, 199, 116, 40);
        Padmin_Dashboard.add(Vreceptionistbtn);

        JButton Vchefbtn = new JButton("Chef");
        Vchefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vchefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vchefbtn.setBounds(431, 250, 116, 40);
        Padmin_Dashboard.add(Vchefbtn);

        JButton Vwaiterbtn = new JButton("Waiter");
        Vwaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vwaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vwaiterbtn.setBounds(431, 301, 116, 40);
        Padmin_Dashboard.add(Vwaiterbtn);

        JButton VDeli_Manbtn = new JButton("Delivery Man");
        VDeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        VDeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VDeli_Manbtn.setBounds(431, 352, 116, 40);
        Padmin_Dashboard.add(VDeli_Manbtn);

        JButton Vingredientsbtn = new JButton("Ingredients");
        Vingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vingredientsbtn.setBounds(431, 403, 116, 40);
        Padmin_Dashboard.add(Vingredientsbtn);

        JButton Vdealsbtn = new JButton("Deals");
        Vdealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vdealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vdealsbtn.setBounds(431, 454, 116, 40);
        Padmin_Dashboard.add(Vdealsbtn);

        JButton Vstatisticsbtn = new JButton("Statistics");
        Vstatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vstatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vstatisticsbtn.setBounds(431, 505, 116, 40);
        Padmin_Dashboard.add(Vstatisticsbtn);

        JButton Vfood_itemsbtn = new JButton("Food_Items");
        Vfood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vfood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vfood_itemsbtn.setBounds(431, 556, 116, 40);
        Padmin_Dashboard.add(Vfood_itemsbtn);

        JButton Vcooksbtn = new JButton("Cooks");
        Vcooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vcooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vcooksbtn.setBounds(431, 607, 116, 40);
        Padmin_Dashboard.add(Vcooksbtn);

        JButton Vdishbtn = new JButton("Dishes");
        Vdishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Vdishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vdishbtn.setBounds(431, 658, 116, 40);
        Padmin_Dashboard.add(Vdishbtn);




        ///////////////////////////////////



        JLabel Updatelbl = new JLabel("Update");
        Updatelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Updatelbl.setBounds(650, 83, 85, 34);
        Padmin_Dashboard.add(Updatelbl);

        JButton Uadminbtn = new JButton("Admin");
        Uadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Uadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Uadminbtn.setBounds(622, 148, 116, 40);
        Padmin_Dashboard.add(Uadminbtn);

        JButton Ureceptionistbtn = new JButton("Receptionist");
        Ureceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ureceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ureceptionistbtn.setBounds(622, 199, 116, 40);
        Padmin_Dashboard.add(Ureceptionistbtn);

        JButton Uchefbtn = new JButton("Chef");
        Uchefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Uchefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Uchefbtn.setBounds(622, 250, 116, 40);
        Padmin_Dashboard.add(Uchefbtn);

        JButton Uwaiterbtn = new JButton("Waiter");
        Uwaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Uwaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Uwaiterbtn.setBounds(619, 301, 116, 40);
        Padmin_Dashboard.add(Uwaiterbtn);

        JButton UDeli_Manbtn = new JButton("Delivery Man");
        UDeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        UDeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        UDeli_Manbtn.setBounds(619, 352, 116, 40);
        Padmin_Dashboard.add(UDeli_Manbtn);

        JButton Uingredientsbtn = new JButton("Ingredients");
        Uingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Uingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Uingredientsbtn.setBounds(619, 403, 116, 40);
        Padmin_Dashboard.add(Uingredientsbtn);

        JButton Udealsbtn = new JButton("Deals");
        Udealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Udealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Udealsbtn.setBounds(619, 454, 116, 40);
        Padmin_Dashboard.add(Udealsbtn);

        JButton Ustatisticsbtn = new JButton("Statistics");
        Ustatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ustatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ustatisticsbtn.setBounds(619, 505, 116, 40);
        Padmin_Dashboard.add(Ustatisticsbtn);

        JButton Ufood_itemsbtn = new JButton("Food_Items");
        Ufood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ufood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ufood_itemsbtn.setBounds(619, 556, 116, 40);
        Padmin_Dashboard.add(Ufood_itemsbtn);

        JButton Ucooksbtn = new JButton("Cooks");
        Ucooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ucooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ucooksbtn.setBounds(619, 607, 116, 40);
        Padmin_Dashboard.add(Ucooksbtn);

        JButton Udishbtn = new JButton("Dishes");
        Udishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Udishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Udishbtn.setBounds(619, 658, 116, 40);
        Padmin_Dashboard.add(Udishbtn);



        ////////////////////////////////////////




        JLabel Deletelbl = new JLabel("Delete");
        Deletelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Deletelbl.setBounds(831, 83, 85, 34);
        Padmin_Dashboard.add(Deletelbl);

        JButton Dadminbtn = new JButton("Admin");
        Dadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dadminbtn.setBounds(811, 148, 116, 40);
        Padmin_Dashboard.add(Dadminbtn);

        JButton Dreceptionistbtn = new JButton("Receptionist");
        Dreceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dreceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dreceptionistbtn.setBounds(811, 199, 116, 40);
        Padmin_Dashboard.add(Dreceptionistbtn);

        JButton Dchefbtn = new JButton("Chef");
        Dchefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dchefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dchefbtn.setBounds(811, 250, 116, 40);
        Padmin_Dashboard.add(Dchefbtn);

        JButton Dwaiterbtn = new JButton("Waiter");
        Dwaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dwaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dwaiterbtn.setBounds(811, 301, 116, 40);
        Padmin_Dashboard.add(Dwaiterbtn);

        JButton DDeli_Manbtn = new JButton("Delivery Man");
        DDeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        DDeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        DDeli_Manbtn.setBounds(811, 352, 116, 40);
        Padmin_Dashboard.add(DDeli_Manbtn);

        JButton Dingredientsbtn = new JButton("Ingredients");
        Dingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dingredientsbtn.setBounds(811, 403, 116, 40);
        Padmin_Dashboard.add(Dingredientsbtn);

        JButton Ddealsbtn = new JButton("Deals");
        Ddealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ddealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ddealsbtn.setBounds(811, 454, 116, 40);
        Padmin_Dashboard.add(Ddealsbtn);

        JButton Dstatisticsbtn = new JButton("Statistics");
        Dstatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dstatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dstatisticsbtn.setBounds(811, 505, 116, 40);
        Padmin_Dashboard.add(Dstatisticsbtn);

        JButton Dfood_itemsbtn = new JButton("Food_Items");
        Dfood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dfood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dfood_itemsbtn.setBounds(811, 556, 116, 40);
        Padmin_Dashboard.add(Dfood_itemsbtn);

        JButton Dcooksbtn = new JButton("Cooks");
        Dcooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Dcooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dcooksbtn.setBounds(811, 607, 116, 40);
        Padmin_Dashboard.add(Dcooksbtn);

        JButton Ddishbtn = new JButton("Dishes");
        Ddishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Ddishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ddishbtn.setBounds(811, 658, 116, 40);
        Padmin_Dashboard.add(Ddishbtn);
        setLocationRelativeTo(null);



    }
}


