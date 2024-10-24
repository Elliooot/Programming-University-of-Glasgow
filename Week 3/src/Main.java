import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sixDP(3.1415);
//        Scanner input = new Scanner(System.in);
//        System.out.println(returnString(input));

        Animal dog = new Animal(2, 4, 0);
        Animal spider = new Animal(8, 8, 0);
        Animal bird = new Animal(2, 2, 2);

        String str1 = "Hello";
        String str2 = "Hel";
        str2 += "lo";
        System.out.println(str2);
        boolean test1 = (str1.equals(str2));
        System.out.println(test1);
    }
    public static double sixDP(double input){
        System.out.println(input + "\tA");
        input *= 1000000;
        System.out.println(input + "\tB");
        input = ((int)input) / 1000000.0;
        System.out.println(input + "\tC");
        return input;
    }
    private static String returnString(Scanner s){
        System.out.println("Enter an integer: ");
        int int1;
        String readString = s.nextLine();
        Scanner in = new Scanner(System.in);
        in = new Scanner(readString);
        if(!in.hasNext()){
            return "You didn't enter any integers";
        }else{
            int1 = in.nextInt();
            if(!in.hasNext())
                return "You entered one integer: " + int1;
            else
                return "You entered too many integers";
        }
    }
}