package arrayQuestions;

import java.io.*;
import java.util.Arrays;

public class ggeks1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter numbers:");
        String[] s = br.readLine().trim().split(" ");
        System.out.println(Arrays.toString(s));
        int[] a = new int[s.length];
        for(int i=0;i<s.length;i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        
        for(int i=0;i<a.length;i++) {
            System.out.println(" " + a[i]);
        }
    }
    
}
