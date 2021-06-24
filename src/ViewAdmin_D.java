import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewAdmin_D extends JFrame {

    private JPanel PViewAdmin;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel adminidlbl;
    private JTextField idfld;
    private JTextArea StextArea;
    private JScrollPane SscrollPane;


    public static void main(String[] args) {
        ViewAdmin_D frame = new ViewAdmin_D();
        frame.setVisible(true);
    }


    public ViewAdmin_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewAdmin = new JPanel();
        PViewAdmin.setBackground(Color.GRAY);
        setContentPane(PViewAdmin);
        PViewAdmin.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PViewAdmin.add(backgroundlabel);

        Searchbtn = new JButton("Search");
        Searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection connection = null;

                try {
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where Admin_id = ?");
                    checkCredsQuery.setString(1, String.valueOf(idfld.getText()));
                    if (checkCredsQuery.executeUpdate() != 0) {
                        StextArea.setText(SearchAll.searchAdmin(idfld.getText()));
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Not Found");
                        idfld.setText("");
                    }
                }
                catch (Exception ev)
                {
                    JOptionPane.showMessageDialog(null,"Not Found");
                    idfld.setText("");
                }
            }
        });
        Searchbtn.setBounds(925, 362, 116, 40);
        PViewAdmin.add(Searchbtn);

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
        PViewAdmin.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewAdmin.add(searchlbl);

        adminidlbl = new JLabel("Admin ID :");
        adminidlbl.setForeground(Color.WHITE);
        adminidlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adminidlbl.setBounds(818, 293, 116, 40);
        PViewAdmin.add(adminidlbl);

        JLabel adminlbl = new JLabel("Admin Data");
        adminlbl.setForeground(Color.WHITE);
        adminlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        adminlbl.setBounds(10, 203, 210, 40);
        PViewAdmin.add(adminlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewAdmin.add(idfld);
        idfld.setColumns(10);



        JScrollPane VscrollPane = new JScrollPane();
        VscrollPane.setBounds(29, 362, 606, 263);
        PViewAdmin.add(VscrollPane);

        JTextArea VtextArea = new JTextArea();
        VtextArea.setEditable(false);
        VscrollPane.setViewportView(VtextArea);
        VtextArea.setText(ViewAll.viewAdmin());

        SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewAdmin.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);
        setLocationRelativeTo(null);



    }
}


