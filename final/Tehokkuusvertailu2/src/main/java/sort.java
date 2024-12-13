import java.util.Arrays;
import java.util.Random;

public class sort {
    public static void main(String[] args){
        // Testisyöte
        int n = 100000;
        int[] taulu = new int[n];
        Random r = new Random(100);
        for (int i = 0; i <  n; i++){
            taulu[i] = r.nextInt(100);
        }
        
        long alku = System.nanoTime();
        javasort(taulu);
        long loppu = System.nanoTime();
        
        System.out.println("Aikaa kului: " + ((loppu-alku)/1e9)+" s");
        
        
    }
    
    static int[] javasort(int[] taulu){
        Arrays.sort(taulu);
        return taulu;
    }
}
