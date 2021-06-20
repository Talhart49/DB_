import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Paddfo = new JPanel();
        Paddfo.setBackground(new Color(107, 103, 91));
        setContentPane(Paddfo);
        Paddfo.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        Paddfo.add(backgroundlabel);




        JLabel foodidlbl = new JLabel("Food ID :");
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodidlbl.setForeground(new Color(255,255,255));
        foodidlbl.setBounds(548, 370, 102, 40);
        Paddfo.add(foodidlbl);


        JLabel orderidlbl = new JLabel("Order ID :");
        orderidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        orderidlbl.setForeground(new Color(255,255,255));
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
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 490, 116, 40);
        Paddfo.add(Addbtn);

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
        Paddfo.add(backbtn);

        orderIDfld = new JTextField();
        orderIDfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        orderIDfld.setColumns(10);
        orderIDfld.setBounds(714, 424, 283, 44);
        Paddfo.add(orderIDfld);

        FOlbl = new JLabel("Add Food_Order Relation");
        FOlbl.setForeground(Color.WHITE);
        FOlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        FOlbl.setBounds(728, 254, 242, 40);
        Paddfo.add(FOlbl);
        setLocationRelativeTo(null);



    }
}


