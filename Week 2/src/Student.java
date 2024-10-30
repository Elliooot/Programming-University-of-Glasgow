public class Student extends Person{
    private double G;

    public Student(String s, int a, String g, double gpa){
        super(s, a, g);
        this.G = gpa;
    }
    @Override
    public String toString(){
        return "Student " + name + ", " + gender + ", age " + age + ", got GPA grade at " + G;
    }

    public Double getGPA(){ return G; }

    public void setGPA(Double g){
        G = g;
    }
}
