import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FR_try_with_resources {
    public static void main(String[] args) {
        String fN = "C:/Users/user/Downloads/words.csv";

        try{
            FileReader fr = new FileReader(fN);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
