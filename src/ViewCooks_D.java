import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewCooks_D extends JFrame {

    private JPanel PViewCooks;
    private JButton backbtn;


    public static void main(String[] args) {
        ViewCooks_D frame = new ViewCooks_D();
        frame.setVisible(true);
    }


    public ViewCooks_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PViewCooks = new JPanel();
        PViewCooks.setBackground(Color.GRAY);
        setContentPane(PViewCooks);
        PViewCooks.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


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
        PViewCooks.add(backbtn);

        JLabel Cookslbl = new JLabel("Food_Chef Data");
        Cookslbl.setForeground(Color.WHITE);
        Cookslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        Cookslbl.setBounds(10, 203, 210, 40);
        PViewCooks.add(Cookslbl);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PViewCooks.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        VtextArea.setText(ViewAll.viewcooks());
        PViewCooks.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


