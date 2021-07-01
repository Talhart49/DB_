import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(foodfld.getText().isBlank() || ingredientfld.getText().isBlank() )){
                    if (AddAll.Adddish(Integer.parseInt(foodfld.getText()),
                            Integer.parseInt(ingredientfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    }

                }
                else    {
                        JOptionPane.showMessageDialog(null,"Error, Please fill all fields");

                    }
                    ingredientfld.setText("");
                    foodfld.setText("");
                }catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    ingredientfld.setText("");
                    foodfld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 501, 119, 29);
        Padddish.add(Addbtn);

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
        Padddish.add(backbtn);

        dishlbl = new JLabel("Add Dish Relation");
        dishlbl.setForeground(Color.BLACK);
        dishlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        dishlbl.setBounds(728, 254, 210, 40);
        Padddish.add(dishlbl);

        foodlbl = new JLabel("Food Item ID :");
        foodlbl.setForeground(Color.BLACK);
        foodlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodlbl.setBounds(546, 370, 158, 40);
        Padddish.add(foodlbl);

        foodfld = new JTextField();
        foodfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodfld.setColumns(10);
        foodfld.setBounds(714, 370, 283, 44);
        Padddish.add(foodfld);

        ingredidlbl = new JLabel("Ingredient ID :");
        ingredidlbl.setForeground(Color.BLACK);
        ingredidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        ingredidlbl.setBounds(546, 436, 158, 40);
        Padddish.add(ingredidlbl);

        ingredientfld = new JTextField();
        ingredientfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ingredientfld.setColumns(10);
        ingredientfld.setBounds(714, 436, 283, 44);
        Padddish.add(ingredientfld);

        Padddish.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


