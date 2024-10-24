public class BinTest {
    public static void main(String[] args){
        Bin normalBin = new Bin();
        normalBin.add("banana skin");
        normalBin.add("coke can");
        System.out.println(normalBin);
        RecyclingBin rBin = new RecyclingBin("glass");
        rBin.add("bottle");
        System.out.println(rBin);
        int w = rBin.weigh();
        rBin.empty();
//        int a  = normalBin.weigh(); //not ok!
    }
}
