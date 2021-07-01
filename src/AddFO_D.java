import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddFO_D extends JFrame {

    private JPanel Paddfo;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField foodidfld;
    private JTextField orderIDfld;
    private JLabel FOlbl;


    public static void main(String[] args) {
        AddFO_D frame = new AddFO_D();
        frame.setVisible(true);
    }


    public AddFO_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Paddfo = new JPanel();
        Paddfo.setBackground(new Color(107, 103, 91));
        setContentPane(Paddfo);
        Paddfo.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel foodidlbl = new JLabel("Food ID :");
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodidlbl.setForeground(Color.BLACK);
        foodidlbl.setBounds(548, 370, 102, 40);
        Paddfo.add(foodidlbl);


        JLabel orderidlbl = new JLabel("Order ID :");
        orderidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        orderidlbl.setForeground(Color.BLACK);
        orderidlbl.setBounds(548, 424, 102, 42);
        Paddfo.add(orderidlbl);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setBounds(714, 370, 283, 44);
        Paddfo.add(foodidfld);
        foodidfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(foodidfld.getText().isBlank() || orderIDfld.getText().isBlank())){
                    if (AddAll.AddFO(Integer.parseInt(foodidfld.getText()),
                            Integer.parseInt(orderIDfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                        foodidfld.setText("");
                        orderIDfld.setText("");
                    }


                }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please fill all fields");
                    }
                }catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    foodidfld.setText("");
                    orderIDfld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 490, 124, 33);
        Paddfo.add(Addbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Recep_Dashboard_D a=new Recep_Dashboard_D();
                a.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 139, 33);
        Paddfo.add(backbtn);

        orderIDfld = new JTextField();
        orderIDfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        orderIDfld.setColumns(10);
        orderIDfld.setBounds(714, 424, 283, 44);
        Paddfo.add(orderIDfld);

        FOlbl = new JLabel("Add Food_Order Relation");
        FOlbl.setForeground(Color.BLACK);
        FOlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        FOlbl.setBounds(728, 254, 269, 40);
        Paddfo.add(FOlbl);

        Paddfo.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


