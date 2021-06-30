import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewFHD_D extends JFrame {

    private JPanel PView;
    private JButton backbtn;


    public static void main(String[] args) {
        ViewFHD_D frame = new ViewFHD_D();
        frame.setVisible(true);
    }


    public ViewFHD_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
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

        JLabel FHDlbl = new JLabel("Food_Delivery Data");
        FHDlbl.setForeground(Color.WHITE);
        FHDlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        FHDlbl.setBounds(10, 203, 210, 40);
        PView.add(FHDlbl);

//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setBounds(29, 362, 606, 263);
//        PView.add(scrollPane);
//
//        JTextArea VtextArea = new JTextArea();
//        scrollPane.setViewportView(VtextArea);
//        VtextArea.setText(ViewAll.viewFHD());

        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from fooditems_homedelivery");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Food ID");
            model.addColumn("Home Delivery ID ");
            model.addRow(new Object[]{"Food ID","Home Delivery ID "});

            model.addRow(new Object[]{"-","- "});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);

                model.addRow(new Object[]{n,e});
            }
            PView.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PView.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }

        PView.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


