import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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
    private JTextArea StextArea;


    public static void main(String[] args) {
        Viewfood_D frame = new Viewfood_D();
        frame.setVisible(true);
    }


    public Viewfood_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewfood = new JPanel();
        PViewfood.setBackground(Color.GRAY);
        setContentPane(PViewfood);
        PViewfood.setLayout(null);

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
                    PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
                    checkCredsQuery.setString(1, String.valueOf(idfld.getText()));
                    if (checkCredsQuery.executeUpdate() != 0) {
                        StextArea.setText(SearchAll.searchfood(idfld.getText()));
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
        PViewfood.add(Searchbtn);

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
        PViewfood.add(backbtn);

        searchlbl = new JLabel("Search");
        searchlbl.setForeground(Color.WHITE);
        searchlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        searchlbl.setBounds(828, 242, 210, 40);
        PViewfood.add(searchlbl);

        foodidlbl = new JLabel("Food Item ID :");
        foodidlbl.setForeground(Color.WHITE);
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodidlbl.setBounds(783, 293, 132, 40);
        PViewfood.add(foodidlbl);

        JLabel foodlbl = new JLabel("Food Items Data");
        foodlbl.setForeground(Color.WHITE);
        foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        foodlbl.setBounds(10, 203, 210, 40);
        PViewfood.add(foodlbl);

        idfld = new JTextField();
        idfld.setBounds(925, 300, 114, 33);
        PViewfood.add(idfld);
        idfld.setColumns(10);

        JScrollPane SscrollPane = new JScrollPane();
        SscrollPane.setBounds(700, 429, 542, 62);
        PViewfood.add(SscrollPane);

        StextArea = new JTextArea();
        StextArea.setEditable(false);
        SscrollPane.setViewportView(StextArea);
        StextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        StextArea.setBackground(Color.WHITE);



        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from food_items");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Deal ID");
            model.addColumn("Name ");
            model.addColumn("Price");

            model.addRow(new Object[]{"Deal ID","Name ","Price"});
            model.addRow(new Object[]{"-","- ","- "});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);
                f=res.getString(3);

                model.addRow(new Object[]{n,e,f});
            }
            PViewfood.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewfood.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }

        PViewfood.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


