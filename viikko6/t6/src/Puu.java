public class Puu {
    int arvo;
    Puu vasen;
    Puu oikea;

    public Puu(int arvo, Puu vasen, Puu oikea) {
        this.arvo = arvo;
        this.vasen = vasen;
        this.oikea = oikea;
    }    
    
    public Puu getOikea(){
        return this.oikea;
    }
    
    public Puu getVasen(){
        return this.vasen;
    }
    
    public int getArvo(){
        return this.arvo;
    }
    
    @Override
    public String toString() {
        String vasenNimi = "-";
        if (vasen != null) vasenNimi = vasen.toString();
        String oikeaNimi = "-";
        if (oikea != null) oikeaNimi = oikea.toString();
        return "["+arvo+",   \n"+vasenNimi+","+oikeaNimi+"]";
    }
}
