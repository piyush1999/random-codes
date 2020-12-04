package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTillSingleDigit {
    
    public static int sumOfDigit(int num) {
        int res = 0;
        for(int i=num;i>0;i/=10) {
            res += (i%10);
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int num = Integer.parseInt(br.readLine());
        int sop = num;
        while(sop >= 10) {
            sop = sumOfDigit(sop);
        }
        System.out.print("final sum of digit is: " + sop);
    }
}
