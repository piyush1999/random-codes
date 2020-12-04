package arrayQuestions;

import java.util.Scanner;

public class DispContainshe {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        String[] names = new String[size];
        for(int i=0;i<size;i++) {
            names[i] = kb.next();
        }
        System.out.println("Names contains he as substring...");
        for(String i : names) {
            int x=0;
            for(int y=0;y<i.length();y++) {
                if("he".equals(i.substring(x, y))) {
                    System.out.println(i);
                }
            }
        }
    }
}
