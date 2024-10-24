public class Person {
    protected String name; protected int age; protected String gender;

    public Person(String s, int a, String g){
        name = s;
        age = a;
        gender = g;
    }

    public String getGender(){ return gender; }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setGender(String g){ gender = g; }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }

    public void sayHello(){
        System.out.println("Hi, I'm " + name + ", I'm a " + gender + ", and I'm " + age + " years old.");
    }
}
