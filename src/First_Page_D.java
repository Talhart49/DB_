import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class First_Page_D extends JFrame {

    private JPanel Plogin;
    private JButton admin_btn;


    public static void main(String[] args) {
        First_Page_D frame = new First_Page_D();
        frame.setVisible(true);
    }


    public First_Page_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        Plogin = new JPanel();
        Plogin.setBackground(new Color(107, 103, 91));
        setContentPane(Plogin);
        Plogin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(681, 11, 601, 365);
        Plogin.add(backgroundlabel);

        admin_btn = new JButton("Admin");
        admin_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ALogin_D aLogin_d=new ALogin_D();
                aLogin_d.setVisible(true);
            }
        });
        admin_btn.setFont(new Font("Tahoma", Font.PLAIN, 16));

        admin_btn.setBounds(584, 554, 116, 40);
        Plogin.add(admin_btn);

        JButton customer_btn = new JButton("Customer");
        customer_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        customer_btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        customer_btn.setBounds(763, 554, 116, 40);
        Plogin.add(customer_btn);

        JButton receptionist_btn = new JButton("Receptionist");
        receptionist_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        receptionist_btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        receptionist_btn.setBounds(972, 554, 116, 40);
        Plogin.add(receptionist_btn);
        setLocationRelativeTo(null);



    }
}
