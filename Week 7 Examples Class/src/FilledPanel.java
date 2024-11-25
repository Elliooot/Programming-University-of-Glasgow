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
    }
}
