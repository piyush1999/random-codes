package vediSoftPractice;
import java.util.Scanner;
class Character {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    char ch = kb.next().charAt(0);
    if(ch >='A' & ch<='Z')
    {
        System.out.println("upper");
    }
    else if(ch >= 'a' & ch<='z')
    {
        System.out.println("lower");
    }
    else
    {
        System.out.println("special");
    }
        
    }    
}
