import java.util.Random;
import java.util.Scanner;

public class ArraysOfPrimitives {
    public static void main(String[] args) {
        double[] arr = new double[100];
        Random r = new Random();
        double d;

        for(int i = 0; i < 100; i++){
            d = r.nextDouble();
            arr[i] = d;
        }
        System.out.println(average(arr));

        int[] arr2 = new int[100];
        Random r2 = new Random();

        for(int i = 0; i < 100; i++){
            arr2[i] = r2.nextInt(100) + 0;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to check: ");
        int desiredNum = sc.nextInt();

        System.out.println(checkDesiredNum(arr2, desiredNum));

    }

    public static int checkDesiredNum(int[] arr, int desiredNum){
        for(int i = 0; i < 100; i++){
            if(arr[i] == desiredNum){
                return i;
            }
        }
        return -1;
    }
    public static double average(double[] arr){
        int size = arr.length;
        double sum = 0;
        double average = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }
        average = (double)(sum / size);
        return average;
    }
}
