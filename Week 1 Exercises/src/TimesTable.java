import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = keyboard.nextInt();
        timesTable(num);
    }
    public static void timesTable(int num){
        for(int i = 1; i <= 10; i ++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
