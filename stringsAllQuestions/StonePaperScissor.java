/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsAllQuestions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StonePaperScissor {
    public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);		
                System.out.println("enter no of cases:");
                int test = kb.nextInt();
		for(int i=1;i<=test;i++) {
		    System.out.println("enter string:");
                    String s1 = kb.next();
		    
		    if(s1.charAt(0) =='P' && s1.charAt(1)=='P') {
		        System.out.println("DRAW");
		}
		    if(s1.charAt(0)=='R'&& s1.charAt(1)=='R') {
		        System.out.println("DRAW");
		}
		    if(s1.charAt(0)=='S'&& s1.charAt(1)=='S') {
		        System.out.println("DRAW");
		}
		    if(s1.charAt(0)=='P'&& s1.charAt(1)=='R') {
		        System.out.println("A");
		}
		    if(s1.charAt(0)=='R'&& s1.charAt(1)=='S') {
		        System.out.println("A");
		}
		    if(s1.charAt(0)=='S'&& s1.charAt(1)=='P') {
		        System.out.println("A");
		}
		    if(s1.charAt(0)=='R'&& s1.charAt(1)=='P') {
		        System.out.println("B");
		}
		    if(s1.charAt(0)=='S'&& s1.charAt(1)=='R') {
		        System.out.println("B");
		}
		    if(s1.charAt(0)=='P'&& s1.charAt(1)=='S') {
		        System.out.println("B");
		}
	}
}
   
}