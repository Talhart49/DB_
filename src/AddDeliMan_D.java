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
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddDeliMan = new JPanel();
        PaddDeliMan.setBackground(new Color(107, 103, 91));
        setContentPane(PaddDeliMan);
        PaddDeliMan.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddDeliMan.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
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
                    if (!(idfld.getText().isBlank() || namefld.getText().isBlank() || numberfld.getText().isBlank()
                            || cnicfld.getText().isBlank())){
                    if (AddAll.AddDeliMan(Integer.parseInt(idfld.getText()),namefld.getText(),
                            numberfld.getText(),cnicfld.getText())){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                    }

                }
                else {
                        JOptionPane.showMessageDialog(null,"Error, Please fill all fields");
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
        Addbtn.setBounds(714, 605, 127, 29);
        PaddDeliMan.add(Addbtn);

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
        backbtn.setBounds(0, 0, 133, 33);
        PaddDeliMan.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.BLACK);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
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
        DeliManlbl.setForeground(Color.BLACK);
        DeliManlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        DeliManlbl.setBounds(728, 254, 210, 40);
        PaddDeliMan.add(DeliManlbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 482, 283, 44);
        PaddDeliMan.add(numberfld);

        JLabel numberlbl = new JLabel("Number :");
        numberlbl.setForeground(Color.BLACK);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        numberlbl.setBounds(548, 477, 102, 42);
        PaddDeliMan.add(numberlbl);

        PaddDeliMan.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


