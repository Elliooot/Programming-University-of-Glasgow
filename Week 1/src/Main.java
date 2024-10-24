public class Main {
    public static void main(String[] args) {
//        String message = "Hello World!";
//        int a = (int)3e6;
//        double pi = 3.1415;
//        double radius = 5.4;
//        double area = computeArea(radius);
//
//        System.out.println("Area is " + area);
//        int x = 7;
//        double y = 4.0;
//        double z = x / y;
//        System.out.println(z);
//
//        x = 7;
//        x /= y;
//        System.out.println(x);
        int x = 5;
        {
            int a = 3;
            System.out.println(x + a);
        }

        answer("Anges");
    }

    public static double computeArea(double myRadius){
        double pi = 3.14152;
        double myArea = pi * myRadius * myRadius;
        return myArea;
    }
    public static String validate(){
        return "Request validated";
    }
    public static void answer(String name){
        System.out.print("\n" + name + " has submitted a request: ");
        System.out.println(validate());
    }
}