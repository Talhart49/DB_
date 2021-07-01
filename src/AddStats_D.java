import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddStats_D extends JFrame {

    private JPanel PaddStats;
    private JButton Addbtn;
    private JButton backbtn;
    private JTextField idfld;
    private JTextField soldfld;
    private JLabel statslbl;
    private JTextField satisfactionfld;
    private JTextField foodidfld;
    private JLabel foodidlbl;


    public static void main(String[] args) {
        AddStats_D frame = new AddStats_D();
        frame.setVisible(true);
    }


    public AddStats_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PaddStats = new JPanel();
        PaddStats.setBackground(new Color(107, 103, 91));
        setContentPane(PaddStats);
        PaddStats.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);





        JLabel idlbl = new JLabel("ID :");
        idlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        idlbl.setForeground(Color.BLACK);
        idlbl.setBounds(520, 370, 102, 40);
        PaddStats.add(idlbl);


        JLabel soldlbl = new JLabel("Sold Amount :");
        soldlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        soldlbl.setForeground(Color.BLACK);
        soldlbl.setBounds(520, 421, 139, 42);
        PaddStats.add(soldlbl);

        idfld = new JTextField();
        idfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        idfld.setBounds(714, 370, 283, 44);
        PaddStats.add(idfld);
        idfld.setColumns(10);

        Addbtn = new JButton("Add");
        Addbtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Addbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!(idfld.getText().isBlank() || soldfld.getText().isBlank() || satisfactionfld.getText().isBlank()
                            || foodidfld.getText().isBlank() )){
                    if( AddAll.Addstats (Integer.parseInt(idfld.getText()), Integer.parseInt(soldfld.getText()),
                            Integer.parseInt(satisfactionfld.getText())
                            ,Integer.parseInt(foodidfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Added");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Error Enter Again");

                    }
                    idfld.setText("");
                    soldfld.setText("");
                    satisfactionfld.setText("");
                    foodidfld.setText("");
                }
                else {

                        JOptionPane.showMessageDialog(null,"Error please fill all fields");

                    }
                }catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null,"Error Enter Again");
                    idfld.setText("");
                    soldfld.setText("");
                    satisfactionfld.setText("");
                    foodidfld.setText("");
                }

            }
        });
        Addbtn.setBounds(724, 592, 123, 29);
        PaddStats.add(Addbtn);

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
        PaddStats.add(backbtn);

        soldfld = new JTextField();
        soldfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        soldfld.setColumns(10);
        soldfld.setBounds(714, 424, 283, 44);
        PaddStats.add(soldfld);

        statslbl = new JLabel("Add Statistics");
        statslbl.setForeground(Color.BLACK);
        statslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        statslbl.setBounds(728, 254, 210, 40);
        PaddStats.add(statslbl);

        satisfactionfld = new JTextField();
        satisfactionfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        satisfactionfld.setColumns(10);
        satisfactionfld.setBounds(714, 482, 283, 44);
        PaddStats.add(satisfactionfld);

        JLabel satisfactionlbl = new JLabel("Customer Satisfaction :");
        satisfactionlbl.setBackground(Color.BLACK);
        satisfactionlbl.setForeground(Color.BLACK);
        satisfactionlbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        satisfactionlbl.setBounds(520, 479, 184, 42);
        PaddStats.add(satisfactionlbl);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setColumns(10);
        foodidfld.setBounds(714, 537, 283, 44);
        PaddStats.add(foodidfld);

        foodidlbl = new JLabel("Food Item ID :");
        foodidlbl.setForeground(Color.BLACK);
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        foodidlbl.setBounds(520, 532, 139, 40);
        PaddStats.add(foodidlbl);

        PaddStats.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


