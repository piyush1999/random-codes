package graphicalUserInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingComboBoxExample extends JFrame{
    
    SwingComboBoxExample() {
        
        JLabel l1 = new JLabel("Select Details:- ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(1000, 30);
        JLabel l2 = new JLabel("Select Gender-");
        l2.setBounds(100, 50, 100, 30);
        String[] gender = {"male", "female", "others"};
        JComboBox c1 = new JComboBox(gender);
        c1.setEditable(false);
        c1.setBounds(100, 100, 100, 25);
        JLabel l3 = new JLabel("Select Country-");
        l3.setBounds(300, 50, 100, 30);
        String[] country = {"INDIA", "AMERICA", "RUSSIA", "CHINA", "JAPAN", "AUSTRALIA"};
        JComboBox c2 = new JComboBox(country);
        c2.setEditable(false);
        c2.setBounds(300, 100, 100, 25);
        JButton b = new JButton("click when DONE!");
        b.setBounds(200, 150, 150, 30);
        
        b.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent ae) {
            String data = "Your Gender is " +
            c1.getItemAt(c1.getSelectedIndex()) + " selected Country is :" +
            c2.getItemAt(c2.getSelectedIndex());        
            JOptionPane.showMessageDialog(rootPane, data);
        }
        });
        
        add(l1);add(l2);add(l3);
        add(c1);add(c2);add(b);
        setSize(1000, 600);
        getContentPane().setBackground(Color.GRAY);
        setTitle("ComboBox Example!");
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingComboBoxExample();
    }
}
