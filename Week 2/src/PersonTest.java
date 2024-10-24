public class PersonTest {
    public static void main(String[] args){
        Person personOne = new Person("Bill", 56, "Male");

        personOne.sayHello();

        Person personTwo = new Person("Fred", 19, "Female");
        personTwo.sayHello();
        System.out.println(personOne.getName());
    }
}
