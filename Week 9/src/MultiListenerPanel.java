import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MultiListenerPanel extends JPanel{
    JButton button1;
    JTextField textField1;

    public MultiListenerPanel(ActionListener parent){
        this.setBackground(Color.white);
        button1 = new JButton("Click to increase number");
        button1.addActionListener(parent);
        add(button1);

        textField1 = new JTextField(10);
        textField1.addActionListener(parent);
        textField1.setText("white");
        add(textField1);
    }

    public JButton getButton1() {
        return button1;
    }

    public JTextField getTextField1() {
        return textField1;
    }
}
