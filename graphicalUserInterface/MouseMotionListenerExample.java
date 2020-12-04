package graphicalUserInterface;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame {
    
    MouseMotionListenerExample() {
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        
        this.addMouseMotionListener(new MouseMotionAdapter()  {
        public void mouseDragged(MouseEvent me) {
            Graphics g = getGraphics();
            g.setColor(Color.red);
            g.fillOval(me.getX(), me.getY(), 15, 15);
        }
        });
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            dispose();
        }
        });
        
    }
    
    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
