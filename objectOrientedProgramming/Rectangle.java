package objectOrientedProgramming;

import java.util.Scanner;

public class Rectangle {
    
    protected int len;
    protected int bred;
    
    public int getLen() {
        return len;
    }
    
    public void setLen(int l) {
        len = l;
    }
    
    public int getBred() {
        return bred;
    }
    
    public void setBred(int b) {
        bred = b;
    }
    
    public void acceptData() {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter length:");
        len = kb.nextInt();
        System.out.println("enter breadth:");
        bred = kb.nextInt();
    }
    
    public void showData() {
        System.out.println("length: "+ len);
        System.out.println("breadth: "+ bred);
    }
    
    public double getArea() {
        return len*bred;
    }
    
    public double getPerimeter() {
        return 2*(len+bred);
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Point p = new Point();
        p.acceptData();
        p.showData();
        r1.acceptData();
        r1.showData();
        System.out.println("area: "+ r1.getArea());
        System.out.println("perimeter: "+ r1.getPerimeter());

    }
}
