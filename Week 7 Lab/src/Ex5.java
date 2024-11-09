import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex5 extends JFrame {
    public Ex5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ensure system exits the application when user closes the JFrame
        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Border Layout for JFrame");

        Border blackLine = BorderFactory.createLineBorder(Color.black);
        Font f = new Font("Serif", Font.PLAIN, 24);

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        rightPanel.setLayout(new BorderLayout());
        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());

        leftPanel.setBorder(blackLine);
        rightPanel.setBorder(blackLine);
        centerPanel.setBorder(blackLine);
        topPanel.setBorder(blackLine);
        bottomPanel.setBorder(blackLine);

        JLabel topLabel = new JLabel("NORTH");
        JLabel bottomLabel = new JLabel("SOUTH");
        JLabel rightLabel = new JLabel("EAST");
        JLabel leftLabel = new JLabel("WEST");
        JLabel centerLabel = new JLabel("CENTER");

        topLabel.setFont(f);
        bottomLabel.setFont(f);
        rightLabel.setFont(f);
        leftLabel.setFont(f);
        centerLabel.setFont(f);

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
        Ex5 frame = new Ex5();
        frame.setVisible(true);
    }
}