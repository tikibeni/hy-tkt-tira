import java.util.*;

public class Merkkijonot {  
    
    public ArrayList<String> muodosta(int n) {
        ArrayList<String> mjonot = new ArrayList<>();
        
        String a = "A";
        String b = "B";
                
        if(n == 1){
            mjonot.add(a);
            mjonot.add(b);
            
            return mjonot;
        }
        
        for (int i = 0; i < n; i++){
            String eka = a;
            String vika = b;
            
            if(i == 0){
                for(int j = 0; j < n-1; j++){
                    eka += a;
                }
                mjonot.add(eka);
            }
            
            
            
            if(i == n-1){
                for(int j = 0; j < n-1; j++){
                    vika += b;
                }
                mjonot.add(vika);
            }
            
            
        }
        
        return mjonot;
    }
}
