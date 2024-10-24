public class Bin {
    protected String contents;
    public Bin(){
        contents = "";
    }
    public void add(String thing){
        contents += thing + ", ";
    }

    @Override
    public String toString() {
        return "Bin{" +
                "contents='" + contents + '\'' +
                '}';
    }
    public void empty(){
        contents = "";
    }
}
