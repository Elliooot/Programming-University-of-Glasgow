import javax.swing.*;
import java.awt.*;

public class ButtonFrame2 extends JFrame {
    public ButtonFrame2() {
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("Quit");
        JTextField textField1 = new JTextField("Initial Text", 15);
        JLabel label1 = new JLabel("Click a button");

        JPanel mainPanel = new JPanel(new GridLayout(0,1));
        JPanel myPanel1 = new JPanel(new FlowLayout());

        myPanel1.add(button1);
        myPanel1.add(button2);
        mainPanel.add(myPanel1);

        JPanel myPanel2 = new JPanel(new FlowLayout());
        myPanel2.add(label1);
        myPanel2.add(textField1);
        mainPanel.add(myPanel2);

        this.add(mainPanel);

        setTitle("JFrame with some components");
        setSize(350, 150);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ButtonFrame2 frame = new ButtonFrame2();
        frame.setVisible(true);
    }
}
