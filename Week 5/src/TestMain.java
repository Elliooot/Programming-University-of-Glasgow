public class TestMain {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            System.out.println(Integer.parseInt(str));
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
