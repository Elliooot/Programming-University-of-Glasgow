import javax.swing.*;

public class SimpleComponent extends JPanel {
    private JTextArea textArea;
    private JButton button1;

    public SimpleComponent() {
        textArea = new JTextArea(10, 20);
        textArea.setText("Some text can go in here!");
        this.add(textArea);
        button1 = new JButton("Click Me");
        this.add(button1);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }
}
