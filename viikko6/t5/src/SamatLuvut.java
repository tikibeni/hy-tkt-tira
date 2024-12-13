import java.util.*;

public class SamatLuvut {
    
    TreeMap<Integer,Integer> joukko = new TreeMap<>();

    public void lisaa(int x) {
        if(joukko.containsKey(x)){
            int lkm = joukko.get(x);
            lkm++;
            joukko.put(x,lkm);
        } else {
            joukko.put(x, 1);
        }
    }

    public void poista(int x) {
        if(joukko.containsKey(x)){
            if(joukko.get(x) != 0){
                int lkm = joukko.get(x);
                lkm--;
                if(lkm == 0){
                    joukko.remove(x);
                } else {
                    joukko.put(x,lkm);
                }                
            } else {
                joukko.remove(x);
            }
        }
    }

    public int pienin() {
        return joukko.firstKey();
    }
}
