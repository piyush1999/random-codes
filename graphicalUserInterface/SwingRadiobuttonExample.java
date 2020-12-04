package graphicalUserInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingRadiobuttonExample extends JFrame{
    
    SwingRadiobuttonExample() {
        JLabel l1 = new JLabel("Please Select Your Gender!");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(500, 30);
        JRadioButton rb1 = new JRadioButton("male");
        rb1.setBounds(200, 50, 80, 30);
        rb1.setBackground(Color.CYAN);
        JRadioButton rb2 = new JRadioButton("female");
        rb2.setBounds(200, 100, 80, 30);
        rb2.setBackground(Color.CYAN);
        JRadioButton rb3 = new JRadioButton("others");
        rb3.setBounds(200, 150, 80, 30);
        rb3.setBackground(Color.CYAN);
        JButton b = new JButton("Click, When Done!");
        b.setBounds(175, 200, 150, 30);
        
        b.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
            String gender = "";
            if(rb1.isSelected())
                gender += "male.";
            else if(rb2.isSelected())
                gender += "female.";
            else if(rb3.isSelected())
                gender += "others.";
            JOptionPane.showMessageDialog(rootPane, "Your Gender is " + gender);
        }
        });
        
        add(l1);add(rb1);add(rb2);add(rb3);add(b);
        setSize(500, 400);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingRadiobuttonExample();
    }
}
