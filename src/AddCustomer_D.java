import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddCustomer_D extends JFrame {

    private JPanel PaddCustomer;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JLabel customerlbl;
    private JTextField numberfld;
    private JTextField delimanidfld;


    public static void main(String[] args) {
        AddCustomer_D frame = new AddCustomer_D();
        frame.setVisible(true);
    }


    public AddCustomer_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddCustomer = new JPanel();
        PaddCustomer.setBackground(new Color(107, 103, 91));
        setContentPane(PaddCustomer);
        PaddCustomer.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddCustomer.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddCustomer.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddCustomer.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if( AddAll.Addcustomer (Integer.parseInt(idfld.getText()),namefld.getText(),numberfld.getText()
                            ,cnicfld.getText(),Integer.parseInt(delimanidfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error Enter Again");

                    }
                    idfld.setText("");
                    namefld.setText("");
                    numberfld.setText("");
                    cnicfld.setText("");
                    delimanidfld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    namefld.setText("");
                    numberfld.setText("");
                    cnicfld.setText("");
                    delimanidfld.setText("");
                }

            }
        });
        Addbtn.setBounds(714, 643, 122, 29);
        PaddCustomer.add(Addbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
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
        PaddCustomer.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.BLACK);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cniclbl.setBounds(548, 532, 102, 42);
        PaddCustomer.add(cniclbl);

        JLabel experincelbl = new JLabel("Delivery Man ID :");
        experincelbl.setForeground(Color.BLACK);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        experincelbl.setBounds(548, 590, 156, 42);
        PaddCustomer.add(experincelbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddCustomer.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 533, 283, 44);
        PaddCustomer.add(cnicfld);

        customerlbl = new JLabel("Add Customer");
        customerlbl.setForeground(Color.BLACK);
        customerlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        customerlbl.setBounds(728, 254, 210, 40);
        PaddCustomer.add(customerlbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 482, 283, 44);
        PaddCustomer.add(numberfld);

        delimanidfld = new JTextField();
        delimanidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        delimanidfld.setColumns(10);
        delimanidfld.setBounds(714, 588, 283, 44);
        PaddCustomer.add(delimanidfld);

        JLabel numberlbl = new JLabel("Number :");
        numberlbl.setForeground(Color.BLACK);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        numberlbl.setBounds(548, 477, 102, 42);
        PaddCustomer.add(numberlbl);

        PaddCustomer.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


