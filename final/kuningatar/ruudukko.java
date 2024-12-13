import java.util.Arrays;

public class ruudukko {
    private int n;
    private int[][] r;
    
    public ruudukko(int n){
        this.n = n;
        this.r = new int[n][n];
    }
    
    public int ratkaisut(){
        int ratkaisuja = 0;        
        for(int rivi = 0; rivi < r.length; rivi++){
            if(kuningattaret(rivi) == true){
                ratkaisuja++;
            }
        }
        
        return ratkaisuja;
    }
    
    public boolean sallittu(int rivi, int sarake){
        for(int i = 0; i < sarake; i++){
            if(r[rivi][i] == sarake){
                return false;
            }
            if(Math.abs(rivi - i) == Math.abs(sarake - r[i][i])){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean kuningattaret(int seuraavaRivi){
        if(seuraavaRivi == r.length - 1){
            tulosta();
            return true;
        }
        
        for (int sarake = 0; sarake < r.length; sarake++){
            if(sallittu(seuraavaRivi, sarake)){
                r[seuraavaRivi][sarake] = sarake;
                
                if(kuningattaret(seuraavaRivi+1)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void tulosta(){
        System.out.println(Arrays.toString(r));
    }
    
    
}
