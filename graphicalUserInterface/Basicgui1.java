package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class Basicgui1 extends Frame{
    
    Basicgui1() {
        setTitle("My First Frame.....");
        setSize(500, 500);
        setBackground(Color.BLUE);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.out.println("bye bye");
            System.exit(0);
        }
    });
}
    
    public static void main(String[] args) {
        Basicgui1 b = new Basicgui1();
    }
}
