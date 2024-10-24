public class ExpandableArray {
    private int[] myArray = new int[10];
    private int pos = 0;
    public void add(int a){
        if(pos >= myArray.length){
            int newArrayLength = myArray.length + 10;
            int[] newArray = new int[newArrayLength];
            for(int i = 0; i < myArray.length; i++){
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }
        myArray[pos++] = a;
    }
    public String toString(){
        String line = "";
        for(int i = 0; i < pos; i++){
            line += myArray[i] + ", ";
        }
        return line;
    }
    public int getLength(){
        return myArray.length;
    }
}
