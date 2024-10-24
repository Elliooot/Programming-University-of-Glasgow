import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        double radius;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your radius");
        double userRadius = keyboard.nextDouble();
//        keyboard.nextLine();
        System.out.println(summariseCircle(userRadius));
    }
    public static double summariseCircle(double userRadius){
        return 3.14152 * userRadius * userRadius;
    }
}
