package stringsAllQuestions;

import java.util.Scanner;

public class BackSpace extends RuntimeException {
    public static void main(String[] args) throws Throwable {
        int[] array = {0, 2, 4, 6, 8, 12, 14, 18, 20};
    for(int i=1;i<101;i++)
    	{
      for(int j=0;j<array.length;j++)
      	{
        if(i!=array[j])
        	{
          j++;
          }
        }
      }
  	
    }    
}
