import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewDish_D extends JFrame {

    private JPanel PViewDish;
    private JButton backbtn;


    public static void main(String[] args) {
        ViewDish_D frame = new ViewDish_D();
        frame.setVisible(true);
    }


    public ViewDish_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewDish = new JPanel();
        PViewDish.setBackground(Color.GRAY);
        setContentPane(PViewDish);
        PViewDish.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


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
        PViewDish.add(backbtn);

        JLabel Dishlbl = new JLabel("Food_Ingredients Data");
        Dishlbl.setForeground(Color.WHITE);
        Dishlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Dishlbl.setBounds(10, 203, 210, 40);
        PViewDish.add(Dishlbl);



        String n="",e="",f="",t="",b="";
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","databaseproject","databaseproject");
            PreparedStatement pst=con.prepareStatement("select * from fooditems_ingredients");
            ResultSet res=pst.executeQuery();
            DefaultTableModel model;
            model= new DefaultTableModel();

            JTable jTabel1= new JTable(model);


//                model.addColumn("Order ID");
            model.addColumn("Food ID");
            model.addColumn("Ingredient ID ");
            model.addRow(new Object[]{"Food ID","Ingredient ID "});

            model.addRow(new Object[]{"-","- "});

            while(res.next())
            {
                n=res.getString(1);
                e=res.getString(2);

                model.addRow(new Object[]{n,e});
            }
            PViewDish.setLayout(null);
            jTabel1.setBounds(10, 262, 680, 263);
            jTabel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
//                PView.setSize(1200,800);
            PViewDish.add(jTabel1);
//                PView.setVisible(true);
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");   }


        PViewDish.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


