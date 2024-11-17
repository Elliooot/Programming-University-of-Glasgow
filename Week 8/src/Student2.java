public class Student2 implements Comparable<Student2>{
    private int grade;
    private String name;
    public Student2(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }
    public int getGrade() { return grade; }

    public int compareTo(Student2 o) {
        if(this.getGrade() > o.getGrade()){
            return 1;
        }else if (this.getGrade() < o.getGrade()){
            return -1;
        }else{
            return 0;
        }
    }
}
