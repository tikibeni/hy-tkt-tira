public class Kierrokset {
    int laske(int[] t) {
        int lkm = 1;
        if(t.length == 1){
            return lkm;
        }
        // At:n kaikki arvot aluksi nollia, eli falseja
        int[] at = new int[t.length + 1];
        // Alustetaan aputaulukon nolla todeksi, koska siinä ei ikinä käydä
        at[0] = 1;
        
        // Esim taulukossa {1,2,3,4,5} nyt aputaulukko {1,0,0,0,0,0}
        // 1: Tulee vastaan 1 - tarkistetaan aputaulukosta ollaanko käyty nollassa, vaihdetaan indeksi 1 trueksi, ei lisäkierrosta
        // 2: Tulee vastaan 2 - tarkistetaan aputaulukosta ollaanko käyty ykkösessä, vaihdetaan indeksi 2 trueksi, ei lisäkierrosta
        // ....
        
        
        // Taulukko {5,4,3,2,1} aputaulukko {1,0,0,0,0,0}
        // Tulee vastaan 5, tarkistetaan ollaanko käyty indeksissä 4: Ei, lkm++ ja aputaulun indeksi 5 trueksi
                
        for(int i = 0; i < t.length; i++){
            if(at[t[i] - 1] == 1){
                at[t[i]] = 1;
            } else {
                lkm++;
                at[t[i]] = 1;
            }
            
        }
                    

        return lkm;
    }
}

/*
Täällä sijaitsee haudatut yritykset:
-------------------------------------------------------

if(at[i+1] < at[i]){
    lkm++;
}

Sama tulos kuin seuraavalla:
-------------------------------------------------------
if(i == 0 && at[i+1] < at[i]){
                    lkm++;
                } else if (i > 0){
                    if(toisteisuus == false && at[i-1] + 1 == at[i+1]){
                        lkm++;
                        toisteisuus = true;
                    } else if (toisteisuus == false && at[i+1] < at[i]){
                        lkm++;
                    } else if (toisteisuus == true && at[i+1] < at[i] && at[i-1] + 1 != at[i+1]){
                        lkm++;
                        toisteisuus = false;
                    } else if (toisteisuus == true && at[i-1] - 1 == at[i+1]){
                        lkm++;
                    }
                }
--------------------------------------------------------
1000ms tulee vastaan, mutta ohjelma toimii oikein:

int n = 0;
        int[] pt = new int[t.length];
        for(int i = 0; i < t.length; i++){
            // pt sisältää tiedon indeksistä, missä luvun tulisi sijaita
            pt[i] = t[i] - 1;
            if(t[i] == n+1){
                n++;
            }
            // ehtolause...:
            // Jos löytyy taulukosta myöhemmästä indeksista, ei tarvitse aloittaa uutta kierrosta, muuten uusi kierros
            
            if(i+1 == t.length && n != t.length){
                i = -1;
                lkm++;
            }
        }
*/
