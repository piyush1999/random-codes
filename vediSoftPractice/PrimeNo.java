package vediSoftPractice;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int i;
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Prime...");
                break;
            }            
        }
        if(num==i)
        {
            System.out.println("composite...");
        }
    }    
}
