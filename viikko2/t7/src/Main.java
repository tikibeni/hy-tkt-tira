import java.util.*;

public class Main {
    public static void main(String[] args) {
        Kierrokset k = new Kierrokset();
        System.out.println(k.laske(new int[] {4,1,3,2,5})); // 3
        System.out.println(k.laske(new int[] {1,2,3,4,5})); // 1
        System.out.println(k.laske(new int[] {5,4,3,2,1})); // 5
        System.out.println(k.laske(new int[] {1,6,2,7,3,8,4,9,5,10})); // 2
        System.out.println(k.laske(new int[] {1,9,2,8,3,7,4,6,5})); // 5
        System.out.println(k.laske(new int[] {7,1,5,3,4,6,2,8,9}));//4
    }
}
