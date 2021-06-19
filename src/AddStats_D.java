import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddStats_D extends JFrame {

    private JPanel PaddStats;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField soldfld;
    private JLabel statslbl;
    private JTextField satisfactionfld;
    private JTextField foodidfld;
    private JLabel foodidlbl;


    public static void main(String[] args) {
        AddStats_D frame = new AddStats_D();
        frame.setVisible(true);
    }


    public AddStats_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddStats = new JPanel();
        PaddStats.setBackground(new Color(107, 103, 91));
        setContentPane(PaddStats);
        PaddStats.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PaddStats.add(backgroundlabel);




        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        idlbl.setForeground(new Color(255,255,255));
        idlbl.setBounds(520, 370, 102, 40);
        PaddStats.add(idlbl);


        JLabel soldlbl = new JLabel("Sold Amount :");
        soldlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        soldlbl.setForeground(new Color(255,255,255));
        soldlbl.setBounds(520, 421, 116, 42);
        PaddStats.add(soldlbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddStats.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Addbtn.setBounds(714, 651, 116, 40);
        PaddStats.add(Addbtn);

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
        PaddStats.add(backbtn);

        soldfld = new JTextField();
        soldfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        soldfld.setColumns(10);
        soldfld.setBounds(714, 424, 283, 44);
        PaddStats.add(soldfld);

        statslbl = new JLabel("Add Statistics");
        statslbl.setForeground(Color.WHITE);
        statslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        statslbl.setBounds(728, 254, 210, 40);
        PaddStats.add(statslbl);

        satisfactionfld = new JTextField();
        satisfactionfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        satisfactionfld.setColumns(10);
        satisfactionfld.setBounds(714, 482, 283, 44);
        PaddStats.add(satisfactionfld);

        JLabel satisfactionlbl = new JLabel("Customer Satisfaction :");
        satisfactionlbl.setForeground(Color.WHITE);
        satisfactionlbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        satisfactionlbl.setBounds(520, 479, 169, 42);
        PaddStats.add(satisfactionlbl);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setColumns(10);
        foodidfld.setBounds(714, 537, 283, 44);
        PaddStats.add(foodidfld);

        foodidlbl = new JLabel("Food Item ID :");
        foodidlbl.setForeground(Color.WHITE);
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodidlbl.setBounds(520, 532, 116, 40);
        PaddStats.add(foodidlbl);
        setLocationRelativeTo(null);



    }
}


