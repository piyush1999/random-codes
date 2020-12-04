package stringsAllQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringFrequency {
    public static void main(String[] args) throws IOException {
        int[] freq = new int[52];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String str = br.readLine();
        String str1 = str.replaceAll("\\s", "");
        String result = " ";
        char[] ch = str1.toCharArray();
        Arrays.sort(ch);
        String str2 = new String(ch);
        System.out.println(str2);
        for(int i=0;i<str1.length();i++) {
            freq[str1.charAt(i) - 'A']++;
        }
        for(int i=0;i<freq.length;i++) {
            System.out.print(freq[i] + " ");
        }
    }
}
