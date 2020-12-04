package graphicalUserInterface;

import java.awt.*;  
import javax.swing.*;  
  
class MyCanvas extends JFrame{  
      
    MyCanvas() {
        
        JLabel back;
        
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Downloads\\background.jpg");
        Image i = img.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(i);
        back = new JLabel(img1);
        back.setBounds(0, 0, 1200, 700);
        add(back);
        setSize(1200, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }  
    public static void main(String[] args) {  
        new MyCanvas();  
    }  
  
}  