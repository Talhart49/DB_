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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\mainpageR.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 738);


        admin_btn = new JButton("ADMIN");
        admin_btn.setBackground(new Color(226, 222, 222));
        admin_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ALogin_D aLogin_d=new ALogin_D();
                aLogin_d.setVisible(true);
            }
        });
        admin_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));

        admin_btn.setBounds(552, 406, 127, 67);
        Plogin.add(admin_btn);

        JButton customer_btn = new JButton("Customer");
        customer_btn.setBackground(new Color(226, 222, 222));
//        customer_btn.setForeground();
        customer_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddFeedback_D addFeedback_d=new AddFeedback_D();
                addFeedback_d.setVisible(true);
            }
        });
        customer_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        customer_btn.setBounds(705, 406, 127, 67);
        Plogin.add(customer_btn);

        JButton receptionist_btn = new JButton("Receptionist");
        receptionist_btn.setBackground(new Color(226, 222, 222));
        receptionist_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RLogin_D rLogin_d=new RLogin_D();
                rLogin_d.setVisible(true);
            }
        });
        receptionist_btn.setFont(new Font("Tahoma", Font.PLAIN, 17));
        receptionist_btn.setBounds(857, 406, 127, 67);
        Plogin.add(receptionist_btn);


        JLabel wholbl = new JLabel("Who Are You..!!!!");
        wholbl.setIcon(new ImageIcon("F:\\DB I\\DB_project\\whoR.jpg"));
        wholbl.setForeground(new Color(255, 255, 255));
        wholbl.setFont(new Font("Tahoma", Font.PLAIN, 26));
        wholbl.setBounds(552, 219, 435, 129);
        Plogin.add(wholbl);

        Plogin.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}
