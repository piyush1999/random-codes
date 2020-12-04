package arrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Walls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*no of interior walls*/
        int in_walls = Integer.parseInt(br.readLine());
        /*no of exterior walls*/
        int ex_walls = Integer.parseInt(br.readLine());
        /*cost of interior walls*/
        int cost_in = 18;
        int cost_ex = 12;
        Double[] interior = new Double[in_walls];
        Double[] exterior = new Double[ex_walls];
        Double in_sum = 0.0;
        Double ex_sum = 0.0;
        Double final_sum = 0.0;
        for(int i=0;i<in_walls;i++) {
            interior[i] = Double.parseDouble(br.readLine());
            in_sum += interior[i];
        }
        for(int i=0;i<ex_walls;i++) {
            exterior[i] = Double.parseDouble(br.readLine());
            ex_sum += exterior[i];
        }
        final_sum = (in_sum * 18) + (ex_sum * 12);
        System.out.println("final sum" + final_sum);
        
        
    }
}
