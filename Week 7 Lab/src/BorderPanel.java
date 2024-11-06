import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderPanel extends JPanel {
    public BorderPanel() {
        setLayout(new BorderLayout());
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
        JLabel rightLabel = new JLabel("<html> &nbsp E &nbsp <br> &nbsp A "
                + "&nbsp <br> &nbsp S &nbsp <br> &nbsp T &nbsp   </html>");
        JLabel leftLabel = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E "
                + " &nbsp <br> &nbsp S &nbsp <br> &nbsp T &nbsp   </html>");
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
}
