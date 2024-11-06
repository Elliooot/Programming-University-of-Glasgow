import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            String filename = "C:/Users/user/Desktop/UofG/Programming/Week 5/Solution/dolphin.txt";
            fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
