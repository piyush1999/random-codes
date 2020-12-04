package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GcdElementArray {
    
    public static int findGcd(int arr[]) {
        int result = arr[0];
        for(int i=1;i<arr.length;i++) {
            result = gcd(arr[i], result);
        }
        return result;
    }
    
    public static int gcd(int a, int b) {
        if(a==0 || b==0) {
            return 0;
        }
        if(a==1 || b==1) {
            return 1;
        }
        if(a == b) {
            return a;
        }
        if(a > b) {
            System.out.println("a:" + a + "b:" + b + " " + (a-b));
            return gcd(a-b, b);
        }
        else {
            return gcd(a, b-a);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter numbers: ");
        String[] numbers = br.readLine().trim().split(" ");
        int[] arr = new int[numbers.length];
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("GCD :" + findGcd(arr));
    }
}
