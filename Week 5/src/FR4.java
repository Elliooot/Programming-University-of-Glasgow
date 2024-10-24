import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FR4 {
    public static void main(String[] args) throws FileNotFoundException, IOException, IOException{
        String fN = "C:/Users/user/Downloads/words.csv";
        FileReader fr = new FileReader(fN);
        fr.close();
    }
}
