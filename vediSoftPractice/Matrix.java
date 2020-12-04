package vediSoftPractice;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter row and col");
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] mat = new int[row][col];
        int[][] arr = new int[row][col];
        System.out.println("enter elements...");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                mat[i][j] = kb.nextInt();
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(i!=j) {
                    arr[j][i] = mat[i][j];
                }
                else {
                    arr[i][j] = mat[i][j];
                }
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }        
    }    
}
