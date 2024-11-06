import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame {
    private JLabel northLabel;
    private JLabel southLabel;
    private JLabel eastLabel;
    private JLabel westLabel;
    private JLabel centerLabel;

    public Ex1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ensure system exits the application when user closes the JFrame
        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Border Layout for JFrame");

        northLabel = new JLabel("North");
        southLabel = new JLabel("South");
        eastLabel = new JLabel("East");
        westLabel = new JLabel("West");
        centerLabel = new JLabel("Center");


        this.setLayout(new BorderLayout());
        this.add(northLabel);
        this.add(southLabel);
        this.add(eastLabel);
        this.add(westLabel);
        this.add(centerLabel);
    }
    public static void main(String[] args) {
        Ex1 frame = new Ex1();
        frame.setVisible(true);
    }
}
