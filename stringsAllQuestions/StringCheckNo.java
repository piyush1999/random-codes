package stringsAllQuestions;

import java.util.Scanner;

public class StringCheckNo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int count = 0;
        if(str.length()>=5) {
            for(int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                if (('0' <= ch && ch<= '9')) {
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
            System.out.println("length too short...");
        }
    }
}