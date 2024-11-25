import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame1 extends JFrame implements ActionListener {
    private JButton b = new JButton("Click Me");
    public ButtonFrame1() {
        //JFrame title, close and size
        this.setTitle("Button with listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);

        b.addActionListener(this);
        this.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        b.setText("I was clicked.");
    }
    // Main method -- creates the ButtonFrame1 object

    public static void main(String[] args) {
        ButtonFrame1 gui = new ButtonFrame1();
        gui.setVisible(true);
    }
}
