import java.util.Scanner; 
  
// Java program to find the prime numbers 
// between a given interval 
public class tcs { 
  
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        int  b, i, j, flag; 
        b = sc.nextInt();
        for (i = 2; i <= b; i++) { 
  
             
            if (i == 1 || i == 0) 
                continue; 
 
            flag = 1; 
  
            for (j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
  
         
            if (flag == 1) 
                System.out.print(i + " "); 
        } 
    } 
} 