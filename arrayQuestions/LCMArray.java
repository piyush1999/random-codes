package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCMArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().trim().split(" ");
        int[] arr = new int[num.length];
        for(int i=0;i<num.length;i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        
    }
}
