import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewWaiter_D extends JFrame {

    private JPanel PViewWaiter;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel Waiteridlbl;
    private JTextField idfld;


    public static void main(String[] args) {
        ViewWaiter_D frame = new ViewWaiter_D();
        frame.setVisible(true);
    }


    public ViewWaiter_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewWaiter = new JPanel();
        PViewWaiter.setBackground(Color.GRAY);
        setContentPane(PViewWaiter);
        PViewWaiter.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PViewWaiter.add(backgroundlabel);

        Searchbtn = new JButton("Search");
        Searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Searchbtn.setBounds(925, 362, 116, 40);
        PViewWaiter.add(Searchbtn);

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
        PViewWaiter.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewWaiter.add(searchlbl);

        Waiteridlbl = new JLabel("Waiter ID :");
        Waiteridlbl.setForeground(Color.WHITE);
        Waiteridlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Waiteridlbl.setBounds(783, 293, 132, 40);
        PViewWaiter.add(Waiteridlbl);

        JLabel Waiterlbl = new JLabel("Waiter Data");
        Waiterlbl.setForeground(Color.WHITE);
        Waiterlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Waiterlbl.setBounds(10, 203, 210, 40);
        PViewWaiter.add(Waiterlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewWaiter.add(idfld);
        idfld.setColumns(10);

        JTextArea StextArea = new JTextArea();
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);
        StextArea.setBounds(783, 507, 542, 62);
        PViewWaiter.add(StextArea);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PViewWaiter.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        setLocationRelativeTo(null);



    }
}


