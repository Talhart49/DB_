import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        Paddcooks.add(backgroundlabel);




        JLabel Chefidlbl = new JLabel("Chef ID :");
        Chefidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Chefidlbl.setForeground(new Color(255,255,255));
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
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 561, 116, 40);
        Paddcooks.add(Addbtn);

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
        Paddcooks.add(backbtn);

        Cookslbl = new JLabel("Add Cooks Relation");
        Cookslbl.setForeground(Color.WHITE);
        Cookslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Cookslbl.setBounds(728, 254, 210, 40);
        Paddcooks.add(Cookslbl);

        foodlbl = new JLabel("Food Item ID :");
        foodlbl.setForeground(Color.WHITE);
        foodlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodlbl.setBounds(548, 436, 116, 40);
        Paddcooks.add(foodlbl);

        foodfld = new JTextField();
        foodfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodfld.setColumns(10);
        foodfld.setBounds(714, 432, 283, 44);
        Paddcooks.add(foodfld);
        setLocationRelativeTo(null);



    }
}


