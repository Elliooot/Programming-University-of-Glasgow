import java.util.Random;

public class SortExample {
    public static void main(String[] args) {
        Number[] a = new Number[10];
        Random r = new Random();
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = new Number(r.nextInt(100));
            System.out.println(a[i] + " ");
        }
        System.out.println("Sorted Array: ");
        Sorting.sort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
        Car[] b = new Car[5];
        System.out.println("Unsorted: ");
        for(int i = 0; i < b.length; i++) {
            b[i] = new Car(r.nextDouble()*200.0);
            System.out.println(b[i]);
        }
        System.out.println("Sorted");
        Sorting.sort(b);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
