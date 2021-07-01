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

public class ViewOrder_D extends JFrame {

    private JPanel PView;
    private JButton backbtn;


    public static void main(String[] args) {
        ViewOrder_D frame = new ViewOrder_D();
        frame.setVisible(true);
    }


    public ViewOrder_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PView = new JPanel();
        PView.setBackground(Color.GRAY);
        setContentPane(PView);
        PView.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);



        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Recep_Dashboard_D a=new Recep_Dashboard_D();
                a.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 139, 33);
        PView.add(backbtn);

//        JLabel orderlbl = new JLabel("Order Data");
//        orderlbl.setForeground(Color.WHITE);
//        orderlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
//        orderlbl.setBounds(29, 221, 210, 40);
//        PView.add(orderlbl);
//
//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setBounds(29, 362, 606, 263);
////        PView.add(scrollPane);
//
//        JTextArea VtextArea = new JTextArea();
//        scrollPane.setViewportView(VtextArea);
//        VtextArea.setText(ViewAll.vieworder());





            String n="",e="",f="",t="";
            try {
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
                PreparedStatement pst=con.prepareStatement("select * from orderd");
                ResultSet res=pst.executeQuery();
                DefaultTableModel model;
                model= new DefaultTableModel();

                JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
                model.addColumn("order ID");
                model.addColumn("Description ");
                model.addColumn("Waiter ID ");
                model.addColumn("Delivery Man ID");
                model.addRow(new Object[]{"order ID","Description ","Waiter ID ","Delivery Man ID"});
                model.addRow(new Object[]{"-","- ","- ","-"});

                while(res.next())
                {
                    n=res.getString(1);
                    e=res.getString(2);
                    f=res.getString(3);
                    t=res.getString(4);
                    model.addRow(new Object[]{n,e,f,t});
                }
                PView.setLayout(null);
                jTabel1.setBounds(300,200,800,400);
                jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
                PView.add(jTabel1);
//                PView.setVisible(true);
            }

            catch (SQLException ex) {
                Logger.getLogger(ViewAll.vieworder()).log(Level.SEVERE, null, ex);      }



        PView.add(backgroundlabel);
        setLocationRelativeTo(null);
    }
}


