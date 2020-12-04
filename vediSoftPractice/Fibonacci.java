package vediSoftPractice;
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int limit = kb.nextInt();
        int s1 = 0;
        int s2 = 1;
        int sum = 0;
        System.out.print(s1+" ");
        System.out.print(s2+" ");
        for(int i=1 ; i<=limit ; i++)
        {
            sum = s1 + s2;
            System.out.print(sum+" ");
            s1 = s2;
            s2 = sum;
        }
    }    
}
