package arrayQuestions;

import java.util.*;

public class DispAscendingOrder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int[] numbers;
        numbers = new int[size];
        for(int i=0;i<size;i++) {
            numbers[i] = kb.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted Arrays...");
        for(int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
