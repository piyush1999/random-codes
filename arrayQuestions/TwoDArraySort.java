package arrayQuestions;

import java.util.*;

public class TwoDArraySort {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter no of rows: ");
        int row = kb.nextInt();
        System.out.print("enter no of columns: ");
        int col = kb.nextInt();
        int[][] arr = new int[row][col];
        int[] sorted = new int[row*col];
        System.out.println("enter data in 2D array:");
        int i, j;
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println("your matrix:");
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
        int k=0, count=0;
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                sorted[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(sorted);
        System.out.println("Sorted Matrix:");
        for(i=0;i<sorted.length;i++) {
            System.out.print(sorted[i] +"\t");
            count++;
            if(count%col==0) {
                System.out.println();
            }
        }
    }
}
