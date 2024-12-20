import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FR {
    public static void main(String[] args) {
        FileReader fr = null; // Make the reference here so it is invisible in finally
        BufferedReader br = null;
        try{
            String fN = "C:/Users/user/Downloads/words.csv";
            fr = new FileReader(fN);
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            try{
                if(br != null) br.close();
                if(fr != null) fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

