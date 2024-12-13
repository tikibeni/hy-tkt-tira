public class Halkaisu {
    int laske(int[] t) {
        int lkm = 0;
        if(t.length == 1){
            return lkm;
        }
        if(t.length == 2 && t[0] == t[1]){
            return 1;
        }
        
        int koksumma = 0;
        for(int k = 0; k < t.length; k++){
            koksumma += t[k];
        }
        
        for(int halkaisija = 1; halkaisija < t.length; halkaisija++){
            int oikeasumma = 0;            
            for(int oikea = halkaisija; oikea <t.length; oikea++){
                oikeasumma += t[oikea];
            }
            int vasensumma = koksumma - oikeasumma;
            
            if(vasensumma == oikeasumma){
                lkm++;
            }
            
        }
        return lkm;
    }
}
