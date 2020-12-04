package stringsAllQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class MultipleConsequtiveOccurance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String str = br.readLine();
        String copy = "";
        char prev = ' ';
        for(int i=0;i<str.length();i++) {
            if(prev != str.charAt(i)) {
                copy += str.charAt(i);
            }
            prev = str.charAt(i);
        }
        System.out.println("new string: "+ copy);
        String rev = "";
        for(int i=copy.length()-1;i>=0;i--) {
            rev += copy.charAt(i);
        }
        System.out.println(rev);
    }
    
}
