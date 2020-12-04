package objectOrientedProgramming;

import java.util.Scanner;

public class Circle extends PointConstructor{
    // data members...
    protected float rad;
    // Constructors...
    public Circle() {
        super(10, 10);
        rad = 10f;
    }
    public Circle(int x, int y) {
        super(x, y);
        rad = 10f;
    }
    public Circle(int x, int y, float rad) {
        super(x, y);
        this.rad = rad;
    }
    public Circle(PointConstructor p) {
        super(p.getX(), p.getY());
        rad = 10f;
    }
    // Getter and Setters...
    public void setRad(int rad) {
        this.rad = rad;
    }
    public double getRad() {
        return rad;
    }
    // Methods...
    @Override
    public void AcceptData() {
        super.AcceptData();
        Scanner kb = new Scanner(System.in);
        System.out.print("enter radius: ");
        rad = kb.nextInt();
    }
    @Override
    public void showData() {
        super.showData();
        System.out.println("radius: "+ rad);
    }
    public PointConstructor getCenter() {
        int x = getX();
        int y = getY();
        PointConstructor p = new PointConstructor();
        return p;
        // this returns new point Point(getX(), getY())
    }
    
    public static void main(String[] args) {
        
        PointConstructor p1 = new PointConstructor(1, 2);
        Circle c1 = new Circle(p1);
        
        p1.showData();
        c1.showData();
        
        PointConstructor p2 = c1.getCenter();
        c1.getCenter().showData();
        PointConstructor p3 = new Circle();
        System.out.println(p3.getClass());
    }
}
