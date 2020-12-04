package arrayQuestions;

import java.util.Scanner;

public class GFGCheckTriplets {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        System.out.print("enter no of testcase: ");
        int testcase = kb.nextInt();
        for(int i=0;i<testcase;i++) {
            System.out.print("enter size: ");
            int size = kb.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<arr.length;j++) {
                arr[j] = kb.nextInt();
            }
            
            for(int k=0;k<arr.length-2;k++) {
                for(int x=1;x<arr.length-1;x++) {
                    for(int y=2;y<arr.length;y++) {
                        sum = 0;
                        sum += arr[k] + arr[x] + arr[y];
                        if(sum == 0) {
                            System.out.println("triplet");
                            break;
                        }              
                    }
                    break;
                }
                break;
            }
            
        }        
    }
}
