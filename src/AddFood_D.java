import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddFood_D extends JFrame {

    private JPanel PaddFood;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JLabel Foodlbl;
    private JTextField pricefld;


    public static void main(String[] args) {
        AddFood_D frame = new AddFood_D();
        frame.setVisible(true);
    }


    public AddFood_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddFood = new JPanel();
        PaddFood.setBackground(new Color(107, 103, 91));
        setContentPane(PaddFood);
        PaddFood.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PaddFood.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        PaddFood.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        namelbl.setForeground(new Color(255,255,255));
        namelbl.setBounds(548, 424, 102, 42);
        PaddFood.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddFood.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 561, 116, 40);
        PaddFood.add(Addbtn);

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
        PaddFood.add(backbtn);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddFood.add(namefld);

        Foodlbl = new JLabel("Add Food Items");
        Foodlbl.setForeground(Color.WHITE);
        Foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Foodlbl.setBounds(728, 254, 210, 40);
        PaddFood.add(Foodlbl);

        pricefld = new JTextField();
        pricefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pricefld.setColumns(10);
        pricefld.setBounds(714, 482, 283, 44);
        PaddFood.add(pricefld);

        JLabel pricelbl = new JLabel("Price :");
        pricelbl.setForeground(Color.WHITE);
        pricelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        pricelbl.setBounds(548, 477, 102, 42);
        PaddFood.add(pricelbl);
        setLocationRelativeTo(null);



    }
}


