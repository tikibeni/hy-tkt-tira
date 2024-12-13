import java.util.*;

public class Main {

    public static int vasenSolmut(Puu puu){
        int solmuja = 1;
        
        if(puu.getVasen() != null || puu.getOikea() != null){
            if(puu.getVasen() != null){
                solmuja += vasenSolmut(puu.getVasen());
            }
            if(puu.getOikea() != null){
                solmuja += vasenSolmut(puu.getOikea());
            }
        }
        
        return solmuja;
    }
    
    public static int oikeaSolmut(Puu puu){
        int solmuja = 1;
        
        if(puu.getVasen() != null || puu.getOikea() != null){
            if(puu.getVasen() != null){
                solmuja += oikeaSolmut(puu.getVasen());
            }
            if(puu.getOikea() != null){
                solmuja += oikeaSolmut(puu.getOikea());
            }
        }
        
        return solmuja;
    }
    
    public static int vasenHaara(Puu puu){
        // Parametrina on annettu vasen juuri
        int pituus = 1;
        int alemmat = 0;
        int haaraOikea = 0;
        int haaraVasen = 0;
        
        if(puu.getVasen() != null || puu.getOikea() != null){
            if(puu.getVasen() != null){
                haaraVasen = vasenHaara(puu.getVasen());
            }
            if(puu.getOikea() != null){
                haaraOikea = vasenHaara(puu.getOikea());
            }
            
            // Estää samojen kerrosten tuplalaskemisen
            if(haaraVasen > haaraOikea){
                alemmat = haaraVasen;
            } else {
                alemmat = haaraOikea;
            }
        }
        
        return pituus + alemmat;
    }
    
    public static int oikeaHaara(Puu puu){
        int pituus = 1;
        int lisa = 0;
        int haaraVasen = 0;
        int haaraOikea = 0;
        
        if(puu.getVasen() != null || puu.getOikea() != null){
            if(puu.getVasen() != null){
                haaraVasen = oikeaHaara(puu.getVasen());
            }
            if(puu.getOikea() != null){
                haaraOikea = oikeaHaara(puu.getOikea());
            }         
            if(haaraVasen > haaraOikea){
                lisa = haaraVasen;
            } else {
                lisa = haaraOikea;
            }
        }
        
        return pituus + lisa;        
    }

    public static boolean onkoAVL(Puu puu) {
        // Jos korkeus on nolla.        
        if(puu.getOikea() == null && puu.getVasen() == null){
            return true;
        }
        
        // Jos korkeus on yksi.
        if(puu.getOikea() == null && vasenHaara(puu.getVasen()) == 1 || puu.getVasen() == null && oikeaHaara(puu.getOikea()) == 1){
            return true;
        }
        
        int oikea = 0;
        int vasen = 0;
        int solmutOikea = 0;
        int solmutVasen = 0;
        
        if(puu.getOikea() != null){
            oikea = oikeaHaara(puu.getOikea());
            solmutOikea = oikeaSolmut(puu.getOikea());
        }
                
        if(puu.getVasen() != null){
            vasen = vasenHaara(puu.getVasen());
            solmutVasen = vasenSolmut(puu.getVasen());
        }
        
        if(Math.abs(oikea - vasen) <= 1){
            if(Math.abs(solmutOikea - solmutVasen) % 2 == 0){
                return true;
            } 
            
            if(Math.abs(solmutOikea-solmutVasen) != 1 && Math.abs(solmutOikea-solmutVasen) != 3){
                return true;
            }            
        } 
        
        return false;
    }

    public static void main(String[] args) {
        Puu puu1 = new Puu(0,
                new Puu(0,
                        new Puu(0, null, null),
                        new Puu(0, null, null)),
                new Puu(0,
                        new Puu(0, null, null),
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null))));

        System.out.println(onkoAVL(puu1)); // true

        Puu puu2 = new Puu(0,
                new Puu(0,
                        new Puu(0, null, null),
                        null),
                new Puu(0,
                        new Puu(0,
                                null,
                                new Puu(0, null, null)),
                        new Puu(0, null, null)));

        System.out.println(onkoAVL(puu2)); // true

        Puu puu3 = new Puu(0,
                new Puu(0,
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null)),
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null))),
                new Puu(0,
                        new Puu(0, null, null),
                        new Puu(0, null, null)));

        System.out.println(onkoAVL(puu3)); // true

        Puu puu4 = new Puu(0,
                new Puu(0,
                        new Puu(0, null, null),
                        new Puu(0, null, null)),
                new Puu(0,
                        new Puu(0, null, null),
                        new Puu(0,
                                new Puu(0, null, new Puu(0, null, null)),
                                new Puu(0, null, null))));

        System.out.println(onkoAVL(puu4)); // false

        Puu puu5 = new Puu(0,
                new Puu(0,
                        new Puu(0,
                                new Puu(0, null, null), null),
                        null),
                new Puu(0,
                        new Puu(0, null, new Puu(0, null, null)),
                        new Puu(0, null, null)));

        System.out.println(onkoAVL(puu5)); // false

        Puu puu6 = new Puu(0,
                new Puu(0,
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null)),
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null))),
                new Puu(0,
                        null,
                        new Puu(0,
                                new Puu(0, null, null),
                                new Puu(0, null, null))));

        System.out.println(onkoAVL(puu6)); // false
    }
}
