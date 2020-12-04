package objectOrientedProgramming;

import java.util.Scanner;

public class PointConstructor {
    // member data...
    private int x;
    private int y;
    // constructors...
    public PointConstructor() {
        
    }
    public PointConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // getter and setter...
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    // member function...
    public void AcceptData() {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter x:");
        x = kb.nextInt();
        System.out.print("enter y:");
        y = kb.nextInt();        
    }
    public void showData() {
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
    
    public static void main(String[] args) {
        PointConstructor pc1 = new PointConstructor();
        PointConstructor pc2 = new PointConstructor(10, 20);
        pc1.showData();
        pc2.showData();
    }
    
}
