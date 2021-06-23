import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class UDChef_D extends JFrame {

    private JPanel PUD;
    private JButton backbtn;
    private JTextField Uidfld;
    private JTextField emailfld;
    private JTextField Didfld;


    public static void main(String[] args) {
        UDChef_D frame = new UDChef_D();
        frame.setVisible(true);
    }


    public UDChef_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PUD = new JPanel();
        PUD.setBackground(Color.GRAY);
        setContentPane(PUD);
        PUD.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PUD.add(backgroundlabel);

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
        PUD.add(backbtn);

        JLabel updatelbl = new JLabel("Update Data");
        updatelbl.setForeground(Color.WHITE);
        updatelbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        updatelbl.setBounds(184, 189, 210, 40);
        PUD.add(updatelbl);

        JLabel dellbl = new JLabel("Delete Data");
        dellbl.setForeground(Color.WHITE);
        dellbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        dellbl.setBounds(1010, 203, 210, 40);
        PUD.add(dellbl);

        Uidfld = new JTextField();
        Uidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Uidfld.setBounds(183, 270, 154, 30);
        PUD.add(Uidfld);
        Uidfld.setColumns(10);

        emailfld = new JTextField();
        emailfld.setFont(new Font("Tahoma", Font.PLAIN, 16));
        emailfld.setColumns(10);
        emailfld.setBounds(183, 322, 154, 30);
        PUD.add(emailfld);

        JLabel Uidlbl = new JLabel("ID:");
        Uidlbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Uidlbl.setBounds(53, 270, 74, 22);
        PUD.add(Uidlbl);

        JLabel Uemaillbl = new JLabel("Updated Number:");
        Uemaillbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Uemaillbl.setBounds(53, 322, 111, 22);
        PUD.add(Uemaillbl);

        JLabel Didlbl = new JLabel("ID:");
        Didlbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Didlbl.setBounds(935, 258, 74, 22);
        PUD.add(Didlbl);

        Didfld = new JTextField();
        Didfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Didfld.setColumns(10);
        Didfld.setBounds(1020, 254, 154, 30);
        PUD.add(Didfld);

        JButton updatebtn = new JButton("Update");
        updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        updatebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (UpdateAll.updatechef(Integer.parseInt(Uidfld.getText()),emailfld.getText())){
                        JOptionPane.showMessageDialog(null,"Updated");
                        Didfld.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Not Found");
                        Didfld.setText("");
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        });
        updatebtn.setBounds(184, 377, 110, 30);
        PUD.add(updatebtn);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (DeleteAll.deletechef(Integer.parseInt(Didfld.getText()))){
                        JOptionPane.showMessageDialog(null,"Deleted");
                        Didfld.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Not Found");
                        Didfld.setText("");
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        });

        btnDelete.setBounds(1020, 307, 110, 30);
        PUD.add(btnDelete);

        JLabel Cheflbl = new JLabel("Chef Data");
        Cheflbl.setForeground(Color.WHITE);
        Cheflbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Cheflbl.setBounds(537, 150, 180, 40);
        PUD.add(Cheflbl);
        setLocationRelativeTo(null);



    }
}


