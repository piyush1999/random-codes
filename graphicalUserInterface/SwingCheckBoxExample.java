package graphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCheckBoxExample extends JFrame{
    SwingCheckBoxExample() {
        JLabel l1 = new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setText("choose language");
        l1.setSize(500, 30);
        JLabel l2 = new JLabel();
        l2.setBounds(200, 200, 500, 30);
        JCheckBox ch1 = new JCheckBox("C++");
        ch1.setBounds(200, 50, 60, 60);
        ch1.setBackground(Color.ORANGE);
        JCheckBox ch2 = new JCheckBox("Java");
        ch2.setBounds(200, 100, 60, 60);
        ch2.setBackground(Color.ORANGE);
        
        ch1.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent ie) {
            if(ie.getSource() == ch1 && ie.getStateChange() == 1) {
                l2.setText("chosen language is C++.");
            }
        }
        });
        
        ch2.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent ie) {
            if(ie.getSource() == ch2 && ie.getStateChange() == 1) {
                l2.setText("chosen language is Java.");
            }
        }
        });
        
        add(l1);add(ch1);add(ch2);add(l2);
        setSize(500, 300);
        getContentPane().setBackground(Color.ORANGE);
        setTitle("my checkbox example...");
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingCheckBoxExample();
    }
}
