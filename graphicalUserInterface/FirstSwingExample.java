package graphicalUserInterface;

import java.awt.Color;
import javax.swing.*;

public class FirstSwingExample extends JFrame{
    
   FirstSwingExample() {
       JButton jb = new JButton("click me!!!");
       jb.setBounds(130, 100, 100, 40);
       add(jb);
       setSize(400, 500);
       setLayout(null);
       setBackground(Color.BLACK);
       setVisible(true);
   } 
    
    public static void main(String[] args) {
        new FirstSwingExample();
    }
}
