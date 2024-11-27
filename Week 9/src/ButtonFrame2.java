import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame2 extends JFrame implements ActionListener {
    int num = 0;
    private JButton b = new JButton("Click Me");
    public ButtonFrame2() {
        //JFrame title, close and size
        this.setTitle("Button with listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLocation(500, 300);

        b.addActionListener(this);
        this.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        num++;
//        b.setText("I was clicked " + num + " times.");
        b.setText(String.format("I was clicked %d times", num));
    }
    // Main method -- creates the ButtonFrame1 object

    public static void main(String[] args) {
        ButtonFrame2 gui = new ButtonFrame2();
        gui.setVisible(true);
    }
}
