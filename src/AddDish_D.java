import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddDish_D extends JFrame {

    private JPanel Padddish;
    private JButton Addbtn;
    private JButton backbtn;
    private JLabel dishlbl;
    private JLabel foodlbl;
    private JTextField foodfld;
    private JLabel ingredidlbl;
    private JTextField ingredientfld;


    public static void main(String[] args) {
        AddDish_D frame = new AddDish_D();
        frame.setVisible(true);
    }


    public AddDish_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Padddish = new JPanel();
        Padddish.setBackground(new Color(107, 103, 91));
        setContentPane(Padddish);
        Padddish.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        Padddish.add(backgroundlabel);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 518, 116, 40);
        Padddish.add(Addbtn);

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
        Padddish.add(backbtn);

        dishlbl = new JLabel("Add Dish Relation");
        dishlbl.setForeground(Color.WHITE);
        dishlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        dishlbl.setBounds(728, 254, 210, 40);
        Padddish.add(dishlbl);

        foodlbl = new JLabel("Food Item ID :");
        foodlbl.setForeground(Color.WHITE);
        foodlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodlbl.setBounds(546, 370, 116, 40);
        Padddish.add(foodlbl);

        foodfld = new JTextField();
        foodfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodfld.setColumns(10);
        foodfld.setBounds(714, 370, 283, 44);
        Padddish.add(foodfld);

        ingredidlbl = new JLabel("Ingredient ID :");
        ingredidlbl.setForeground(Color.WHITE);
        ingredidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ingredidlbl.setBounds(546, 436, 116, 40);
        Padddish.add(ingredidlbl);

        ingredientfld = new JTextField();
        ingredientfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ingredientfld.setColumns(10);
        ingredientfld.setBounds(714, 436, 283, 44);
        Padddish.add(ingredientfld);
        setLocationRelativeTo(null);



    }
}


