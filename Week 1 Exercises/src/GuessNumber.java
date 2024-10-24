import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args){
        int times = 10;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        while(times > 0){
            System.out.println("Please enter a number:");
            int num = keyboard.nextInt();
            if(num < randomNum)
                System.out.println("Too low");
            else if(num > randomNum)
                System.out.println("Too high");
            else{
                System.out.println("Correct!");
                break;
            }
            times--;
        }
    }
}
