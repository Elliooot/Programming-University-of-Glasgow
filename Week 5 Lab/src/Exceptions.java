import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput) {
            try{
                int i = sc.nextInt();
                validInput = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid input");
                sc.nextLine();
                System.out.println("\nPlease enter an integer: ");
            }
        }
    }
}
