import java.util.*;

public class Tehdas {
    
    public long laske(int[] t, int x) {
        PriorityQueue<Kone> koneet = new PriorityQueue<>();
        PriorityQueue<Kone> varatut = new PriorityQueue<>();
        
        long aikaaKulunut = 0;
        
        for(int i = 0; i < t.length; i++){
            koneet.add(new Kone(t[i]));
        }
        
        while(x > 0){
            Kone eka = koneet.poll();
            eka.varaa(aikaaKulunut);
            
            // Katsotaan odotetaanko seuraavalle rundille (että eka valmistuu)
            // vai varataanko seuraava kone työtä varten
            
            if(eka.getTeho() * 2 < koneet.peek().getTeho()){
                aikaaKulunut += eka.getTeho();
                x--;
                eka.valmis();
                koneet.add(eka);
                
            } else {
                Kone next = koneet.poll();
                next.varaa(aikaaKulunut);
                aikaaKulunut += next.getTeho();
                
                
            }
        }
        
        return aikaaKulunut;
    }

    
}
