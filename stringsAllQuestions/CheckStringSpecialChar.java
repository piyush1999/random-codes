package stringsAllQuestions;

import java.util.Scanner;

public class CheckStringSpecialChar {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        int count = 0;
        if(str.length() >= 6) {
            for (int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                if('a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z' || '0'<=ch&&ch<='9' || ch == '@') {
                    count++; 
                }
            }
            if (count == str.length()) {
                System.out.println("proper string...");
            }
            else {
                System.out.println("improper string...");
            }
        }
        else {
            System.out.println("string too short...");
        }
    }
}
