import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists1 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<String>();
        try{
            String fN = "C:/Users/user/Desktop/Car.txt";
            FileReader fr = new FileReader(fN);
            Scanner s = new Scanner(fr);

            while(s.hasNextLine()){
                String line = s.nextLine();
                arrList.add(line);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        for(int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }
}
