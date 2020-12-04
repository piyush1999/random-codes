package graphicalUserInterface;

import javax.swing.*;
import java.awt.event.*;

public class SwingJTextFieldExample extends JFrame{
    
    SwingJTextFieldExample() {
        JLabel l1 = new JLabel("enter no 1: ");
        l1.setBounds(50, 50, 100, 40);
        JLabel l2 = new JLabel("enter no 2: ");
        l2.setBounds(50, 100, 100, 40);
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 60, 100, 20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(150, 110, 100, 20);
        JTextField tf3 = new JTextField();
        tf3.setEditable(false);
        tf3.setBounds(100, 150, 100, 20);
        JButton b1 = new JButton("+");
        b1.setBounds(75, 175, 60, 30);
        JButton b2 = new JButton("-");
        b2.setBounds(150, 175, 60, 30);
        b1.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            try {
                String t1 = tf1.getText();
                String t2 = tf2.getText();
                Double c = 0.0;
                if(ae.getSource() == b1) {
                    c = Double.parseDouble(t1) + Double.parseDouble(t2);
                }
                else if(ae.getSource() == b2) {
                    c = Double.parseDouble(t1) - Double.parseDouble(t2);
                }
                String c1 = String.valueOf(c);
                tf3.setText(c1);
            }
            catch(Exception ex) {
                System.out.println(ex);
            }
        }
        });
        add(l1);add(l2);
        add(tf1);add(tf2);add(tf3);
        add(b1);add(b2);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingJTextFieldExample();
    }
}
