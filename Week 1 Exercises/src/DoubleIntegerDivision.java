import java.util.Scanner;
public class DoubleIntegerDivision {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double r = a % b;
        System.out.println((int)(a/b));
        System.out.println(r);

//        System.out.println((int)(5.2/2.3));
//        System.out.println(5.2 % 2.3);
    }
}
