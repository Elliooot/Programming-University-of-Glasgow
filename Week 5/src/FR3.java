import java.io.FileReader;
import java.io.IOException;
public class FR3 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            String fN = "C:/Users/user/Downloads/words.csv";
            fr = new FileReader(fN);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
