package arrayQuestions;

import java.util.Scanner;

public class TwoDArrayDiffLength {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter size:");
        int size = kb.nextInt();
        int[][] arr = new int[size][];
        int i, j;
        for(i=0;i<arr.length;i++) {
            System.out.print("enter size of "+(i+1)+" array:");
            int index_size = kb.nextInt();
            arr[i] = new int[index_size];
            System.out.println("enter data of "+(i+1)+" array:");
            for(j=0;j<arr[i].length;j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println("Your Array:");
        for(i=0;i<arr.length;i++) {
            for(j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}