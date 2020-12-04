package vediSoftPractice;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double rad = kb.nextDouble();
        System.out.println("area is:"+(Math.PI*rad*rad));
        System.out.println("circumference is:"+(Math.PI*2*rad));        
    }
}
