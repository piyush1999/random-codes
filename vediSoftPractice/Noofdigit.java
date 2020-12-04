package vediSoftPractice;

import java.util.Scanner;

class Noofdigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int sum = 0, res=0;
        for(int i=a;i>0;i/=10)
        {
            res += a%10;
            sum++;
            
        }
        System.out.println("no of digit: "+sum);
    }    
}
