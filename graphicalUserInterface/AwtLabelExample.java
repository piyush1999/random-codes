package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class AwtLabelExample extends Frame{
    
    AwtLabelExample() {
        TextField tf  = new TextField();
        tf.setBounds(50, 60, 70, 30);
        Button b  = new Button("click me!!!");
        b.setBounds(150, 60, 50, 20);
        Label l = new Label("hi there!!!");
        l.setBounds(50, 200, 250, 20);
        b.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent ae) {
                try {
                    String text = tf.getText();
                    l.setText("my name is:" + text);
                }
                catch(Exception ex) {
                    System.out.println(ex);
                }
            }
        
        });
        
        this.addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
        
        });
        add(tf);add(b);add(l);
        setBackground(Color.yellow);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AwtLabelExample();
    }
}
