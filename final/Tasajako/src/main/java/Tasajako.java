import java.util.Random;
import java.util.concurrent.TimeUnit;
        
public class Tasajako {
    static int n = 28;
    static int[] taulu = new int[n];
    static int toistot = 20;
    static int ylaraja = 99999999;
    
    private static boolean tasajako(int erotus, int k) {
	// oletus: taulu[0..k-1] voidaan jakaa kahteen osaan,
	//         joiden erotus on "erotus"
	// palauttaa true, jos alkiot k..n-1 kayttamalla
	// erotukseksi voidaan saada 0
	if (k == n)
	    return (erotus == 0);
        
	if (tasajako(erotus + taulu[k], k+1))
	    return true;
        
	else
	    return tasajako(erotus - taulu[k], k + 1);
    }
    
    public static void main(String[] args) {
        Random generator = new Random();

        for (int t = 0; t < toistot; t++) {
	    if (t > 0) System.out.println("--");
            
	    for (int i = 0; i < taulu.length; i++) {
		taulu[i] = generator.nextInt(ylaraja - 1) + 1;
	    }
            
            long alku = System.nanoTime();
	    boolean loytyi = tasajako(0, 0);
            long loppu = System.nanoTime();
            long aika = loppu - alku;
            
            System.out.printf("aika: %d ms; vastaus: %b%n",
                              TimeUnit.NANOSECONDS.toMillis(aika), loytyi);
        
        }
    }
}
