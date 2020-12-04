package arrayQuestions;

import java.util.Scanner;

public class DispStartWithA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] names;
        names = new String[n];
        for(int i=0;i<n;i++) {
            names[i] = kb.next();
        }
        System.out.println("Names Starts with A or a:");
        for(String i: names) {
            if(i.charAt(0) == 'A' || i.charAt(0) == 'a' ) {
                System.out.println(i);
            }
        }
    }
}
