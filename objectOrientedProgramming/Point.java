package objectOrientedProgramming;

import java.util.Scanner;

public class Point {
    
//    Variable Declairations
    
    private int x;
    private int y;
  
//    getter setter
    
    public int getX() {
        return x;
    }
    
    public void setX(int a) {
        x = a;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int b) {
        y = b;
    }
    
//    Behaviors or Methods
    
    public void acceptData() {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter x:");
        x = kb.nextInt();
        System.out.println("enter y:");
        y = kb.nextInt();
    }
    
    public void showData() {
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
    
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.acceptData();
        p1.showData();
        Point p2;
        p2 = new Point();
        p2.setX(10);
        p2.setY(20);
        p2.showData();
    }
}