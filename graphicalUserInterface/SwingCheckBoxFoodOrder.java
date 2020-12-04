package graphicalUserInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingCheckBoxFoodOrder extends JFrame{
    
    SwingCheckBoxFoodOrder() {
        JLabel l1 = new JLabel("Please Place Order :-)");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(500, 30);
        JCheckBox ch1 = new JCheckBox("Pizza: 100/-");
        ch1.setBounds(200, 50, 150, 50);
        ch1.setBackground(Color.CYAN);
        JCheckBox ch2 = new JCheckBox("Burger: 60/-");
        ch2.setBounds(200, 100, 150, 50);
        ch2.setBackground(Color.CYAN);
        JCheckBox ch3 = new JCheckBox("Noodles: 150/-");
        ch3.setBounds(200, 150, 150, 50);
        ch3.setBackground(Color.CYAN);
        JButton b = new JButton("Press, When Done!");
        b.setBounds(200, 200, 150, 30);
        
        b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            double total = 0.0;
            String view = "";
            if(ch1.isSelected()) {
                view += "Pizza: 100/- \n";
                total += 100;
            }
            if(ch2.isSelected()) {
                view += "Burger: 60/- \n";
                total += 60;
            }
            if(ch3.isSelected()) {
                view += "Noodles: 150/- \n";
                total += 150;
            }
            view += "-----------------------\n";
            JOptionPane.showMessageDialog(rootPane,view + "total:" + total );
        }
        
        
        });
        
        add(l1);add(ch1);
        add(ch2);add(ch3);add(b);
        setSize(700, 500);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        new SwingCheckBoxFoodOrder();
    }
}
