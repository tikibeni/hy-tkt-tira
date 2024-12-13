public class Kone {
    private long teho;
    private boolean vapaa;
    private long varausaika;
    private long vapautumisaika;
    
    public Kone(long teho){
        this.teho = teho;
        this.vapaa = true;
    }
    
    public long getTeho(){
        return this.teho;
    }
    
    public boolean getTila(){
        return this.vapaa;
    }
    
    public long getVarausaika(){
        return this.varausaika;
    }
    
    public long getVapautumisaika(){
        return this.vapautumisaika;
    }
    
    public void varaa(long varausaika){
        this.vapaa = false;
        this.varausaika = varausaika;
        this.vapautumisaika = this.varausaika+this.teho;
    }
    
    public void valmis(){
        this.vapaa = true;
    }
        
}
