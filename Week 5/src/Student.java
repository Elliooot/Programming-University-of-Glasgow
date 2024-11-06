public class Student{
    private String name;
    private int grade;
    public Student(String s, int g){
        this.name = s;
        this.grade = g;
    }
    @Override
    public String toString(){
        return "Student " + name + "'s grade is " + grade + ".";
    }
}
