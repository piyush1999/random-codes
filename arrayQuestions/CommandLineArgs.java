package arrayQuestions;

public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("enter data:");
        if(args[0].length()<1) {
            System.out.println("invalid no..");
        }
        else {
            int num = Integer.parseInt(args[0]);
            System.out.println("square is:"+ Math.pow(num, 2) );
        }
    }
}
