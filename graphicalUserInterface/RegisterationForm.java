package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterationForm extends JFrame{
    
    JLabel l, l1, l2, l3, l4, l5, l6, l7;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton b1, b2;
    JPasswordField tf3, tf4;
    JLabel image;
    
    RegisterationForm() {
        
        
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Downloads\\background.jpg");
        Image i = img.getImage().getScaledInstance(750, 700, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(i);
        image = new JLabel(img2);
        image.setBounds(0, 0, 750, 700);
        
        l = new JLabel("Registeration Form In Window's Form");
        l.setForeground(Color.DARK_GRAY);
        l.setFont(new Font("Serif", Font.BOLD, 20));
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(750, 30);
        l1 = new JLabel("Name");
        l1.setForeground(Color.GRAY);
        l1.setBounds(120, 100, 100, 30);
        l2 = new JLabel("Email-ID");
        l2.setBounds(120, 150, 100, 30);
        l2.setForeground(Color.GRAY);
        l3 = new JLabel("Create Password");
        l3.setBounds(120, 200, 100, 30);
        l3.setForeground(Color.GRAY);
        l4 = new JLabel("Confirm Password");
        l4.setBounds(120, 250, 150, 30);
        l4.setForeground(Color.GRAY);
        l5 = new JLabel("Country");
        l5.setBounds(120, 300, 100, 30);
        l5.setForeground(Color.GRAY);
        l6 = new JLabel("State");
        l6.setBounds(120, 350, 100, 30);
        l6.setForeground(Color.GRAY);
        l7 = new JLabel("Phone No");
        l7.setBounds(120, 400, 100, 30);
        l7.setForeground(Color.GRAY);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JPasswordField();
        tf4 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf1.setBounds(300, 105, 200, 20);
        tf2.setBounds(300, 155, 200, 20);
        tf3.setBounds(300, 205, 200, 20);
        tf4.setBounds(300, 255, 200, 20);
        tf5.setBounds(300, 305, 200, 20);
        tf6.setBounds(300, 355, 200, 20);
        tf7.setBounds(300, 405, 200, 20);
        
        b1 = new JButton("REGISTER");
        b2 = new JButton("CLEAR");
        b1.setBounds(200, 460, 100, 30);
        b2.setBounds(400, 460, 100, 30);
        
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals("")||tf4.getText().equals("")||
                    tf5.getText().equals("")||tf6.getText().equals("")||tf7.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Some fields are EMPTY", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Your response has been submitted.");
            }
        }
        });
        
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
        }
        });
        
        add(image);
        image.add(l);image.add(l1);image.add(l2);image.add(l3);image.add(l4);image.add(l5);image.add(l6);image.add(l7);
        image.add(tf1);image.add(tf2);image.add(tf3);image.add(tf4);image.add(tf5);image.add(tf6);image.add(tf7);
        image.add(b1);image.add(b2);
        
        
        
        setSize(750, 700);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setTitle("Registeration Form In Java");
        setVisible(true);
        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\jerry.png");
        setIconImage(img1); 
    }
    
    public static void main(String[] args) {
        new RegisterationForm();
    }
}
