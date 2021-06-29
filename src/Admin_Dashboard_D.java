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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\dashR.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);

        Areceptionistbtn = new JButton("Receptionist");
        Areceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Areceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddReceptionist_D addReceptionist_d=new AddReceptionist_D();
                addReceptionist_d.setVisible(true);
            }
        });
        Areceptionistbtn.setBounds(204, 199, 129, 33);
        Padmin_Dashboard.add(Areceptionistbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ALogin_D aLogin_d=new ALogin_D();
                aLogin_d.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 139, 33);
        Padmin_Dashboard.add(backbtn);

        JLabel addlbl = new JLabel("Add");
        addlbl.setForeground(new Color(255, 255, 255));
        addlbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addlbl.setBounds(213, 83, 85, 34);
        Padmin_Dashboard.add(addlbl);

        JButton Aadminbtn = new JButton("Admin");
        Aadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddAdmin_D addAdmin_d=new AddAdmin_D();
                addAdmin_d.setVisible(true);
            }
        });
        Aadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aadminbtn.setBounds(204, 148, 129, 33);
        Padmin_Dashboard.add(Aadminbtn);

        JButton Achefbtn = new JButton("Chef");
        Achefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddChef_D addChef_d=new AddChef_D();
                addChef_d.setVisible(true);
            }
        });
        Achefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Achefbtn.setBounds(204, 250, 129, 33);
        Padmin_Dashboard.add(Achefbtn);

        JButton Awaiterbtn = new JButton("Waiter");
        Awaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddWaiter_D addWaiter_d=new AddWaiter_D();
                addWaiter_d.setVisible(true);
            }
        });
        Awaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Awaiterbtn.setBounds(204, 301, 129, 33);
        Padmin_Dashboard.add(Awaiterbtn);

        JButton ADeli_Manbtn = new JButton("Delivery Man");
        ADeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddDeliMan_D addDeliMan_d=new AddDeliMan_D();
                addDeliMan_d.setVisible(true);
            }
        });
        ADeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ADeli_Manbtn.setBounds(204, 352, 129, 33);
        Padmin_Dashboard.add(ADeli_Manbtn);

        JButton Aingredientsbtn = new JButton("Ingredients");
        Aingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddIngredients_D addIngredients_d=new AddIngredients_D();
                addIngredients_d.setVisible(true);
            }
        });
        Aingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Aingredientsbtn.setBounds(204, 403, 129, 33);
        Padmin_Dashboard.add(Aingredientsbtn);

        JButton Adealsbtn = new JButton("Deals");
        Adealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddDeals_D addDeals_d=new AddDeals_D();
                addDeals_d.setVisible(true);
            }
        });
        Adealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Adealsbtn.setBounds(204, 454, 129, 33);
        Padmin_Dashboard.add(Adealsbtn);

        JButton Astatisticsbtn = new JButton("Statistics");
        Astatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddStats_D addStats_d=new AddStats_D();
                addStats_d.setVisible(true);
            }
        });
        Astatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Astatisticsbtn.setBounds(204, 505, 129, 33);
        Padmin_Dashboard.add(Astatisticsbtn);

        JButton Afood_itemsbtn = new JButton("Food_Items");
        Afood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddFood_D addFood_d=new AddFood_D();
                addFood_d.setVisible(true);
            }
        });
        Afood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Afood_itemsbtn.setBounds(204, 556, 129, 33);
        Padmin_Dashboard.add(Afood_itemsbtn);

        JButton Acooksbtn = new JButton("Cooks");
        Acooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddCooks_D addCooks_d=new AddCooks_D();
                addCooks_d.setVisible(true);
            }
        });
        Acooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Acooksbtn.setBounds(204, 607, 129, 33);
        Padmin_Dashboard.add(Acooksbtn);

        JButton Adishbtn = new JButton("Dishes");
        Adishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddDish_D addDish_d=new AddDish_D();
                addDish_d.setVisible(true);
            }
        });
        Adishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Adishbtn.setBounds(204, 658, 129, 33);
        Padmin_Dashboard.add(Adishbtn);





        ///////////////////////////////////////



        JLabel Viewlbl = new JLabel("View/Search");
        Viewlbl.setForeground(new Color(255, 255, 255));
        Viewlbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Viewlbl.setBounds(479, 83, 121, 34);
        Padmin_Dashboard.add(Viewlbl);

        JButton Vadminbtn = new JButton("Admin");
        Vadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewAdmin_D viewAdmin_d=new ViewAdmin_D();
                viewAdmin_d.setVisible(true);
            }
        });
        Vadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vadminbtn.setBounds(467, 148, 129, 33);
        Padmin_Dashboard.add(Vadminbtn);

        JButton Vreceptionistbtn = new JButton("Receptionist");
        Vreceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewReceptionist_D viewReceptionist_d=new ViewReceptionist_D();
                viewReceptionist_d.setVisible(true);
            }
        });
        Vreceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vreceptionistbtn.setBounds(467, 199, 129, 33);
        Padmin_Dashboard.add(Vreceptionistbtn);

        JButton Vchefbtn = new JButton("Chef");
        Vchefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewChef_D viewChef_d=new ViewChef_D();
                viewChef_d.setVisible(true);
            }
        });
        Vchefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vchefbtn.setBounds(467, 250, 129, 33);
        Padmin_Dashboard.add(Vchefbtn);

        JButton Vwaiterbtn = new JButton("Waiter");
        Vwaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewWaiter_D viewWaiter_d=new ViewWaiter_D();
                viewWaiter_d.setVisible(true);
            }
        });
        Vwaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vwaiterbtn.setBounds(467, 301, 129, 33);
        Padmin_Dashboard.add(Vwaiterbtn);

        JButton VDeli_Manbtn = new JButton("Delivery Man");
        VDeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewDeliMan_D viewDeliMan_d=new ViewDeliMan_D();
                viewDeliMan_d.setVisible(true);
            }
        });
        VDeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        VDeli_Manbtn.setBounds(467, 352, 129, 33);
        Padmin_Dashboard.add(VDeli_Manbtn);

        JButton Vingredientsbtn = new JButton("Ingredients");
        Vingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewIngredients_D viewIngredients_d=new ViewIngredients_D();
                viewIngredients_d.setVisible(true);
            }
        });
        Vingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vingredientsbtn.setBounds(467, 403, 129, 33);
        Padmin_Dashboard.add(Vingredientsbtn);

        JButton Vdealsbtn = new JButton("Deals");
        Vdealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewDeals_D viewDeals_d=new ViewDeals_D();
                viewDeals_d.setVisible(true);
            }
        });
        Vdealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vdealsbtn.setBounds(467, 454, 129, 33);
        Padmin_Dashboard.add(Vdealsbtn);

        JButton Vstatisticsbtn = new JButton("Statistics");
        Vstatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewStats_D viewStats_d=new ViewStats_D();
                viewStats_d.setVisible(true);
            }
        });
        Vstatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vstatisticsbtn.setBounds(467, 505, 129, 33);
        Padmin_Dashboard.add(Vstatisticsbtn);

        JButton Vfood_itemsbtn = new JButton("Food_Items");
        Vfood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Viewfood_D viewfood_d=new Viewfood_D();
                viewfood_d.setVisible(true);
            }
        });
        Vfood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vfood_itemsbtn.setBounds(467, 556, 129, 33);
        Padmin_Dashboard.add(Vfood_itemsbtn);

        JButton Vcooksbtn = new JButton("Cooks");
        Vcooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewCooks_D viewCooks_d=new ViewCooks_D();
                viewCooks_d.setVisible(true);
            }
        });
        Vcooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vcooksbtn.setBounds(467, 607, 129, 33);
        Padmin_Dashboard.add(Vcooksbtn);

        JButton Vdishbtn = new JButton("Dishes");
        Vdishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ViewDish_D viewDish_d=new ViewDish_D();
                viewDish_d.setVisible(true);
            }
        });
        Vdishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Vdishbtn.setBounds(467, 658, 129, 33);
        Padmin_Dashboard.add(Vdishbtn);



        ////////////////////////////////////////




        JLabel Deletelbl = new JLabel("Delete/Update");
        Deletelbl.setForeground(new Color(255, 255, 255));
        Deletelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Deletelbl.setBounds(787, 83, 139, 34);
        Padmin_Dashboard.add(Deletelbl);

        JButton Dadminbtn = new JButton("Admin");
        Dadminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDAdmin_D udAdmin_d=new UDAdmin_D();
                udAdmin_d.setVisible(true);
            }
        });
        Dadminbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dadminbtn.setBounds(780, 148, 129, 33);
        Padmin_Dashboard.add(Dadminbtn);

        JButton Dreceptionistbtn = new JButton("Receptionist");
        Dreceptionistbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDReceptionist_D udReceptionist_d=new UDReceptionist_D();
                udReceptionist_d.setVisible(true);
            }
        });
        Dreceptionistbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dreceptionistbtn.setBounds(780, 199, 129, 33);
        Padmin_Dashboard.add(Dreceptionistbtn);

        JButton Dchefbtn = new JButton("Chef");
        Dchefbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDChef_D udChef_d=new UDChef_D();
                udChef_d.setVisible(true);
            }
        });
        Dchefbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dchefbtn.setBounds(780, 250, 129, 33);
        Padmin_Dashboard.add(Dchefbtn);

        JButton Dwaiterbtn = new JButton("Waiter");
        Dwaiterbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDWaiter_D udWaiter_d=new UDWaiter_D();
                udWaiter_d.setVisible(true);
            }
        });
        Dwaiterbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dwaiterbtn.setBounds(780, 301, 129, 33);
        Padmin_Dashboard.add(Dwaiterbtn);

        JButton DDeli_Manbtn = new JButton("Delivery Man");
        DDeli_Manbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDDeliMan_D udDeliMan_d=new UDDeliMan_D();
                udDeliMan_d.setVisible(true);
            }
        });
        DDeli_Manbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        DDeli_Manbtn.setBounds(780, 352, 129, 33);
        Padmin_Dashboard.add(DDeli_Manbtn);

        JButton Dingredientsbtn = new JButton("Ingredients");
        Dingredientsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDIngred_D udIngred_d=new UDIngred_D();
                udIngred_d.setVisible(true);
            }
        });
        Dingredientsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dingredientsbtn.setBounds(780, 403, 129, 33);
        Padmin_Dashboard.add(Dingredientsbtn);

        JButton Ddealsbtn = new JButton("Deals");
        Ddealsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDDeals_D udDeals_d=new UDDeals_D();
                udDeals_d.setVisible(true);
            }
        });
        Ddealsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ddealsbtn.setBounds(780, 454, 129, 33);
        Padmin_Dashboard.add(Ddealsbtn);

        JButton Dstatisticsbtn = new JButton("Statistics");
        Dstatisticsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDStats_D udStats_d=new UDStats_D();
                udStats_d.setVisible(true);
            }
        });
        Dstatisticsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dstatisticsbtn.setBounds(780, 505, 129, 33);
        Padmin_Dashboard.add(Dstatisticsbtn);

        JButton Dfood_itemsbtn = new JButton("Food_Items");
        Dfood_itemsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                UDfood_D uDfood_d=new UDfood_D();
                uDfood_d.setVisible(true);
            }
        });
        Dfood_itemsbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dfood_itemsbtn.setBounds(780, 556, 129, 33);
        Padmin_Dashboard.add(Dfood_itemsbtn);

        JButton Dcooksbtn = new JButton("Cooks");
        Dcooksbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Not Available");
            }
        });
        Dcooksbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Dcooksbtn.setBounds(780, 607, 129, 33);
        Padmin_Dashboard.add(Dcooksbtn);

        JButton Ddishbtn = new JButton("Dishes");
        Ddishbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Not Available");
            }
        });
        Ddishbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Ddishbtn.setBounds(780, 658, 129, 33);
        Padmin_Dashboard.add(Ddishbtn);

        Padmin_Dashboard.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


