public class TestGen {

    public static void main(String[] args) {

        Person person1 = new Person("Morag", 25);
        Person person2 = new Person("Wilf", 75);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        GenericClass<Person> myPeople = new GenericClass<Person>(person1, person2);
        System.out.println(myPeople);

        GenericClass<Dog> myDoggos = new GenericClass<Dog>(dog1, dog2);
        System.out.println(myDoggos);

        GenericClass<Circle> myCircles = new GenericClass<Circle>(circle1, circle2);
        System.out.println(myCircles);

        GenericClass<Greeter> myGreeters = new GenericClass<Greeter>(person1, dog1);
        System.out.println(myGreeters);

        GenericClass<Greeter> myOtherGreeters = new GenericClass<Greeter>(person2, dog2);
        System.out.println(myOtherGreeters);

    }
}