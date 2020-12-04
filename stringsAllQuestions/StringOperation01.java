package stringsAllQuestions;

import java.util.Scanner;

public class StringOperation01 {
    
    public static void occIndex(String str) {
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'b' || str.charAt(i) == 't') {
                System.out.print(str.charAt(i)+" at "+ i+" ");
            }
        }
    }
    
    public static void dispWord(String str) {
        String[] s = str.split(" ");
        System.out.println();
        System.out.println("words with length:");
        for(String i: s) {
            System.out.println(i+" "+i.length());
        }
    }
    
    public static void startsWith(String str) {
        String[] ch = str.split(" ");
        System.out.println();
        System.out.println("words starts with b:");
        for(String i : ch) {
            if (i.charAt(0) == 'b') {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = kb.nextLine();
        occIndex(str);
        dispWord(str);
        startsWith(str);
    }    
}
