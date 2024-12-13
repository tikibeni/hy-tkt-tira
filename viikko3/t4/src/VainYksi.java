import java.util.Arrays;

public class VainYksi {
    int etsi(int[] t) {
        if(t.length == 1){
            return t[0];
        }
        int palautus = 0;
        Arrays.sort(t);
        for(int i = 0; i < t.length; i++){
           if(i + 1 < t.length){
                if(t[i] != t[i+1] && (i % 2 != 0 || i == 0)){
                    if(i==0){
                        palautus = t[i];
                    } else{
                        palautus = t[i+1];
                    }
                }                   
           }
        }
        
        return palautus;
    }
}
