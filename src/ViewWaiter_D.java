import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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
    private JTextArea StextArea;

    public static void main(String[] args) {
        ViewWaiter_D frame = new ViewWaiter_D();
        frame.setVisible(true);
    }


    public ViewWaiter_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewWaiter = new JPanel();
        PViewWaiter.setBackground(Color.GRAY);
        setContentPane(PViewWaiter);
        PViewWaiter.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


        Searchbtn = new JButton("Search");
        Searchbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Searchbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection connection = null;

                try {
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from waiter where waiter_id = ?");
                    checkCredsQuery.setString(1, String.valueOf(idfld.getText()));
                    if (checkCredsQuery.executeUpdate() != 0) {
                        StextArea.setText(SearchAll.searchWaiter(idfld.getText()));
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
        PViewWaiter.add(Searchbtn);

        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("bckR.jpg"));
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
        PViewWaiter.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewWaiter.add(searchlbl);

        Waiteridlbl = new JLabel("Waiter ID :");
        Waiteridlbl.setForeground(Color.WHITE);
        Waiteridlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        Waiteridlbl.setBounds(783, 293, 132, 40);
        PViewWaiter.add(Waiteridlbl);

        JLabel Waiterlbl = new JLabel("Waiter Data");
        Waiterlbl.setForeground(Color.WHITE);
        Waiterlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Waiterlbl.setBounds(29, 212, 210, 40);
        PViewWaiter.add(Waiterlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewWaiter.add(idfld);
        idfld.setColumns(10);

        JScrollPane SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewWaiter.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);

//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setBounds(29, 362, 606, 263);
//        PViewWaiter.add(scrollPane);
//
//        JTextArea VtextArea = new JTextArea();
//        scrollPane.setViewportView(VtextArea);
//        VtextArea.setText(ViewAll.viewWaiter());

        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from waiter");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Customer ID");
            model.addColumn("Name ");
            model.addColumn("Contact_NO");
            model.addColumn("CNIC");
            model.addRow(new Object[]{"Customer ID","Name ","Contact_NO","CNIC"});
            model.addRow(new Object[]{"-","- ","- ","-","-"});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);
                f=res.getString(3);
                t=res.getString(4);

                model.addRow(new Object[]{n,e,f,t});
            }
            PViewWaiter.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewWaiter.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }


        PViewWaiter.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


