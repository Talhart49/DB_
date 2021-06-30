import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


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
        PViewAdmin.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewAdmin.add(searchlbl);

        adminidlbl = new JLabel("Admin ID :");
        adminidlbl.setForeground(Color.WHITE);
        adminidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        adminidlbl.setBounds(818, 293, 116, 40);
        PViewAdmin.add(adminidlbl);

        JLabel adminlbl = new JLabel("Admin Data");
        adminlbl.setForeground(Color.WHITE);
        adminlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        adminlbl.setBounds(10, 203, 210, 40);
        PViewAdmin.add(adminlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewAdmin.add(idfld);
        idfld.setColumns(10);

        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from Admin");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Admin ID");
            model.addColumn("Name ");
            model.addColumn("CNIC");
            model.addColumn("Email");
            model.addColumn("Password");
            model.addRow(new Object[]{"Admin ID","Name ","CNIC","Email","Password"});
            model.addRow(new Object[]{"-","- ","- ","-","-"});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);
                f=res.getString(3);
                t=res.getString(4);
                b=res.getString(5);
                model.addRow(new Object[]{n,e,f,t,b});
            }
            PViewAdmin.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewAdmin.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }

//        JScrollPane VscrollPane = new JScrollPane();
//        VscrollPane.setBounds(29, 362, 606, 263);
//        PViewAdmin.add(VscrollPane);
//
//        JTextArea VtextArea = new JTextArea();
//        VtextArea.setEditable(false);
//        VscrollPane.setViewportView(VtextArea);
//        VtextArea.setText(ViewAll.viewAdmin());

        SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewAdmin.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);
        PViewAdmin.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


