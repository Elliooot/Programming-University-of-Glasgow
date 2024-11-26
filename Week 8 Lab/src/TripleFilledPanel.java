import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TripleFilledPanel extends JPanel {
    public TripleFilledPanel(int nBorder1, int wBorder1, int sBorder1, int eBorder1, int nBorder2, int wBorder2, int sBorder2, int eBorder2, Color backColor, Color midColor, Color frontColor){
        this.setLayout(new BorderLayout());
        this.setBackground(backColor);
        Border emptyBorder1 = BorderFactory.createEmptyBorder(nBorder1, wBorder1, sBorder1, eBorder1);
        Border emptyBorder2 = BorderFactory.createEmptyBorder(nBorder2, wBorder2, sBorder2, eBorder2);
        this.setBorder(emptyBorder1);

        JPanel midPanel = new JPanel(new BorderLayout());
        midPanel.setBackground(midColor);
        midPanel.setBorder(emptyBorder2);

        JPanel frontPanel = new JPanel();
        frontPanel.setBackground(frontColor);

        midPanel.add(frontPanel);
        this.add(midPanel);
    }
}
