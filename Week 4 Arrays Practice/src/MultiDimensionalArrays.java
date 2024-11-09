import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int s = sc.nextInt();

        int[][] arr = new int[s][s];

        for(int i = 0; i < s; i++){
            for(int j = 0; j < s; j++){
                if(i == 0 && j == 0){
                    arr[i][j] = 1;
                }else if(j == 0){
                    arr[i][j] = 0;
                }else
                    arr[i][j] = (j + 1) / (i + 1);
            }
        }

        printArr(arr);
    }
    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
