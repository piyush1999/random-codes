package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCMTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter A:");
        int a = Integer.parseInt(br.readLine());
        System.out.print("enter B:");
        int b = Integer.parseInt(br.readLine());
        int min_mul;
        min_mul = (a > b)? a : b;
        while(true) {
            if((min_mul % a == 0) && (min_mul % b == 0)) {
                System.out.println("LCM is" + min_mul);
                break;
            }
            ++min_mul;
        }
    }
}
