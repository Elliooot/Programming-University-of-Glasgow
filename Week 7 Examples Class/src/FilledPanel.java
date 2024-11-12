import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FilledPanel extends JPanel {
    public FilledPanel(int nBorder, int wBorder, int sBorder, int eBorder, Color borderColor, Color fillColor) {
        this.setLayout(new BorderLayout());
        this.setBackground(borderColor);
        Border emptyBorder = BorderFactory.createEmptyBorder(nBorder, wBorder, sBorder, eBorder);
        this.setBorder(emptyBorder);
        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(fillColor);
        this.add(innerPanel);

        this.setSize(wBorder, eBorder);
        this.setLocation(300, 300);
    }

    public static void main(String[] args) {
        FilledPanel frame = new FilledPanel(10, 10, 10, 10, Color.BLACK, Color.BLACK);
        frame.setVisible(true);
    }
}
