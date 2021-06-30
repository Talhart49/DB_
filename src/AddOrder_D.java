import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(548, 370, 102, 40);
        Paddorder.add(idlbl);


        JLabel desclbl = new JLabel("Description :");
        desclbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        desclbl.setForeground(Color.BLACK);
        desclbl.setBounds(548, 424, 116, 42);
        Paddorder.add(desclbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        Paddorder.add(idfld);
        idfld.setColumns(10);


        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || descfld.getText().isBlank() || waiterIDfld.getText().isBlank()
                            || delimanidfld.getText().isBlank())) {
                        if (AddAll.Addorder(Integer.parseInt(idfld.getText()), descfld.getText(),
                                Integer.parseInt(waiterIDfld.getText()), Integer.parseInt(delimanidfld.getText()))) {
                            String Receipt = "ID : " + idfld.getText() + "\n"
                                    + "Description: " + descfld.getText() + "\n" +
                                    "Waiter ID :" + waiterIDfld.getText() + "\n";
                            JOptionPane.showMessageDialog(null, Receipt);


                        } else {
                            JOptionPane.showMessageDialog(null, "Error, Please Enter Again");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error,Please Fill All");
                    }
                    idfld.setText("");
                    descfld.setText("");
                    waiterIDfld.setText("");
                    delimanidfld.setText("");
                }  catch (SQLException throwables) {
                    idfld.setText("");
                    descfld.setText("");
                    waiterIDfld.setText("");
                    delimanidfld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 611, 126, 29);
        Paddorder.add(Addbtn);

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
        Paddorder.add(backbtn);

        JLabel experincelbl = new JLabel("Delivery Man ID :");
        experincelbl.setForeground(Color.BLACK);
        experincelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        experincelbl.setBounds(548, 536, 156, 42);
        Paddorder.add(experincelbl);

        descfld = new JTextField();
        descfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        descfld.setColumns(10);
        descfld.setBounds(714, 424, 283, 44);
        Paddorder.add(descfld);

        orderlbl = new JLabel("Add Order");
        orderlbl.setForeground(Color.BLACK);
        orderlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
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
        Waiteridlbl.setForeground(Color.BLACK);
        Waiteridlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        Waiteridlbl.setBounds(548, 477, 116, 42);
        Paddorder.add(Waiteridlbl);

        Paddorder.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


