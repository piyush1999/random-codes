package graphicalUserInterface;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingIconExample extends JFrame{
    
    SwingIconExample() {
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\jerry.png");
        setIconImage(icon);
        setSize(500, 450);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingIconExample();
    }
}
