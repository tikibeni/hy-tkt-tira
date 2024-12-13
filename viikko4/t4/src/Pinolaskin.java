import java.util.*;

public class Pinolaskin {    
    public long laske(String lasku) {
        // Taulukko string-otuksille, sisältää lukuja ja + ja *
        String[] palat = lasku.split("\\s+");
        long[] t = new long[palat.length];
        long tulos = 0;
        int laskuindeksi = -1;
        
        for(int i = 0; i < palat.length; i++){
            if (palat[i].equals("+")){
                tulos += t[laskuindeksi] + t[laskuindeksi - 1];
                t[laskuindeksi] = 0;
                laskuindeksi--;
            } else if (palat[i].equals("*")){
                tulos += t[laskuindeksi] * t[laskuindeksi - 1];
                t[laskuindeksi] = 0;
                laskuindeksi -= 1;
            } else {
                t[i] = Long.parseLong(palat[i]);
                laskuindeksi++;
            }
        }
        
        return tulos;
    }    
}
