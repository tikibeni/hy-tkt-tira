import java.util.*;

public class Inversiot {
    int[] muodosta(int n, long k) {
        int[] t = new int[n];
        int[] at = new int[n];
        
        // Siirtämällä lukua vasemmalle saadaan aina yksi inversio lisää
        // Tämä voidaan aloittaa luvusta n, ja jatkaa aina lukuun yksi asti.
        
        // Näin pitää ensin laskea mihin indeksiin kukin siirtyvä luku pitää sijoittaa
        // Viimeisellä indeksillä siirtymä- ja inversiovaraa: n-1, n/2
        // Toiseksi viimeisellä indeksillä siirtymä- ja inversiovaraa: n-2
        // jne...
        
        // Inversioita saadaan siis enimmillään taulukon vastaikkaisjärjestyksellä:
        // {5,4,3,2,1}
        // (5,4),(5,3),(5,2),(5,1) , (4,3),(4,2),(4,1) , (3,2),(3,1) , (2,1)
        // Kmax = 2n
        
        // {1,2,3,4,5,6,7,8,9,10}
        // {10,9,8,7,6,5,4,3,2,1}:
        
        // (10,9),(10,8),(10,7),(10,6),(10,5),(10,4),(10,3),(10,2),(10,1)
        // (9,8),(9,7),(9,6),(9,5),(9,4),(9,3),(9,2),(9,1)
        // (8,7),(8,6),(8,5),(8,4),(8,3),(8,2),(8,1)
        // (7,6),(7,5),(7,4),(7,3),(7,2),(7,1)
        // (6,5),(6,4),(6,3),(6,2),(6,1)
        // (5,4),(5,3),(5,2),(5,1)
        // (4,3),(4,2),(4,1)
        // (3,2),(3,1)
        // (2,1)
        
        // = 45
        
        // Eli vaikkapa inversiovaatimuksen ollessa 7, kun n = 5, niin:
        // normaalisti indeksissä 4 (luku 5) oleva siirtyy indeksiin 0 ja inversioCount kasvaa neljällä
        // normaalisti indeksissä 3 (luku 4) oleva siirtyy indeksiin 1 ja inversioCount kasvaa kolmella        
        
        // Inversioarvot esim. jonossa
        // {1, 2, 3, 4, 5}
        //  0, 1, 2, 3, 4
                
        // Luvun indeksi on samalla sen inversioarvo! Alkaa jonon viimeisestä luvusta
        
        long inversioita = 0;
        int lukuMihin = 0;
        
        for (int i = t.length - 1; i >= 0; i--){
            if(inversioita < k){
                if(inversioita + i <= k){
                    t[lukuMihin] = i + 1;
                    at[i] = 1;
                    inversioita += i;
                    lukuMihin++;
                }
            } else {
                break;
            }
        }
        
        // Täytetään tyhjät indeksit loogisesti
        int pieninLuku = 1;
        for (int i = 0; i < t.length; i++){
            if(t[i] == 0){
                if(i > 0 && at[pieninLuku - 1] == 1){
                   pieninLuku++;
                }
                t[i] = pieninLuku;
                pieninLuku++;  
                }          
        }
        
        return t;
    }
}
