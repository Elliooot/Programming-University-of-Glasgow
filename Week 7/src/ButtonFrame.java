import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;
    public ButtonFrame() {
        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("Initial Text", 15);
        label1 = new JLabel("Click a button");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.gray);

        panel.add(button1);
        panel.add(button2);
        panel.add(textField1);
        panel.add(label1);
        this.add(panel);

        this.setTitle("JFrame with some components");
        this.setSize(350, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        ButtonFrame gui = new ButtonFrame();
        gui.setVisible(true);
    }
}

