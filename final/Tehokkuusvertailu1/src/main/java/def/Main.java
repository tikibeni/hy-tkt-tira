package def;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Testisyöte
        
        int n = 100000;
        int[] taulu = new int[n];
        Random r = new Random(100);
        for (int i = 0; i <  n; i++){
            taulu[i] = r.nextInt(100);
        }
        
        
    }
}