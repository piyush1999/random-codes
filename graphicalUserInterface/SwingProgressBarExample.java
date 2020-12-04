package graphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingProgressBarExample extends JFrame{
    JProgressBar jp = new JProgressBar(0, 2000);
    SwingProgressBarExample() {
        
        jp.setBounds(100, 100, 200, 30);
        jp.setStringPainted(true);
        add(jp);
        iterate();
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
    }
    public void iterate() {
            int i=0;
            while(i<=2000) {
                jp.setValue(i);
                i+=20;
            }
            try {
                Thread.sleep(150);
            }
            catch(Exception ex) {
                System.out.println(ex);
            }
        }
    public static void main(String[] args) {
        new SwingProgressBarExample();
    }
}
