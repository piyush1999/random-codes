package vediSoftPractice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float a = kb.nextFloat();
        float b = kb.nextFloat();
        System.out.println("sum: "+(a+b));
        System.out.println("diff: "+(a-b));
        System.out.println("prod: "+(a*b));
        System.out.println("div: "+(a/b));
    }
}
