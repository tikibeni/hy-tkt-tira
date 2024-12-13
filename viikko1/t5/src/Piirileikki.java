public class Piirileikki {
    public int viimeinen(int n) {        
        int[] taulukko = new int[n];
        
        int i = 0;
        while(i < n){
            taulukko[i] = i + 1;
            i++;
        }
        
        
        
        if(taulukko.length > 1){
            taulukko[1] = 0;
        }
        int poistettuja = 1;
        int poistoIndeksi = 0;
        
        while(poistettuja < taulukko.length - 1){
            int luettuja = 0;
            while(luettuja < 2){
                if(taulukko[poistoIndeksi] != 0){
                    luettuja++;
                }
                poistoIndeksi++;
            }
                                    
            if(poistoIndeksi > taulukko.length - 1){
                if(poistoIndeksi == taulukko.length){
                    poistoIndeksi = 0;
                } else {
                    poistoIndeksi = 1;
                }
            } else {
                taulukko[poistoIndeksi] = 0;
                poistettuja++;
            }
        }
            
        int viimeinenPiirissa = 0;
        int hakuIndeksi = 0;
        while(hakuIndeksi < taulukko.length - 1){
            if(taulukko[hakuIndeksi] != 0){
                viimeinenPiirissa = taulukko[hakuIndeksi];
                break;
            }
        }
        
        
        return viimeinenPiirissa;
    }
}
