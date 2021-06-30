import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\oop\\ramen.png"));
        setTitle("Ramen_Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1600, 800);
        PView = new JPanel();
        PView.setBackground(Color.GRAY);
        setContentPane(PView);
        PView.setLayout(null);

        JLabel backgroundlabel = new JLabel("");
        backgroundlabel.setIcon(new ImageIcon("F:\\DB I\\DB_project\\view.jpg"));
        backgroundlabel.setBounds(0, 0, 1370, 749);


        backbtn = new JButton("Back");
        backbtn.setIcon(new ImageIcon("F:\\DB I\\DB_project\\bckR.jpg"));
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

        JLabel orderlbl = new JLabel("Order Data");
        orderlbl.setForeground(Color.WHITE);
        orderlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        orderlbl.setBounds(29, 221, 210, 40);
        PView.add(orderlbl);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PView.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        VtextArea.setText(ViewAll.vieworder());
        PView.add(backgroundlabel);
        setLocationRelativeTo(null);
    }
}


