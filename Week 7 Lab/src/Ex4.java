import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex4 extends JFrame {
    public Ex4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ensure system exits the application when user closes the JFrame
        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Border Layout for JFrame");

        Border blackline = BorderFactory.createLineBorder(Color.black);

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());
        leftPanel.setBorder(blackline);
        rightPanel.setBorder(blackline);
        centerPanel.setBorder(blackline);
        topPanel.setBorder(blackline);
        bottomPanel.setBorder(blackline);

        JLabel topLabel = new JLabel("NORTH");
        JLabel bottomLabel = new JLabel("SOUTH");
        JLabel rightLabel = new JLabel("EAST");
        JLabel leftLabel = new JLabel("WEST");
        JLabel centerLabel = new JLabel("CENTER");

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
        Ex4 frame = new Ex4();
        frame.setVisible(true);
    }
}
