import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    private JLabel label1;
    private JButton button1, button2;
    private JTextField textField1;

    public JPanelDemo() {
        this.setLayout(new BorderLayout(5, 5));

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.white);

        label1 = new JLabel("Click the Button");
        button1 = new JButton("Click");
//        textField1 = new JTextField(10);

        northPanel.add(label1);
        northPanel.add(button1);
        this.add(northPanel, BorderLayout.NORTH);

        this.setTitle("JPanelDemo");
        this.setSize(500, 500);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
        frame.setVisible(true);
    }
}
