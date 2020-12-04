package vediSoftPractice;
public class PrimeRange {
    public static void main(String[] args) {
        int i, j;
        for(i=100;i<=200;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {                   
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }    
}
