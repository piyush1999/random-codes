package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;


public class ButtonTextfieldEventexample extends Frame {
    
    ButtonTextfieldEventexample() {
        TextField tf = new TextField();
        tf.setBounds(60, 50, 200, 20);
        Button b = new Button();
        b.setBounds(50, 120, 80, 30);
        b.setLabel("click me!!!");
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
                tf.setText("hello world.....");
            }
        });
        add(b);add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ButtonTextfieldEventexample bt = new ButtonTextfieldEventexample(); 
    }
}
