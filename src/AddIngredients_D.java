import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddIngredients_D extends JFrame {

    private JPanel PaddIngredients;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JLabel Ingredientslbl;


    public static void main(String[] args) {
        AddIngredients_D frame = new AddIngredients_D();
        frame.setVisible(true);
    }


    public AddIngredients_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddIngredients = new JPanel();
        PaddIngredients.setBackground(new Color(107, 103, 91));
        setContentPane(PaddIngredients);
        PaddIngredients.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddIngredients.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddIngredients.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddIngredients.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || namefld.getText().isBlank())){
                    if (AddAll.Addingreds(Integer.parseInt(idfld.getText()),namefld.getText())){
                        JOptionPane.showMessageDialog(null,"Added");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                    }
                    idfld.setText("");
                    namefld.setText("");
                }
                else                      {
                    JOptionPane.showMessageDialog(null,"Error, Please fill all fields");}

                }catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        Addbtn.setBounds(713, 479, 123, 33);
        PaddIngredients.add(Addbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("bckR.jpg"));
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
        PaddIngredients.add(backbtn);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddIngredients.add(namefld);

        Ingredientslbl = new JLabel("Add Ingredients");
        Ingredientslbl.setForeground(Color.BLACK);
        Ingredientslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Ingredientslbl.setBounds(728, 254, 210, 40);
        PaddIngredients.add(Ingredientslbl);

        PaddIngredients.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


