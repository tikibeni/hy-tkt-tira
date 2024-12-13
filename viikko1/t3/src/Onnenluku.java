public class Onnenluku {
    public boolean tarkasta(int n) {
        String tarkastettava = Integer.toString(n);
        if(tarkastettava.matches("[4|7]*")){
            return true;
        }
        return false;
    }
}
