package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class AWTLabel extends Frame{
    
    AWTLabel() {
        Label l1 = new Label("my label program.....");
        l1.setBounds(50, 50, 100, 50);
        Label l2 = new Label("second one...");
        l2.setBounds(50, 100, 100, 50);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        add(l1);
        add(l2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new AWTLabel();
    }
    
}
