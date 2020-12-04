package arrayQuestions;

import java.util.Scanner;

public class ProductAndRegion {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        for rows...
        System.out.print("Enter no of products....");
        int product = kb.nextInt();
//        for columns...
        System.out.print("Enter no of regions....");
        int region = kb.nextInt();
        int[][] sales = new int[product][region];
        int[] prodSum = new int[sales.length];
        int[] regionSum = new int[sales[0].length];        
        int i, j, sum=0;
        System.out.println("Enter data:");
        for(i=0;i<sales.length;i++) {
            for(j=0;j<sales[i].length;j++) {
                sales[i][j] = kb.nextInt();
                sum += sales[i][j];
                prodSum[i] += sales[i][j];
                regionSum[j] += sales[i][j];
            }
        }
        System.out.println("your data is:");
        for(i=0;i<sales.length;i++) {
            for(j=0;j<sales[i].length;j++) {
                System.out.print(sales[i][j] +"\t");
            }
            System.out.println(prodSum[i]+"\t");
        }
        for(j=0;j<sales[0].length;j++) {
            System.out.print(regionSum[j] +"\t");
        }
        System.out.print(sum+"\t");
    }    
}