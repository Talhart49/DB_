import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewDeliMan_D extends JFrame {

    private JPanel PViewDeliMan;
    private JButton Searchbtn;
    private JButton backbtn;
    private JLabel searchlbl;
    private JLabel DeliManidlbl;
    private JTextField idfld;
    private  JTextArea StextArea;


    public static void main(String[] args) {
        ViewDeliMan_D frame = new ViewDeliMan_D();
        frame.setVisible(true);
    }


    public ViewDeliMan_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewDeliMan = new JPanel();
        PViewDeliMan.setBackground(Color.GRAY);
        setContentPane(PViewDeliMan);
        PViewDeliMan.setLayout(null);

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
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Delivery_Man where DeliveryMan_id = ?");
                    checkCredsQuery.setString(1, String.valueOf(idfld.getText()));
                    if (checkCredsQuery.executeUpdate() != 0) {
                        StextArea.setText(SearchAll.searchDeliman(idfld.getText()));
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
        PViewDeliMan.add(Searchbtn);

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
        PViewDeliMan.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewDeliMan.add(searchlbl);

        DeliManidlbl = new JLabel("Delivery Man ID :");
        DeliManidlbl.setForeground(Color.WHITE);
        DeliManidlbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeliManidlbl.setBounds(783, 293, 139, 40);
        PViewDeliMan.add(DeliManidlbl);

        JLabel DeliManlbl = new JLabel("Delivery Man Data");
        DeliManlbl.setForeground(Color.WHITE);
        DeliManlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        DeliManlbl.setBounds(10, 203, 210, 40);
        PViewDeliMan.add(DeliManlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewDeliMan.add(idfld);
        idfld.setColumns(10);

        JScrollPane SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewDeliMan.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);

//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setBounds(29, 362, 606, 263);
//        PViewDeliMan.add(scrollPane);
//
//        JTextArea VtextArea = new JTextArea();
//        scrollPane.setViewportView(VtextArea);
//        VtextArea.setText(ViewAll.viewDeliman());

        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from Delivery_Man");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("ID");
            model.addColumn("Name ");
            model.addColumn("Contact_NO");
            model.addColumn("CNIC");
            model.addRow(new Object[]{"ID","Name ","Contact_NO","CNIC"});
            model.addRow(new Object[]{"-","- ","- ","-"});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);
                f=res.getString(3);
                t=res.getString(4);
                model.addRow(new Object[]{n,e,f,t});
            }
            PViewDeliMan.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewDeliMan.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }

        PViewDeliMan.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


