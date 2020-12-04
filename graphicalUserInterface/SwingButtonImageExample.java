package graphicalUserInterface;

import javax.swing.*;
import java.awt.event.*;

public class SwingButtonImageExample extends JFrame{
    SwingButtonImageExample() {
        JButton jb = new JButton("hello");
        jb.setBounds(100, 90, 90, 40);
        add(jb);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SwingButtonImageExample();
    }
}
