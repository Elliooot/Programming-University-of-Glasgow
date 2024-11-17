public class Sorting {
    public static void sort(Orderable[] array){
        boolean anyChanged = true;
        while(anyChanged){
            anyChanged = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i].isBiggerThan(array[i+1])){
                    Orderable temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    anyChanged = true;
                }
            }
        }
    }
}
