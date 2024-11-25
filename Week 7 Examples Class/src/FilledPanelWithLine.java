import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FilledPanelWithLine extends JPanel {
    public FilledPanelWithLine(int nBorder, int wBorder, int sBorder, int eBorder, Color borderColor, Color fillColor) {
        setLayout(new BorderLayout());
        Border blackLine = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackLine);
        // need another panel for the inner border
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(borderColor);
        Border emptyBorder = BorderFactory.createEmptyBorder(nBorder, wBorder, sBorder, eBorder);
        mainPanel.setBorder(emptyBorder);

        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(fillColor);
        mainPanel.add(innerPanel);
        this.add(mainPanel);
    }
}
