import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddChef_D extends JFrame {

    private JPanel PaddChef;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JLabel Cheflbl;
    private JTextField numberfld;
    private JTextField experincefld;


    public static void main(String[] args) {
        AddChef_D frame = new AddChef_D();
        frame.setVisible(true);
    }


    public AddChef_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddChef = new JPanel();
        PaddChef.setBackground(new Color(107, 103, 91));
        setContentPane(PaddChef);
        PaddChef.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, -16, 1370, 765);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddChef.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddChef.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddChef.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || namefld.getText().isBlank() || cnicfld.getText().isBlank()
                            || numberfld.getText().isBlank() || experincefld.getToolTipText().isBlank())) {
                        if (AddAll.AddChef(Integer.parseInt(idfld.getText()), namefld.getText(),
                                numberfld.getText(), cnicfld.getText(), Integer.parseInt(experincefld.getText()))) {
                            JOptionPane.showMessageDialog(null, "Added");


                        } else {
                            JOptionPane.showMessageDialog(null, "Error, Please Enter Again");
                        }

                    }
                else{             JOptionPane.showMessageDialog(null, "Error, Please Fill all Fields");
                    }
                    idfld.setText("");
                    namefld.setText("");
                    numberfld.setText("");
                    cnicfld.setText("");
                    experincefld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    idfld.setText("");
                    namefld.setText("");
                    numberfld.setText("");
                    cnicfld.setText("");
                    experincefld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 643, 120, 29);
        PaddChef.add(Addbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
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
        PaddChef.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.BLACK);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cniclbl.setBounds(548, 532, 102, 42);
        PaddChef.add(cniclbl);

        JLabel experincelbl = new JLabel("Experince :");
        experincelbl.setForeground(Color.BLACK);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        experincelbl.setBounds(548, 590, 102, 42);
        PaddChef.add(experincelbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddChef.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 533, 283, 44);
        PaddChef.add(cnicfld);

        Cheflbl = new JLabel("Add Chef");
        Cheflbl.setForeground(Color.BLACK);
        Cheflbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Cheflbl.setBounds(728, 254, 210, 40);
        PaddChef.add(Cheflbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 482, 283, 44);
        PaddChef.add(numberfld);

        experincefld = new JTextField();
        experincefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        experincefld.setColumns(10);
        experincefld.setBounds(714, 588, 283, 44);
        PaddChef.add(experincefld);

        JLabel numberlbl = new JLabel("Number :");
        numberlbl.setForeground(Color.BLACK);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        numberlbl.setBounds(548, 477, 102, 42);
        PaddChef.add(numberlbl);

        PaddChef.add(backgroundlabel);


        setLocationRelativeTo(null);



    }
}


