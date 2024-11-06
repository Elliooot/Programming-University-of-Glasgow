import javax.swing.*;
import java.awt.*;

public class SetBounds extends JFrame {
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;

    public SetBounds() {
        button1 = new JButton("Add");
        button1.setBounds(60, 170, 70, 20);
        button2 = new JButton("Subtract");
        button2.setBounds(60, 120, 70, 20);

        label1 = new JLabel("num1");
        label1.setBounds(60, 80, 60, 20);
        JLabel label2 = new JLabel("num2");
        label2.setBounds(60, 110, 60, 20);

        textField1 = new JTextField(10);
        textField1.setBounds(60, 80, 60, 20);
        textField2 = new JTextField(10);
        textField2.setBounds(140, 110, 60, 20);

        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(label2);
        this.add(textField1);
        this.add(textField2);

        this.setLayout(new FlowLayout());
        this.setTitle("Set Bounds Demo");
        this.setLocation(300, 300);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SetBounds setBounds = new SetBounds();
        setBounds.setVisible(true);
    }
}
