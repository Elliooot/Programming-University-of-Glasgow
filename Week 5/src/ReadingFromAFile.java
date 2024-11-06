//import javax.xml.crypto.Data;
import java.io.*;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Student[] students = new Student[10];
        int studentsNo = 0;
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("C:/Users/user/Desktop/UofG/Programming/Week 5/students.csv");

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            Scanner sc = new Scanner(br);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tokens = line.split(",");
                int grade = Integer.parseInt(tokens[1]);
                students[studentsNo++] = new Student(tokens[0], grade);
            }
        }
        catch (FileNotFoundException f){
            System.out.println("File was not found");
            f.printStackTrace();
        }
        finally {
            try{
                if(fstream != null){
                    fstream.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        for(int i = 0; i < studentsNo; i++){
            System.out.println(students[i]);
        }
    }
}
