import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddReceptionist_D extends JFrame {

    private JPanel PaddReceptionist;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JPasswordField passwordfld;
    private JLabel Receptionistlbl;
    private JTextField numberfld;


    public static void main(String[] args) {
        AddReceptionist_D frame = new AddReceptionist_D();
        frame.setVisible(true);
    }


    public AddReceptionist_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddReceptionist = new JPanel();
        PaddReceptionist.setBackground(new Color(107, 103, 91));
        setContentPane(PaddReceptionist);
        PaddReceptionist.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PaddReceptionist.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(548, 370, 102, 40);
        PaddReceptionist.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        namelbl.setForeground(new Color(255,255,255));
        namelbl.setBounds(548, 424, 102, 42);
        PaddReceptionist.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddReceptionist.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AddAll.AddReceptionist(Integer.parseInt(idfld.getText()),namefld.getText(),
                            numberfld.getText(),cnicfld.getText(),String.valueOf(passwordfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                        idfld.setText("");
                        namefld.setText("");
                        numberfld.setText("");
                        cnicfld.setText("");
                        passwordfld.setText("");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                        idfld.setText("");
                        namefld.setText("");
                        numberfld.setText("");
                        cnicfld.setText("");
                        passwordfld.setText("");
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        Addbtn.setBounds(714, 645, 116, 40);
        PaddReceptionist.add(Addbtn);

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
        PaddReceptionist.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.WHITE);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        cniclbl.setBounds(548, 533, 102, 42);
        PaddReceptionist.add(cniclbl);

        JLabel numberlbl = new JLabel("Contact No :");
        numberlbl.setForeground(Color.WHITE);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        numberlbl.setBounds(548, 480, 102, 42);
        PaddReceptionist.add(numberlbl);

        JLabel passwordlbl = new JLabel("Password :");
        passwordlbl.setForeground(Color.WHITE);
        passwordlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        passwordlbl.setBounds(548, 590, 102, 42);
        PaddReceptionist.add(passwordlbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddReceptionist.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 531, 283, 44);
        PaddReceptionist.add(cnicfld);

        passwordfld = new JPasswordField();
        passwordfld.setBounds(714, 590, 283, 44);
        PaddReceptionist.add(passwordfld);

        Receptionistlbl = new JLabel("Add Receptionist");
        Receptionistlbl.setForeground(Color.WHITE);
        Receptionistlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Receptionistlbl.setBounds(728, 254, 210, 40);
        PaddReceptionist.add(Receptionistlbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 480, 283, 44);
        PaddReceptionist.add(numberfld);
        setLocationRelativeTo(null);



    }
}


