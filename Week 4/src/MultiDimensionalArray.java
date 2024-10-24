public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][] table = new int[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                table[i][j] = i * j;
            }
        }
        for(int i = 0; i < 3; i++){
            print1DIntArray(table[i]);
        }
    }
    public static void print1DIntArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}