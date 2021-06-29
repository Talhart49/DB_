import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JLabel FHDlbl = new JLabel("Food_Delivery Data");
        FHDlbl.setForeground(Color.WHITE);
        FHDlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        FHDlbl.setBounds(10, 203, 210, 40);
        PView.add(FHDlbl);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 362, 606, 263);
        PView.add(scrollPane);

        JTextArea VtextArea = new JTextArea();
        scrollPane.setViewportView(VtextArea);
        VtextArea.setText(ViewAll.viewFHD());
        PView.add(backgroundlabel);
        setLocationRelativeTo(null);



    }
}


