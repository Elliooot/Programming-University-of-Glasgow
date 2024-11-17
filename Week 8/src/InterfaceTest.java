public class InterfaceTest {
    public static void main(String[] args) {
        Person p = new Person("Sam", 45);
        Greeter a = new Person("Mary", 34);
        Greeter b = new Dog();

        a.sayHello();
        b.sayHello();

        Greeter[] aa = new Greeter[3];
        aa[0] = new Dog();
        aa[1] = new Dog();
        aa[2] = new Person("Billy", 28);

        for(int i = 0; i < 3; i++){
            aa[i].sayHello();
        }
    }
}
