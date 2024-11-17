public class Person implements Greeter{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
    }
    public String toString(){
        return "I am " + name + " and I am " + age + " years old.";
    }
}
