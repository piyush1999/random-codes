/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vediSoftPractice;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float length = kb.nextFloat();
        float breadth = kb.nextFloat();
        System.out.println("area: "+ (length*breadth));
        System.out.println("perimeter: " + 2*(length+breadth));
    }
    
}
