/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class Jai {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int even_count = 0;
        int odd_count = 0;
        int n1 = 0;
        int n2 = 1;
        int c = 0;
        System.out.print(n2+" ");
        for(int i=0;i<num-1;i++) {
            c = n1 + n2;
            n1 = n2;
            n2 = c;
            System.out.print(c +" ");
            if(c%2 == 0) {
                even_count++;
            }
            else {
                odd_count++;
            }
            
        }
        System.out.println("");
        System.out.println(even_count);
        System.out.println(odd_count+1);
        
        
    }
}
