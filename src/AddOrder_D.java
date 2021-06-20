import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddOrder_D extends JFrame {

    private JPanel Paddorder;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField descfld;
    private JLabel orderlbl;
    private JTextField waiterIDfld;
    private JTextField delimanidfld;


    public static void main(String[] args) {
        AddOrder_D frame = new AddOrder_D();
        frame.setVisible(true);
    }


    public AddOrder_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Paddorder = new JPanel();
        Paddorder.setBackground(new Color(107, 103, 91));
        setContentPane(Paddorder);
        Paddorder.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        Paddorder.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        Paddorder.add(idlbl);


        JLabel desclbl = new JLabel("Description :");
        desclbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        desclbl.setForeground(new Color(255,255,255));
        desclbl.setBounds(548, 424, 102, 42);
        Paddorder.add(desclbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        Paddorder.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 611, 116, 40);
        Paddorder.add(Addbtn);

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
        Paddorder.add(backbtn);

        JLabel experincelbl = new JLabel("Delivery Man ID :");
        experincelbl.setForeground(Color.WHITE);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        experincelbl.setBounds(548, 536, 135, 42);
        Paddorder.add(experincelbl);

        descfld = new JTextField();
        descfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descfld.setColumns(10);
        descfld.setBounds(714, 424, 283, 44);
        Paddorder.add(descfld);

        orderlbl = new JLabel("Add Order");
        orderlbl.setForeground(Color.WHITE);
        orderlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        orderlbl.setBounds(728, 254, 210, 40);
        Paddorder.add(orderlbl);

        waiterIDfld = new JTextField();
        waiterIDfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        waiterIDfld.setColumns(10);
        waiterIDfld.setBounds(714, 482, 283, 44);
        Paddorder.add(waiterIDfld);

        delimanidfld = new JTextField();
        delimanidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        delimanidfld.setColumns(10);
        delimanidfld.setBounds(714, 537, 283, 44);
        Paddorder.add(delimanidfld);

        JLabel Waiteridlbl = new JLabel("Waiter ID :");
        Waiteridlbl.setForeground(Color.WHITE);
        Waiteridlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Waiteridlbl.setBounds(548, 477, 102, 42);
        Paddorder.add(Waiteridlbl);
        setLocationRelativeTo(null);



    }
}


