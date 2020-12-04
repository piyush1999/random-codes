package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class SchoolCompetition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = " ";
        System.out.print("Enter no of members of team:");
        int num = Integer.parseInt(br.readLine());
        String part;
        while(true) {
            System.out.print("Enter String:");
            part = br.readLine();
            if(part.equals("q") || part.equals("Q")) {
                break;
            }
            else {
                str += part;
                str += " ";
            }
        }
        String[] names = str.trim().split(" ");
        Double[] height = new Double[names.length];
        System.out.println("Enter height: ");
        for(int i=0;i<names.length;i++) {
            height[i] = Double.parseDouble(br.readLine());
        }
        for (String name : names) {
            System.out.print(name + " ");
        }
        for(double i : height) {
            System.out.print(i+" ");
        }
        HashMap<Double, String> map = new HashMap<>();
        for(int i = 0;i<names.length;i++) {
            map.put(height[i], names[i]);
        }
        
        System.out.println(map);
        Arrays.sort(height);
        int count = 0;
        for(int i=names.length-1;i>0;i--) {
            if(count <= num) {
                System.out.print(map.get(height[i]) + " ");
                count++;
            }
            else {
                break;
            }
            
        }
        
    }
}
