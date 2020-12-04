package arrayQuestions;

import java.lang.*;
import java.io.*;

class GFG {
  public static void main (String[] args) throws IOException 
        {
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size");
        int n=Integer.parseInt(kb.readLine());
        int [][] arr=new int[2][2];
        System.out.println("enter elements");
        String s=kb.readLine();
        String[] s1=s.split(" ");
        int k = 0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=Integer.parseInt(s1[k]);
                k++;
            }    
        }
        System.out.println("array");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(" "+ arr[i][j]);
            }    
            System.out.println();
        }
        
}
}