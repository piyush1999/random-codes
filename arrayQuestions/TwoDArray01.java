package arrayQuestions;

import java.util.Scanner;

public class TwoDArray01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter row:");
        int row = kb.nextInt();
        System.out.print("enter column:");
        int col = kb.nextInt();
        int[][] num = new int[row][col];
        int[] rowSum = new int[num.length];
        int[] colSum = new int[num[0].length];
        int sum = 0, i, j;
        System.out.print("enter data: ");
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                num[i][j] = kb.nextInt();
                sum += num[i][j];
                rowSum[i] += num[i][j];
                colSum[j] += num[i][j];
            }       
        }
        for(i=0;i<num.length;i++) {
            for(j=0;j<num[i].length;j++) {
                System.out.print("\t"+ num[i][j]);                
            }
            System.out.println("\t" + rowSum[i]);
        }
        for(i=0;i<colSum.length;i++) {
            System.out.print("\t"+colSum[i]);
        }
        System.out.print("\t"+sum);
    }
}