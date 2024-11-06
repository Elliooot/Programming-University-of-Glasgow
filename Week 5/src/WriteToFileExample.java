import javax.swing.*;
import java.io.*;

public class WriteToFileExample {

    public static void main(String[] args) {
        // 創建一個 JFileChooser 對象
        JFileChooser fileChooser = new JFileChooser();

        // 顯示保存對話框，讓使用者選擇保存位置
        int userSelection = fileChooser.showSaveDialog(null);

        // 檢查使用者是否選擇了保存位置
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // 獲取使用者選擇的檔案
            File outName = fileChooser.getSelectedFile();

            String content = JOptionPane.showInputDialog(null, "Please enter content: ");

            if(content != null) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(outName))) {
                    bw.write(content);
                    System.out.println("Data has been written to the file: " + outName.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file.");
                    e.printStackTrace();
                }
            }
            // 使用 BufferedWriter 將資料寫入檔案
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outName))) {
//                bw.write("This is a sample text written to the file.");
//                bw.newLine();
//                bw.write("This is another line of text.");
//
//                System.out.println("Data has been written to the file: " + outName.getAbsolutePath());
//            } catch (IOException e) {
//                System.out.println("An error occurred while writing to the file.");
//                e.printStackTrace();
//            }
        } else {
            System.out.println("Save command cancelled by user.");
        }
    }
}
