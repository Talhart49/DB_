import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddWaiter_D extends JFrame {

    private JPanel PaddWaiter;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField namefld;
    private JTextField cnicfld;
    private JLabel Waiterlbl;
    private JTextField numberfld;


    public static void main(String[] args) {
        AddWaiter_D frame = new AddWaiter_D();
        frame.setVisible(true);
    }


    public AddWaiter_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddWaiter = new JPanel();
        PaddWaiter.setBackground(new Color(107, 103, 91));
        setContentPane(PaddWaiter);
        PaddWaiter.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        PaddWaiter.add(idlbl);


        JLabel namelbl = new JLabel("Name :");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        namelbl.setForeground(Color.BLACK);
        namelbl.setBounds(548, 424, 102, 42);
        PaddWaiter.add(namelbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddWaiter.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || namefld.getText().isBlank() || numberfld.getText().isBlank()
                            || cnicfld.getText().isBlank())){
                    if (AddAll.AddWaiter(Integer.parseInt(idfld.getText()),namefld.getText(),
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
                }

                else {
                        JOptionPane.showMessageDialog(null,"Error, Please fill all fields");
                    }
                }catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        Addbtn.setBounds(714, 605, 126, 33);
        PaddWaiter.add(Addbtn);

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
        PaddWaiter.add(backbtn);

        JLabel cniclbl = new JLabel("CNIC :");
        cniclbl.setForeground(Color.BLACK);
        cniclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cniclbl.setBounds(548, 532, 102, 42);
        PaddWaiter.add(cniclbl);

        namefld = new JTextField();
        namefld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        namefld.setColumns(10);
        namefld.setBounds(714, 424, 283, 44);
        PaddWaiter.add(namefld);

        cnicfld = new JTextField();
        cnicfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cnicfld.setColumns(10);
        cnicfld.setBounds(714, 533, 283, 44);
        PaddWaiter.add(cnicfld);

        Waiterlbl = new JLabel("Add Waiter");
        Waiterlbl.setForeground(Color.BLACK);
        Waiterlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Waiterlbl.setBounds(728, 254, 210, 40);
        PaddWaiter.add(Waiterlbl);

        numberfld = new JTextField();
        numberfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        numberfld.setColumns(10);
        numberfld.setBounds(714, 482, 283, 44);
        PaddWaiter.add(numberfld);

        JLabel numberlbl = new JLabel("Number :");
        numberlbl.setForeground(Color.BLACK);
        numberlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        numberlbl.setBounds(548, 477, 102, 42);
        PaddWaiter.add(numberlbl);

        PaddWaiter.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


