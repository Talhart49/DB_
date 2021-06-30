import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddAdmin_D extends JFrame {

    private JPanel PaddAdmin;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JTextField emailfld;
    private JPasswordField passwordfld;
    public boolean addyes=false;


    public static void main(String[] args) {
        AddAdmin_D frame = new AddAdmin_D();
        frame.setVisible(true);
    }


    public AddAdmin_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddAdmin = new JPanel();
        PaddAdmin.setBackground(new Color(107, 103, 91));
        setContentPane(PaddAdmin);
        PaddAdmin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddAdmin.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddAdmin.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddAdmin.add(idfld);
        idfld.setColumns(10);



//
//            int id= Integer.parseInt(idfld.getText());
//            String name=namefld.getText();
//            String

        Addbtn = new JButton("Add");
        Addbtn.setBackground(Color.LIGHT_GRAY);
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || namefld.getText().isBlank() || cnicfld.getText().isBlank()
                            || emailfld.getText().isBlank() || passwordfld.getToolTipText().isBlank())) {
                        if (AddAll.AddAdmin(Integer.parseInt(idfld.getText()), namefld.getText(),
                                cnicfld.getText(), emailfld.getText(), String.valueOf(passwordfld.getPassword()))) {
                            JOptionPane.showMessageDialog(null, "Added");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error Enter Again");

                        }
                    }
                else {JOptionPane.showMessageDialog(null, "Error, Please Fill all Fields");
                    }
                    idfld.setText("");
                    emailfld.setText("");
                    namefld.setText("");
                    cnicfld.setText("");
                    passwordfld.setText("");
                } catch (SQLException y) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    emailfld.setText("");
                    namefld.setText("");
                    cnicfld.setText("");
                    passwordfld.setText("");
                }

            }
        });
        Addbtn.setBounds(714, 645, 129, 29);
        PaddAdmin.add(Addbtn);

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
        PaddAdmin.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.BLACK);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cniclbl.setBounds(548, 482, 102, 42);
        PaddAdmin.add(cniclbl);

        JLabel emaillbl = new JLabel("Email :");
        emaillbl.setForeground(Color.BLACK);
        emaillbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        emaillbl.setBounds(548, 535, 102, 42);
        PaddAdmin.add(emaillbl);

        JLabel passwordlbl = new JLabel("Password :");
        passwordlbl.setForeground(Color.BLACK);
        passwordlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        passwordlbl.setBounds(548, 590, 102, 42);
        PaddAdmin.add(passwordlbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddAdmin.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 480, 283, 44);
        PaddAdmin.add(cnicfld);

        emailfld = new JTextField();
        emailfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        emailfld.setColumns(10);
        emailfld.setBounds(714, 535, 283, 44);
        PaddAdmin.add(emailfld);

        passwordfld = new JPasswordField();
        passwordfld.setForeground(Color.BLACK);
        passwordfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordfld.setBounds(714, 590, 283, 44);
        PaddAdmin.add(passwordfld);

        JLabel  Adminlbl = new JLabel("Add Admin");
        Adminlbl.setForeground(Color.BLACK);
        Adminlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
        Adminlbl.setBounds(714, 279, 210, 40);
        PaddAdmin.add(Adminlbl);


//        JTable table = new JTable();
//        table.setModel(new DefaultTableModel(
//                new Object[][] {
//                        {null, null, null, null, null},
//                },
//                new String[] {
//                        "Admin ID", "Name", "CNIC", "Email", "Password"
//                }
//        ));
//        table.setSurrendersFocusOnKeystroke(true);
//        table.setFillsViewportHeight(true);
//        table.setColumnSelectionAllowed(true);
//        table.setCellSelectionEnabled(true);
//        table.setBounds(141, 254, 509, -106);
//        PaddAdmin.add(table);


        PaddAdmin.add(backgroundlabel);

        setLocationRelativeTo(null);





    }
}


