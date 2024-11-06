import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex3 extends JFrame {
    private JLabel topLabel;
    private JLabel bottomLabel;
    private JLabel rightLabel;
    private JLabel leftLabel;
    private JLabel centerLabel;

    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel centerPanel;

    public Ex3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ensure system exits the application when user closes the JFrame
        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Border Layout for JFrame");

        topPanel = new JPanel();
        bottomPanel = new JPanel();
        rightPanel = new JPanel();
        leftPanel = new JPanel();
        centerPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());

        topLabel = new JLabel("NORTH");
        bottomLabel = new JLabel("SOUTH");
        rightLabel = new JLabel("EAST");
        leftLabel = new JLabel("WEST");
        centerLabel = new JLabel("CENTER");

        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        topPanel.add(topLabel);
        bottomPanel.add(bottomLabel);
        rightPanel.add(rightLabel);
        leftPanel.add(leftLabel);
        centerPanel.add(centerLabel);
    }
    public static void main(String[] args) {
        Ex3 frame = new Ex3();
        frame.setVisible(true);
    }
}
