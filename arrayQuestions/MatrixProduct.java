package arrayQuestions;

import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];
        int[][] res = new int[row][col];
        int i, j, sum=0;
        
        System.out.println("For matrix 1:");
        for(i=0;i<m1.length;i++) {
            for(j=0;j<m1[i].length;j++) {
                m1[i][j] = kb.nextInt();
            }
        }
        
        System.out.println("For matrix 2:");
        for(i=0;i<m1.length;i++) {
            for(j=0;j<m1[i].length;j++) {
                m1[i][j] = kb.nextInt();
            }
        }
        for(i=0;i<m1.length;i++) {
            for(j=0;j<m2[0].length;j++) {
                for(int k=0;k<m2.length;k++) {
                    sum += m1[i][k] + m2[k][j];
                }
                res[i][j] = sum;
                sum=0;
            }
        }
        System.out.println("resultant matrix is: ");
        for(i=0;i<res.length;i++) {
            for(j=0;j<res[i].length;j++) {
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }        
    }    
}