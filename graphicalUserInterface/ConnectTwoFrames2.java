package graphicalUserInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConnectTwoFrames2 extends JFrame{
    
    ConnectTwoFrames2() {
        
        JLabel l = new JLabel("you are in second:");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400, 30);
        JButton b = new JButton("BACK");
        b.setBounds(180, 180, 80, 30);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            
            JOptionPane.showMessageDialog(rootPane, "You have been LOGGED IN....\n..WELCOME..");
            dispose();
        }
        });
        add(l);add(b);
        setTitle("second one");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ConnectTwoFrames2();
    }
}
