public class RecyclingBin extends Bin{
    private String type;
    public RecyclingBin(String t){
        super();
        type = t;
    }

    @Override
    public String toString() {
        return "Recycling bin (" + type + ") contains: " + contents;
    }
    public int weigh(){
        return contents.length();
    }
}
