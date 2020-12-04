package graphicalUserInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConnectTwoFrames1 extends JFrame{

    
    ConnectTwoFrames1() {
        
        JLabel l = new JLabel("you are in first");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(450, 30);
        JTextField tf = new JTextField();
        tf.setBounds(100, 150, 100, 20);
        JButton b = new JButton("GO");
        b.setBounds(200, 250, 80, 30);
        JButton b2 = new JButton("CLEAR");
        b2.setBounds(300, 250, 80, 30);
        add(l);add(b);add(tf);add(b2);
        
        b.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == b) {
                new ConnectTwoFrames2();
            }
        }
        });
        b2.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == b2) {
                tf.setText("");
            }
        }
        });
        
        getContentPane().setBackground(Color.red);
        setSize(450, 600);
        setLayout(null);
        setVisible(true);
        
        
        
    }
    
    public static void main(String[] args) {
        new ConnectTwoFrames1();
    }
}
