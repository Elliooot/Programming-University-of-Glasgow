import java.util.Scanner;
public class PadString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String s = keyboard.nextLine();
        System.out.println("Please enter a character");
        char c = keyboard.next().charAt(0);
        System.out.println("Please enter a length");
        int length = keyboard.nextInt();

        if(s.length() < length){
            for(int i = 0; i < length - s.length(); i++){
                System.out.print(c);
            }
        }
        System.out.println(s);
    }
}
