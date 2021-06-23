import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ADDFHD_D extends JFrame {

    private JPanel Paddfhd;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField foodidfld;
    private JTextField homeDeliIDfld;
    private JLabel FHDlbl;


    public static void main(String[] args) {
        ADDFHD_D frame = new ADDFHD_D();
        frame.setVisible(true);
    }


    public ADDFHD_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Paddfhd = new JPanel();
        Paddfhd.setBackground(new Color(107, 103, 91));
        setContentPane(Paddfhd);
        Paddfhd.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        Paddfhd.add(backgroundlabel);




        JLabel foodidlbl = new JLabel("Food ID :");
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodidlbl.setForeground(new Color(255,255,255));
        foodidlbl.setBounds(548, 370, 102, 40);
        Paddfhd.add(foodidlbl);


        JLabel homedeliidlbl = new JLabel("Home Delivery ID :");
        homedeliidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        homedeliidlbl.setForeground(new Color(255,255,255));
        homedeliidlbl.setBounds(548, 424, 156, 42);
        Paddfhd.add(homedeliidlbl);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setBounds(714, 370, 283, 44);
        Paddfhd.add(foodidfld);
        foodidfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AddAll.AddFHD(Integer.parseInt(foodidfld.getText()),
                            Integer.parseInt(homeDeliIDfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");


                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                    }
                    foodidfld.setText("");
                    homeDeliIDfld.setText("");
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                    foodidfld.setText("");
                    homeDeliIDfld.setText("");
                }
            }
        });
        Addbtn.setBounds(714, 490, 116, 40);
        Paddfhd.add(Addbtn);

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
        Paddfhd.add(backbtn);

        homeDeliIDfld = new JTextField();
        homeDeliIDfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        homeDeliIDfld.setColumns(10);
        homeDeliIDfld.setBounds(714, 424, 283, 44);
        Paddfhd.add(homeDeliIDfld);

        FHDlbl = new JLabel("Add Food_Delivery Relation");
        FHDlbl.setForeground(Color.WHITE);
        FHDlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        FHDlbl.setBounds(728, 254, 269, 40);
        Paddfhd.add(FHDlbl);
        setLocationRelativeTo(null);



    }
}


