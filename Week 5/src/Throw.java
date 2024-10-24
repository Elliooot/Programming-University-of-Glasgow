public class Throw {
    public static void main(String[] args) {
//        System.out.println("About to throw an unchecked exception");
//        throw new ArrayIndexOutOfBoundsException();
        System.out.println("About to throw");
        throw new MyException();
    }
}
