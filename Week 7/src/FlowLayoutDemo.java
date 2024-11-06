import java.awt.FlowLayout; //in future examples will assume appropriate layout imported
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;

    public FlowLayoutDemo() {
        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("Initial Text", 10);
        label1 = new JLabel("Click a button");

        this.setTitle("FlowLayoutDemo");
        this.setSize(400, 100);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(textField1);
    }
    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
    }
}
