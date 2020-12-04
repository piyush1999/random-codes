package graphicalUserInterface;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class SwingButtonExample extends JFrame{
    
    SwingButtonExample() {
        
        JTextField th = new JTextField();
        th.setBounds(100, 60, 100, 30);
        JButton jb = new JButton("click me!!!");
        jb.setBackground(Color.red);
        jb.setBounds(100, 150, 100, 45);
        
        jb.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            th.setText("hello world!!!");
        }
        });
        add(jb);add(th);
        setSize(300, 300);
        setBackground(Color.BLUE);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingButtonExample();
    }
}
