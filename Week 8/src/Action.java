import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame implements ActionListener {
    JTextField text;
    JButton press;
    public Action() {
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout());
        text = new JTextField("Not pressed yet");
        panel.add(text);
        press = new JButton("Press me");
        press.addActionListener(this);
        panel.add(press);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        text.setText("Pressed!");
    }

    public static void main(String[] args) {
        new Action();
    }
}
