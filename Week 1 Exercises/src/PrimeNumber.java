import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = keyboard.nextInt();
        allPrimeNumber(num);
        System.out.println();
        System.out.println(isPrime(num));
        keyboard.close();
    }
    public static void allPrimeNumber(int num){
        for(int i = 2; i < num; i++){
            int cnt = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt < 2){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int m){
        for(int i = 2; i <= m / 2; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
}
