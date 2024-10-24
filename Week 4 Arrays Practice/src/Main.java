import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[100];
        Random r = new Random();
        double d;

        for(int i = 0; i < 100; i++){
            d = r.nextDouble();
            arr[i] = d;
//            System.out.println(arr[i]);
        }
        System.out.println(average(arr));
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