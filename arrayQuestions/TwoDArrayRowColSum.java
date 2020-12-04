package arrayQuestions;

import java.util.Scanner;

public class TwoDArrayRowColSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] arr = new int[row][col];
        int[] rowSum = new int[arr.length];
        int[] colSum = new int[arr[0].length];
        int i, j, sum = 0;
        for(i=0;i<arr.length;i++) {
            for(j=0;j<arr[i].length;j++) {
                arr[i][j] = kb.nextInt();
                sum += arr[i][j];
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
            }
        }
        for(i=0;i<arr.length;i++) {
            for(j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(rowSum[i]+" ");
        }
        for(i=0;i<arr[0].length;i++) {
            System.out.print(colSum[i] +" ");
        }
        System.out.print(sum + " ");        
    }    
}
