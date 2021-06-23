import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddHomeDeli_D extends JFrame {

    private JPanel PaddhomeDeli;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField descfld;
    private JLabel homeDelilbl;
    private JTextField addressfld;
    private JTextField delimanidfld;
    private JTextField paymentfld;
    private JLabel paymentlbl;


    public static void main(String[] args) {
        AddHomeDeli_D frame = new AddHomeDeli_D();
        frame.setVisible(true);
    }


    public AddHomeDeli_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddhomeDeli = new JPanel();
        PaddhomeDeli.setBackground(new Color(107, 103, 91));
        setContentPane(PaddhomeDeli);
        PaddhomeDeli.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PaddhomeDeli.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        PaddhomeDeli.add(idlbl);


        JLabel desclbl = new JLabel("Description :");
        desclbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        desclbl.setForeground(new Color(255,255,255));
        desclbl.setBounds(548, 424, 102, 42);
        PaddhomeDeli.add(desclbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddhomeDeli.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if( AddAll.AddhomeDeli (Integer.parseInt(idfld.getText()),descfld.getText(),addressfld.getText()
                            , Integer.parseInt(paymentfld.getText()),Integer.parseInt(delimanidfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error Enter Again");

                    }
                    idfld.setText("");
                    descfld.setText("");
                    addressfld.setText("");
                    paymentfld.setText("");
                    delimanidfld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    descfld.setText("");
                    addressfld.setText("");
                    paymentfld.setText("");
                    delimanidfld.setText("");
                }

            }
        });
        Addbtn.setBounds(714, 650, 116, 40);
        PaddhomeDeli.add(Addbtn);

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
        PaddhomeDeli.add(backbtn);

        JLabel experincelbl = new JLabel("Delivery Man ID :");
        experincelbl.setForeground(Color.WHITE);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        experincelbl.setBounds(548, 594, 135, 42);
        PaddhomeDeli.add(experincelbl);

        descfld = new JTextField();
        descfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descfld.setColumns(10);
        descfld.setBounds(714, 424, 283, 44);
        PaddhomeDeli.add(descfld);

        homeDelilbl = new JLabel("Add Home Delivery");
        homeDelilbl.setForeground(Color.WHITE);
        homeDelilbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        homeDelilbl.setBounds(728, 254, 210, 40);
        PaddhomeDeli.add(homeDelilbl);

        addressfld = new JTextField();
        addressfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        addressfld.setColumns(10);
        addressfld.setBounds(714, 482, 283, 44);
        PaddhomeDeli.add(addressfld);

        delimanidfld = new JTextField();
        delimanidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        delimanidfld.setColumns(10);
        delimanidfld.setBounds(714, 595, 283, 44);
        PaddhomeDeli.add(delimanidfld);

        JLabel Addresslbl = new JLabel("Address :");
        Addresslbl.setForeground(Color.WHITE);
        Addresslbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Addresslbl.setBounds(548, 477, 102, 42);
        PaddhomeDeli.add(Addresslbl);

        paymentfld = new JTextField();
        paymentfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        paymentfld.setColumns(10);
        paymentfld.setBounds(714, 534, 283, 44);
        PaddhomeDeli.add(paymentfld);

        paymentlbl = new JLabel("Payment :");
        paymentlbl.setForeground(Color.WHITE);
        paymentlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        paymentlbl.setBounds(548, 530, 102, 42);
        PaddhomeDeli.add(paymentlbl);
        setLocationRelativeTo(null);



    }
}


