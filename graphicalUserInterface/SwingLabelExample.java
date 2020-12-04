package graphicalUserInterface;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class SwingLabelExample extends JFrame{
    
    SwingLabelExample() {
       
        JTextField tf = new JTextField();
        tf.setBounds(100, 50, 300, 40);
        JButton b = new JButton("click me");
        b.setBounds(200, 100, 100, 50);
        JLabel l = new JLabel("hi there...");
        l.setBounds(100, 200, 300, 40);
        b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            try {
                String host = tf.getText();
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                l.setText("ip of "+host+" is "+ip);
            }
            catch(Exception ex) {
                System.out.println(ex);
            }
        }
        
        });
        add(tf);add(b);add(l);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingLabelExample();
    }
}
