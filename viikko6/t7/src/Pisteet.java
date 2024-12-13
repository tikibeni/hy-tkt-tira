import java.util.*;

public class Pisteet {
    
    TreeMap<Integer,Long> pisteet = new TreeMap<>();
    
    public void lisaaPiste(int x) {
        if(pisteet.containsKey(x)){
            long lkm = pisteet.get(x);
            lkm++;
            pisteet.put(x,lkm);
        } else {
            pisteet.put(x, (long)1);
        }
    }
    
    public int etaisyys(int x) {
        if(pisteet.containsKey(x)){
            return 0;
        } else {
            int suurempi = -1;
            if(pisteet.higherKey(x) != null){
                suurempi = pisteet.higherKey(x);
            }
            
            int pienempi = -1;
            if(pisteet.lowerKey(x) != null){
                pienempi = pisteet.lowerKey(x);
            }
            
            if(suurempi == -1){
                return x - pienempi;
            } else if (pienempi == -1){
                return suurempi - x;
            } else if (suurempi - x <= x - pienempi){
                return suurempi-x;
            }
            return x - pienempi;
                    
        }
    }
}
