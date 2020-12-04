package graphicalUserInterface;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class SwingTextAreaExample extends JFrame{
    
    SwingTextAreaExample() {
        JLabel l1 = new JLabel("l1");
        l1.setBounds(50, 50, 100, 40);
        JLabel l2 = new JLabel("l2");
        l2.setBounds(175, 50, 100, 40); 
        JTextArea ta = new JTextArea();
        ta.setBounds(50, 125, 200, 60);
        JButton b = new JButton("count!!!");
        b.setBounds(80, 200, 100, 40);
        b.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            String c = ta.getText();
            String[] c1 = c.split("\\s");
            l1.setText("no of char :"+ c.length());
            l2.setText("no of words: "+ c1.length);
        }
        
        });
        
        
        add(l1); add(l2); add(ta);add(b);
        setTitle("my frame");
        getContentPane().setBackground(Color.YELLOW);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new SwingTextAreaExample();
    }
}
