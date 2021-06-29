import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setBackground(new Color(240, 240, 240));
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddFood.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
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
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AddAll.Addfood(Integer.parseInt(idfld.getText()),namefld.getText(), Integer.parseInt(pricefld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                        idfld.setText("");
                        namefld.setText("");
                        pricefld.setText("");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                        idfld.setText("");
                        namefld.setText("");
                        pricefld.setText("");
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        Addbtn.setBounds(714, 561, 116, 40);
        PaddFood.add(Addbtn);

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
        PaddFood.add(backbtn);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddFood.add(namefld);

        Foodlbl = new JLabel("Add Food Items");
        Foodlbl.setForeground(Color.BLACK);
        Foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Foodlbl.setBounds(728, 254, 210, 40);
        PaddFood.add(Foodlbl);

        pricefld = new JTextField();
        pricefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pricefld.setColumns(10);
        pricefld.setBounds(714, 482, 283, 44);
        PaddFood.add(pricefld);

        JLabel pricelbl = new JLabel("Price :");
        pricelbl.setForeground(Color.BLACK);
        pricelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        pricelbl.setBounds(548, 477, 102, 42);
        PaddFood.add(pricelbl);

        PaddFood.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


