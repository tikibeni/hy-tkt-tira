
import java.util.*;

public class Main {

    public static int montakoErilaista(String[] taulukko) {
        if(taulukko.length == 1){
            return 1;
        }
        Arrays.sort(taulukko);
        int count = 1;
        for(int i = 0; i < taulukko.length; i++){
            if(i+1 < taulukko.length){
                if(!taulukko[i].equals(taulukko[i+1])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(montakoErilaista(new String[]{"apina", "banaani", "cembalo"}));
        System.out.println(montakoErilaista(new String[]{"a", "b", "c", "d", "a"}));
        System.out.println(montakoErilaista(new String[]{"abba", "abbb", "bbba", "babb", "bbab"}));
        System.out.println(montakoErilaista(new String[]{"babb", "abbb", "bbba", "babb", "bbab"}));
    }
}
