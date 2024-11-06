public class Main {
    public static void main(String[] args) {
//        String a = "Hello"; String b = "Hello"; b += ""; //empty
//        boolean test1 = (a == b);
//        System.out.println(test1);

        Advanturer adv2 = new Advanturer("Exceptionada");
        Person p = new Person("Janet", 35);
//        System.out.println(testInstance1(adv2));
//        System.out.println(testInstance1(p));

        Avatar av1 = new Avatar("Ed", 10, 5);
        Avatar av2 = new Avatar("Erik", 6, 14);
        System.out.println(av1.compareTo(av2));
    }

    public static String testInstance1(Object o){
        if(o instanceof Advanturer){
            Advanturer a = (Advanturer) o;
            a.takeAChance();
            return "Method completed successfully!";
        }
        else return "Not of the correct type!";
    }
}