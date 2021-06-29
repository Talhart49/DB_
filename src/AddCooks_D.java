import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddCooks_D extends JFrame {

    private JPanel Paddcooks;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField Chefidfld;
    private JLabel Cookslbl;
    private JLabel foodlbl;
    private JTextField foodfld;


    public static void main(String[] args) {
        AddCooks_D frame = new AddCooks_D();
        frame.setVisible(true);
    }


    public AddCooks_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Paddcooks = new JPanel();
        Paddcooks.setBackground(new Color(107, 103, 91));
        setContentPane(Paddcooks);
        Paddcooks.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);




        JLabel Chefidlbl = new JLabel("Chef ID :");
        Chefidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        Chefidlbl.setForeground(Color.BLACK);
        Chefidlbl.setBounds(548, 370, 102, 40);
        Paddcooks.add(Chefidlbl);

        Chefidfld = new JTextField();
        Chefidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Chefidfld.setBounds(714, 370, 283, 44);
        Paddcooks.add(Chefidfld);
        Chefidfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AddAll.Addcooks(Integer.parseInt(Chefidfld.getText()),
                            Integer.parseInt(foodfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                    }
                    Chefidfld.setText("");
                    foodfld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    Chefidfld.setText("");
                    foodfld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 487, 124, 29);
        Paddcooks.add(Addbtn);

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
        Paddcooks.add(backbtn);

        Cookslbl = new JLabel("Add Cooks Relation");
        Cookslbl.setForeground(Color.BLACK);
        Cookslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Cookslbl.setBounds(728, 254, 210, 40);
        Paddcooks.add(Cookslbl);

        foodlbl = new JLabel("Food Item ID :");
        foodlbl.setForeground(Color.BLACK);
        foodlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodlbl.setBounds(548, 436, 116, 40);
        Paddcooks.add(foodlbl);

        foodfld = new JTextField();
        foodfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodfld.setColumns(10);
        foodfld.setBounds(714, 432, 283, 44);
        Paddcooks.add(foodfld);

        Paddcooks.add(backgroundlabel);


        setLocationRelativeTo(null);



    }
}


