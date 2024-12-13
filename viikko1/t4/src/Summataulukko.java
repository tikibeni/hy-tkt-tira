
import java.util.*;

public class Summataulukko {
    private long[] sumTaul;

    public Summataulukko(long[] taulukko) {
        this.sumTaul = new long[taulukko.length];
        this.sumTaul[0] = taulukko[0];
        int i = 0;
        while(i < taulukko.length - 1){
            this.sumTaul[i + 1] = this.sumTaul[i] + taulukko[i+1];
            i++;
        }
        
    }

    public long summa(long l, long r) {
        long alkuarvo = 0;
        if (l > 0){
           alkuarvo = this.sumTaul[(int) l - 1];
        }
        return this.sumTaul[(int) r] - alkuarvo;
    }
}
