package stringsAllQuestions;

import java.util.Scanner;

public class StringReverse {
    
    public static String reverse(String str) {
        String str1 = "";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
            str1 += ch[i];
        }
        return str1;
    }
    

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println("reversed string: "+reverse(s));
        
    }    
}
