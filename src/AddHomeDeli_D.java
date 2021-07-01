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
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddhomeDeli = new JPanel();
        PaddhomeDeli.setBackground(new Color(107, 103, 91));
        setContentPane(PaddhomeDeli);
        PaddhomeDeli.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddhomeDeli.add(idlbl);


        JLabel desclbl = new JLabel("Description :");
        desclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        desclbl.setForeground(Color.BLACK);
        desclbl.setBounds(548, 424, 139, 42);
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
                    if (!(idfld.getText().isBlank() || descfld.getText().isBlank() || addressfld.getText().isBlank()
                            || paymentfld.getText().isBlank() || delimanidfld.getText().isBlank())){
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
                }
                else {
                        JOptionPane.showMessageDialog(null,"Error ,Please fill all fields");
                    }
                }catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    descfld.setText("");
                    addressfld.setText("");
                    paymentfld.setText("");
                    delimanidfld.setText("");
                }

            }
        });
        Addbtn.setBounds(714, 650, 129, 33);
        PaddhomeDeli.add(Addbtn);

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
        PaddhomeDeli.add(backbtn);

        JLabel experincelbl = new JLabel("Delivery Man ID :");
        experincelbl.setForeground(Color.BLACK);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        experincelbl.setBounds(548, 594, 156, 42);
        PaddhomeDeli.add(experincelbl);

        descfld = new JTextField();
        descfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descfld.setColumns(10);
        descfld.setBounds(714, 424, 283, 44);
        PaddhomeDeli.add(descfld);

        homeDelilbl = new JLabel("Add Home Delivery");
        homeDelilbl.setForeground(Color.BLACK);
        homeDelilbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
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
        Addresslbl.setForeground(Color.BLACK);
        Addresslbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        Addresslbl.setBounds(548, 477, 102, 42);
        PaddhomeDeli.add(Addresslbl);

        paymentfld = new JTextField();
        paymentfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        paymentfld.setColumns(10);
        paymentfld.setBounds(714, 534, 283, 44);
        PaddhomeDeli.add(paymentfld);

        paymentlbl = new JLabel("Payment :");
        paymentlbl.setForeground(Color.BLACK);
        paymentlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        paymentlbl.setBounds(548, 530, 102, 42);
        PaddhomeDeli.add(paymentlbl);

        PaddhomeDeli.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


