import java.util.Scanner;
public class StringFormatting1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num = keyboard.nextDouble();
        String strNum = Double.toString(num);

        for(int i = 0; i < 100; i++){
            String res = "";
            String stri = String.format("%02d", i);
            String ans = String.format("%.2f", num * i);
            res += strNum + " x " + stri + " = " + ans;
            System.out.println(res);
        }
    }
}
