package graphicalUserInterface;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class SwingPasswordExample extends JFrame{
    
    SwingPasswordExample() {
        JLabel l1 = new JLabel("USERNAME");
        l1.setBounds(50, 50, 100, 40);
        JLabel l2 = new JLabel("PASSWORD");
        l2.setBounds(50, 100, 100, 40);
        JLabel l3 = new JLabel("hi there...");
        l3.setBounds(50, 180, 250, 30);
        JTextField tf = new JTextField();
        tf.setBounds(175, 60, 100, 20);
        JPasswordField pw = new JPasswordField();
        pw.setBounds(175, 110, 100, 20);
        JButton b = new JButton("LOGIN");
        b.setBounds(125, 150, 80, 30);
        b.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            String un = tf.getText();
            String pass = pw.getText();
            l3.setText("username: "+ un + " password: "+ pass);
        }
        });
        
        add(l1); add(l2);add(b);
        add(tf); add(pw);add(l3);
        setSize(400, 500);
        setTitle("Login window");
        getContentPane().setBackground(Color.red);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingPasswordExample();
    }
}
