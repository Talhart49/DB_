import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddDeliMan_D extends JFrame {

    private JPanel PaddDeliMan;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JLabel DeliManlbl;
    private JTextField numberfld;


    public static void main(String[] args) {
        AddDeliMan_D frame = new AddDeliMan_D();
        frame.setVisible(true);
    }


    public AddDeliMan_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddDeliMan = new JPanel();
        PaddDeliMan.setBackground(new Color(107, 103, 91));
        setContentPane(PaddDeliMan);
        PaddDeliMan.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PaddDeliMan.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        PaddDeliMan.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        namelbl.setForeground(new Color(255,255,255));
        namelbl.setBounds(548, 424, 102, 42);
        PaddDeliMan.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddDeliMan.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AddAll.AddDeliMan(Integer.parseInt(idfld.getText()),namefld.getText(),
                            numberfld.getText(),cnicfld.getText())){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                    }
                    idfld.setText("");
                    namefld.setText("");
                    numberfld.setText("");
                    cnicfld.setText("");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        Addbtn.setBounds(714, 605, 116, 40);
        PaddDeliMan.add(Addbtn);

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
        PaddDeliMan.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.WHITE);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        cniclbl.setBounds(548, 532, 102, 42);
        PaddDeliMan.add(cniclbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddDeliMan.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 533, 283, 44);
        PaddDeliMan.add(cnicfld);

        DeliManlbl = new JLabel("Add Delivery Man");
        DeliManlbl.setForeground(Color.WHITE);
        DeliManlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        DeliManlbl.setBounds(728, 254, 210, 40);
        PaddDeliMan.add(DeliManlbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 482, 283, 44);
        PaddDeliMan.add(numberfld);

        JLabel numberlbl = new JLabel("Number :");
        numberlbl.setForeground(Color.WHITE);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        numberlbl.setBounds(548, 477, 102, 42);
        PaddDeliMan.add(numberlbl);
        setLocationRelativeTo(null);



    }
}


