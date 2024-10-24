import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("The number is %05d", 42);
        Student[] students = new Student[4];
        students[0] = new Student("Amy", 57);
        students[1] = new Student("Bill", 99);
        students[2] = new Student("Fred", 12);
        students[3] = new Student("Clare", 34);
        System.out.println("Unsorted");

        for(Student i : students){
            System.out.println(i);
        }
        Arrays.sort(students);
        System.out.println("\nSorted");
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }

    public static void sort(Student[] s){
        boolean flag;
        do{
            flag = false;
            for(int i = 0; i < s.length - 1; i++){
                if(s[i].getGrade() > s[i + 1].getGrade()){
                    flag = true;
                    Student temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }
            }
        }while(flag);
    }
}