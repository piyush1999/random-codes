package stringsAllQuestions;

import java.util.Scanner;

public class SameCharTwoStrings {
    
    public static int checkString(String a, String b) {
        int count = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i) == b.charAt(i)) {
                    count++;
                }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1 = kb.nextLine();
        String s2 = kb.nextLine();
        int res = checkString(s1, s2);
        System.out.println("no of chars:" + res);
    }    
}
