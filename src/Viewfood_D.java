import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Viewfood_D extends JFrame {

    private JPanel PViewfood;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel foodidlbl;
    private JTextField idfld;


    public static void main(String[] args) {
        Viewfood_D frame = new Viewfood_D();
        frame.setVisible(true);
    }


    public Viewfood_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewfood = new JPanel();
        PViewfood.setBackground(Color.GRAY);
        setContentPane(PViewfood);
        PViewfood.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PViewfood.add(backgroundlabel);

        Searchbtn = new JButton("Search");
        Searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Searchbtn.setBounds(925, 362, 116, 40);
        PViewfood.add(Searchbtn);

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
        PViewfood.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewfood.add(searchlbl);

        foodidlbl = new JLabel("Food Item ID :");
        foodidlbl.setForeground(Color.WHITE);
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        foodidlbl.setBounds(783, 293, 132, 40);
        PViewfood.add(foodidlbl);

        JLabel foodlbl = new JLabel("Food Items Data");
        foodlbl.setForeground(Color.WHITE);
        foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        foodlbl.setBounds(10, 203, 210, 40);
        PViewfood.add(foodlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewfood.add(idfld);
        idfld.setColumns(10);

        JTextArea StextArea = new JTextArea();
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);
        StextArea.setBounds(783, 507, 542, 62);
        PViewfood.add(StextArea);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PViewfood.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        setLocationRelativeTo(null);



    }
}


