public class PisinToisto {
    int laske(int[] t) {
        int maxtoisto = 1;
        int toisto = 1;
        
        for(int indeksi = 0; indeksi < t.length; indeksi++){ 
            if(toisto > maxtoisto){
                maxtoisto = toisto;
            }
            if(indeksi + 1 < t.length){
                if(t[indeksi] == t[indeksi + 1]){
                    toisto++;
                } else {
                    toisto = 1;
                }
                
            }
            
        }
        
        return maxtoisto;
    }
}