import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inversiot i = new Inversiot();
        int[] t = i.muodosta(5,2);
        System.out.println(Arrays.toString(t)); // [2, 1, 3, 5, 4]
        int[] t1 = i.muodosta(3, 3);
        System.out.println(Arrays.toString(t1)); // [3, 2, 1]
        int[] t2 = i.muodosta(4, 4);
        System.out.println(Arrays.toString(t2)); // [4, 3, 2, 1]
    }
}
