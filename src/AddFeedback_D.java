import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\add.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
        backbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
        backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                First_Page_D a=new First_Page_D();
                a.setVisible(true);

            }
        });
        backbtn.setForeground(new Color(220, 20, 60));
        backbtn.setBackground(new Color(255, 235, 205));
        backbtn.setBounds(0, 0, 139, 33);
        PAddFeedback.add(backbtn);

        JLabel Foodlbl = new JLabel("Food  Data");
        Foodlbl.setForeground(Color.WHITE);
        Foodlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        Foodlbl.setBounds(10, 125, 210, 40);
        PAddFeedback.add(Foodlbl);


        Random rand = new Random();

        int feedid = rand.nextInt(1000);

        JButton sendbtn = new JButton("Send");
        sendbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                {
                    try {
                        if (!(ratingfld.getText().isBlank() || Commentfld.getText().isBlank() || foodidfld.getText().isBlank()
                                || customeridfld.getText().isBlank())){
                        if (AddAll.Addfeedback(feedid,Integer.parseInt(ratingfld.getText()),Commentfld.getText(),
                                Integer.parseInt(foodidfld.getText()),
                                Integer.parseInt(customeridfld.getText()))){

                            JOptionPane.showMessageDialog(null,"Added");


                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Error, Please Enter Again");

                        }

                    }
                    else {
                            JOptionPane.showMessageDialog(null,"Error, Please fill all fields");

                        }
                        foodidfld.setText("");
                        ratingfld.setText("");
                        Commentfld.setText("");
                        customeridfld.setText("");
                    } catch (SQLException throwables) {
                        JOptionPane.showMessageDialog(null,"Error, Please Enter Again");
                        foodidfld.setText("");
                        ratingfld.setText("");
                        Commentfld.setText("");
                        customeridfld.setText("");
                    }
                    System.out.println(feedid);
                }
            }
        });
        sendbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sendbtn.setBounds(746, 573, 115, 30);
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
        FtextArea.setText(ViewAll.viewfood());
        FscrollPane.setViewportView(FtextArea);

        JScrollPane CscrollPane = new JScrollPane();
        CscrollPane.setBounds(10, 420, 470, 183);
        PAddFeedback.add(CscrollPane);

        JTextArea CtextArea = new JTextArea();
        CtextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        CtextArea.setText(ViewAll.viewcustomer());
        CscrollPane.setViewportView(CtextArea);

        JLabel customerlbl = new JLabel("Customer Data");
        customerlbl.setForeground(Color.WHITE);
        customerlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        customerlbl.setBounds(10, 369, 154, 40);
        PAddFeedback.add(customerlbl);

        JLabel ratinglbl = new JLabel("Rating :");
        ratinglbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ratinglbl.setBounds(587, 405, 81, 22);
        PAddFeedback.add(ratinglbl);

        JLabel cmntslbl = new JLabel("Comment :");
        cmntslbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        cmntslbl.setBounds(587, 457, 126, 22);
        PAddFeedback.add(cmntslbl);

        JLabel foodidlbl = new JLabel("Food ID :");
        foodidlbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        foodidlbl.setBounds(587, 499, 81, 22);
        PAddFeedback.add(foodidlbl);

        JLabel customeridlbl = new JLabel("Customer ID :");
        customeridlbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
        customeridlbl.setBounds(587, 541, 126, 22);
        PAddFeedback.add(customeridlbl);

        PAddFeedback.add(backgroundlabel);

        setLocationRelativeTo(null);



    }
}


