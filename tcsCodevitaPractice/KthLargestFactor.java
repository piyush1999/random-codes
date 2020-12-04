package tcsCodevitaPractice;

import java.util.Scanner;

public class KthLargestFactor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int count = 0;
        for(int i=n;i>=1;i--) {
            if(n%i==0)
                count++;
            if(count == k) {
                System.out.println(i);
                break;
            }
        }
        if(count != k)
            System.out.println("1");
    }
}
