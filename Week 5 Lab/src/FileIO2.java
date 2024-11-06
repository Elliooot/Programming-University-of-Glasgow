import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            String filename = "C:/Users/user/Desktop/UofG/Programming/Week 5/Solution/sums.txt";
            fr = new FileReader(filename);

            Scanner sc = new Scanner(fr);
            while(sc.hasNext()){
                String line = sc.nextLine();
                Scanner t = new Scanner(line);
                int firstInt = t.nextInt();
                String operator = t.next();
                int secondInt = t.nextInt();
                int res = 0;

                if(operator.equals("+")){
                    res = firstInt + secondInt;
                }else if(operator.equals("-")){
                    res = firstInt - secondInt;
                }
                System.out.println(line + " = " + res);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            try{
                fr.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
