package graphicalUserInterface;

import java.awt.*;  
import java.awt.event.*;  
class WindowEvents extends Frame{
    WindowEvents() {
        this.setVisible(true);
        this.setSize(1000, 1000);
        this.setBackground(Color.red);
        this.setTitle("my window frame");
        this.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we) {
                        System.out.println("window closing");
                        System.exit(0);
                    }
                }
        );
        
    }
    
    public static void main(String args[]){
        WindowEvents ae = new WindowEvents();
    }  
}  