package stringsAllQuestions;

import java.util.Scanner;

public class StringOperation02 {    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter string: ");
            String str = kb.next();
            if(str.length()>=3) {
                for(int i=0;i<str.length();i++) {
                    char c = str.charAt(i);
                    if (!('A'<=c&&c<='Z'||'a'<=c&&c<='z')) {
                        System.out.println("not proper string...");
                        break;
                    }
                }                
            }
            else {
                System.out.println("length too short...");
            }
    }    
}
