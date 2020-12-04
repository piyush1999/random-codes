package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class TextFieldExample extends Frame{
    
    TextFieldExample() {
        Label l1 = new Label("enter no 1:");
        l1.setBounds(20, 50, 60, 20);
        TextField tf1 = new TextField();
        tf1.setBounds(100, 50, 50, 20);
        Label l2 = new Label("enter no 2");
        l2.setBounds(20, 90, 60, 20);
        TextField tf2 = new TextField();
        tf2.setBounds(100, 90, 50, 20);
        Button b1 = new Button("+");
        b1.setBounds(40, 120, 50, 20);
        Button b2 = new Button("-");
        b2.setBounds(90, 120, 50, 20);
        TextField tf3 = new TextField();
        tf3.setEditable(false);
        tf3.setBounds(70,150, 50, 20);
        
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            String t1 = tf1.getText();
            String t2 = tf2.getText();
            
            int c1 = 0;
            if(ae.getSource() == b1) {
                c1 = Integer.parseInt(t1) + Integer.parseInt(t2);
            }
            else if(ae.getSource() == b2) {
                c1 = Integer.parseInt(t1) - Integer.parseInt(t2);
            }
            String c = String.valueOf(c1);
            tf3.setText(c);
        }
        });
        
        this.addWindowListener(new WindowAdapter()  {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
        });
        
        add(l1); add(tf1); add(b1);
        add(l2); add(tf2); add(b2);
        add(tf3);
        setSize(200, 200);
        setLayout(null);
        setBackground(Color.orange);
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new TextFieldExample();
    }
}
