import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddFeedback_D extends JFrame {

    private JPanel PAddFeedback;
    private JButton backbtn;
    private JTextField customeridfld;
    private JTextField foodidfld;
    private JTextField Commentfld;
    private JTextField ratingfld;


    public static void main(String[] args) {
        AddFeedback_D frame = new AddFeedback_D();
        frame.setVisible(true);
    }


    public AddFeedback_D() {


        initComponents();

    }



    private void initComponents() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PAddFeedback = new JPanel();
        PAddFeedback.setBackground(Color.GRAY);
        setContentPane(PAddFeedback);
        PAddFeedback.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("fp.jpg"));
        backgroundlabel.setBounds(925, 11, 357, 220);
        PAddFeedback.add(backgroundlabel);

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
        PAddFeedback.add(backbtn);

        JLabel Foodlbl = new JLabel("Food  Data");
        Foodlbl.setForeground(Color.WHITE);
        Foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Foodlbl.setBounds(10, 125, 210, 40);
        PAddFeedback.add(Foodlbl);

        JButton sendbtn = new JButton("Send");
        sendbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        sendbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sendbtn.setBounds(746, 573, 107, 35);
        PAddFeedback.add(sendbtn);

        customeridfld = new JTextField();
        customeridfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        customeridfld.setBounds(746, 531, 285, 31);
        PAddFeedback.add(customeridfld);
        customeridfld.setColumns(10);

        foodidfld = new JTextField();
        foodidfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidfld.setColumns(10);
        foodidfld.setBounds(746, 489, 285, 31);
        PAddFeedback.add(foodidfld);

        Commentfld = new JTextField();
        Commentfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Commentfld.setColumns(10);
        Commentfld.setBounds(746, 447, 285, 31);
        PAddFeedback.add(Commentfld);

        ratingfld = new JTextField();
        ratingfld.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ratingfld.setColumns(10);
        ratingfld.setBounds(746, 405, 285, 31);
        PAddFeedback.add(ratingfld);

        JScrollPane FscrollPane = new JScrollPane();
        FscrollPane.setBounds(10, 173, 470, 183);
        PAddFeedback.add(FscrollPane);

        JTextArea FtextArea = new JTextArea();
        FtextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        FscrollPane.setViewportView(FtextArea);

        JScrollPane CscrollPane = new JScrollPane();
        CscrollPane.setBounds(10, 420, 470, 183);
        PAddFeedback.add(CscrollPane);

        JTextArea CtextArea = new JTextArea();
        CtextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        CscrollPane.setViewportView(CtextArea);

        JLabel customerlbl = new JLabel("Customer Data");
        customerlbl.setForeground(Color.WHITE);
        customerlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        customerlbl.setBounds(10, 369, 154, 40);
        PAddFeedback.add(customerlbl);

        JLabel ratinglbl = new JLabel("Rating :");
        ratinglbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ratinglbl.setBounds(587, 405, 81, 22);
        PAddFeedback.add(ratinglbl);

        JLabel cmntslbl = new JLabel("Comment :");
        cmntslbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        cmntslbl.setBounds(587, 457, 81, 22);
        PAddFeedback.add(cmntslbl);

        JLabel foodidlbl = new JLabel("Food ID :");
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        foodidlbl.setBounds(587, 499, 81, 22);
        PAddFeedback.add(foodidlbl);

        JLabel customeridlbl = new JLabel("Customer ID :");
        customeridlbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        customeridlbl.setBounds(587, 541, 94, 22);
        PAddFeedback.add(customeridlbl);
        setLocationRelativeTo(null);



    }
}


