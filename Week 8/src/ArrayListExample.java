import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Person> myList = new ArrayList<Person>();
        Person person1 = new Person("Agnes", 30);
        Person person2 = new Person("Aretha", 29);
        Person person3 = new Person("Adam", 42);
        Person person4 = new Person("Arnold", 60);
        Person person5 = new Person("Alexander", 30);

        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        myList.add(person4);
        myList.add(person5);

        int n = myList.size();
        System.out.println("This list has size " + n);
        for(int i = 0; i < n; i++) {
            System.out.println(myList.get(i));
        }
    }
}
