import javax.swing.*;

public class JustShowFrame extends JFrame {
    public JustShowFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ensure system exits the application when user closes the JFrame
        setSize(300, 300);
        setLocation(300, 300);
        setTitle("Just a JFrame");
    }
    public static void main(String[] args) {
        JustShowFrame frame = new JustShowFrame();
        frame.setVisible(true);
    }
}
