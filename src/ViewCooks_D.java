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
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PViewCooks.add(backgroundlabel);

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
        PViewCooks.add(backbtn);

        JLabel Cookslbl = new JLabel("Food_Ingredients Data");
        Cookslbl.setForeground(Color.WHITE);
        Cookslbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Cookslbl.setBounds(10, 203, 210, 40);
        PViewCooks.add(Cookslbl);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PViewCooks.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        setLocationRelativeTo(null);



    }
}


