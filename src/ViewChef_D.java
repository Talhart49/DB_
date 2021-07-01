import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewChef_D extends JFrame {

    private JPanel PViewChef;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel chefidlbl;
    private JTextField idfld;
    private JTextArea StextArea;


    public static void main(String[] args) {
        ViewChef_D frame = new ViewChef_D();
        frame.setVisible(true);
    }


    public ViewChef_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewChef = new JPanel();
        PViewChef.setBackground(Color.GRAY);
        setContentPane(PViewChef);
        PViewChef.setLayout(null);

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
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from chef where chef_id = ?");
                    checkCredsQuery.setString(1, String.valueOf(idfld.getText()));
                    if (checkCredsQuery.executeUpdate() != 0) {
                        StextArea.setText(SearchAll.searchChef(idfld.getText()));
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
        PViewChef.add(Searchbtn);

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
        PViewChef.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewChef.add(searchlbl);

        chefidlbl = new JLabel("Chef ID :");
        chefidlbl.setForeground(Color.WHITE);
        chefidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        chefidlbl.setBounds(783, 293, 132, 40);
        PViewChef.add(chefidlbl);

        JLabel cheflbl = new JLabel("Chef Data");
        cheflbl.setForeground(Color.WHITE);
        cheflbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        cheflbl.setBounds(10, 203, 210, 40);
        PViewChef.add(cheflbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewChef.add(idfld);
        idfld.setColumns(10);

        JScrollPane SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewChef.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);

        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from Chef");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Admin ID");
            model.addColumn("Name ");
            model.addColumn("Contact_NO");
            model.addColumn("CNIC");
            model.addColumn("Experience");
            model.addRow(new Object[]{"Admin ID","Name ","Contact_NO","CNIC","Experience"});
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
            PViewChef.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewChef.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }


        PViewChef.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


