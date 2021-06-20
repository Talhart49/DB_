import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewReceptionist_D extends JFrame {

    private JPanel PViewReceptionist;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel receptionistidlbl;
    private JTextField idfld;


    public static void main(String[] args) {
        ViewReceptionist_D frame = new ViewReceptionist_D();
        frame.setVisible(true);
    }


    public ViewReceptionist_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewReceptionist = new JPanel();
        PViewReceptionist.setBackground(Color.GRAY);
        setContentPane(PViewReceptionist);
        PViewReceptionist.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PViewReceptionist.add(backgroundlabel);

        Searchbtn = new JButton("Search");
        Searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        Searchbtn.setBounds(925, 362, 116, 40);
        PViewReceptionist.add(Searchbtn);

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
        PViewReceptionist.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewReceptionist.add(searchlbl);

        receptionistidlbl = new JLabel("Receptionist ID :");
        receptionistidlbl.setForeground(Color.WHITE);
        receptionistidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        receptionistidlbl.setBounds(783, 293, 132, 40);
        PViewReceptionist.add(receptionistidlbl);

        JLabel receptionistlbl = new JLabel("Receptionist Data");
        receptionistlbl.setForeground(Color.WHITE);
        receptionistlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        receptionistlbl.setBounds(10, 203, 210, 40);
        PViewReceptionist.add(receptionistlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewReceptionist.add(idfld);
        idfld.setColumns(10);

        JTextArea StextArea = new JTextArea();
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);
        StextArea.setBounds(783, 507, 542, 62);
        PViewReceptionist.add(StextArea);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PViewReceptionist.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        setLocationRelativeTo(null);



    }
}


