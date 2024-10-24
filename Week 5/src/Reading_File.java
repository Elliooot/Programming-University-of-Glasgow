import java.io.*;
import java.util.Scanner;

public class Reading_File {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = null;

        try{
            fstream = new FileInputStream("C:/Users/user/Downloads/words.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            Scanner s = new Scanner(br);
            while(s.hasNextLine()) {
                String line = s.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
