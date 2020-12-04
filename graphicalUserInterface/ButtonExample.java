package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame{
    
    ButtonExample() {
        
        TextField tf = new TextField();
        tf.setBounds(50, 50, 80, 50);
        Button b = new Button();
        b.setLabel("click me...");
        b.setBounds(50, 100, 60, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tf.setText("hello world");
            }
        });
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
        
        } );
        add(b);add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ButtonExample b = new ButtonExample();
    }
}
