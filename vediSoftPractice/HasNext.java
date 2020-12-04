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
public class HasNext {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        for(int i=1; kb.hasNext()==true;i++) {
            System.out.println("daksh...");
            System.out.println(i+" "+kb.nextLine());
            
        }
        kb.close();
    }    
}
