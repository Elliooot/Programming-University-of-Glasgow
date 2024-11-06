public class Person {
    private String name;
    private int age;

    public Person(String s, int a) {
        name = s;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "I am " + name + " and I am " + age + " years old";
    }
}