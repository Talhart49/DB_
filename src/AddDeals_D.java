import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddDeals_D extends JFrame {

    private JPanel PaddDeals;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField Descfld;
    private JLabel Dealslbl;
    private JTextField pricefld;
    private JTextField foodidfld;
    private JLabel foodidlbl;


    public static void main(String[] args) {
        AddDeals_D frame = new AddDeals_D();
        frame.setVisible(true);
    }


    public AddDeals_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddDeals = new JPanel();
        PaddDeals.setBackground(new Color(107, 103, 91));
        setContentPane(PaddDeals);
        PaddDeals.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddDeals.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddDeals.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddDeals.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if( AddAll.AddDeals (Integer.parseInt(idfld.getText()),namefld.getText(), Integer.parseInt(pricefld.getText())
                            , (Descfld.getText()),Integer.parseInt(foodidfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error Enter Again");

                    }
                    idfld.setText("");
                    namefld.setText("");
                    pricefld.setText("");
                    Descfld.setText("");
                    foodidfld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    namefld.setText("");
                    pricefld.setText("");
                    Descfld.setText("");
                    foodidfld.setText("");
                }

            }
        });
        Addbtn.setBounds(714, 651, 124, 29);
        PaddDeals.add(Addbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Admin_Dashboard_D a=new Admin_Dashboard_D();
                a.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 139, 33);
        PaddDeals.add(backbtn);

        JLabel desclbl = new JLabel("Description :");
        desclbl.setForeground(Color.BLACK);
        desclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        desclbl.setBounds(548, 532, 139, 42);
        PaddDeals.add(desclbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddDeals.add(namefld);

        Descfld = new JTextField();
        Descfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Descfld.setColumns(10);
        Descfld.setBounds(714, 533, 283, 40);
        PaddDeals.add(Descfld);

        Dealslbl = new JLabel("Add Deals");
        Dealslbl.setForeground(Color.BLACK);
        Dealslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Dealslbl.setBounds(728, 254, 210, 40);
        PaddDeals.add(Dealslbl);

        pricefld = new JTextField();
        pricefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pricefld.setColumns(10);
        pricefld.setBounds(714, 482, 283, 44);
        PaddDeals.add(pricefld);

        JLabel pricelbl = new JLabel("Price :");
        pricelbl.setForeground(Color.BLACK);
        pricelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        pricelbl.setBounds(548, 477, 102, 42);
        PaddDeals.add(pricelbl);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setColumns(10);
        foodidfld.setBounds(714, 584, 283, 44);
        PaddDeals.add(foodidfld);

        foodidlbl = new JLabel("Food Item ID :");
        foodidlbl.setForeground(Color.BLACK);
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodidlbl.setBounds(548, 585, 139, 40);
        PaddDeals.add(foodidlbl);

        PaddDeals.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


