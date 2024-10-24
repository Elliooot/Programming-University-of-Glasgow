public class addingMethod {
    public static void addingMethod(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
    }

    public static void main(String[] args){
        int a = 3;
         int b = 4;
         int c = 6;
         int d = 21;

         addingMethod(a, b);
         addingMethod(c, d);
         addingMethod(4, 10);
    }
}
