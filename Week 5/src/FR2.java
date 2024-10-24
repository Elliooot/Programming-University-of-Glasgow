import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FR2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            String fN = "C:/Users/user/Downloads/words.csv";
            fr = new FileReader(fN);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally{
            try{
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
