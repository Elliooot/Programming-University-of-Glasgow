import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame {
    public Ex2() {
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftPanel = new JPanel();

        JLabel topLabel = new JLabel("NORTH");
        JLabel bottomLabel = new JLabel("SOUTH");
        JLabel centerLabel = new JLabel("CENTER");
        JLabel rightLabel = new JLabel("EAST");
        JLabel leftLabel = new JLabel("WEST");

        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        topPanel.add(topLabel);
        bottomPanel.add(bottomLabel);
        centerPanel.add(centerLabel);
        rightPanel.add(rightLabel);
        leftPanel.add(leftLabel);

        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Border layout for JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ex2 frame = new Ex2();
        frame.setVisible(true);
    }
}
