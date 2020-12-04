package tcsCodevitaPractice;

import java.util.Scanner;

public class CollectingCandies {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter no of test case:");
        int testCase = kb.nextInt();
        for(int i=1;i<=testCase;i++) {
            int sum=0, tempSum;
            System.out.print("enter no of boxes:");
            int no_boxes = kb.nextInt();
            int[] box = new int[no_boxes];
            for(int k=0;k<box.length;k++) {
                box[k] = kb.nextInt();
            }
            tempSum = box[0] + box[1];
            for(int j=2;j<box.length;j++) {
                sum += tempSum;
                tempSum += box[j];
                //System.out.println(tempSum+" "+sum);
            }
            sum += tempSum;
            System.out.println(sum);
        }
    }
}
