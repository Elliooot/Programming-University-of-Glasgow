import javax.swing.*;
import java.awt.*;

public class CallingFilledPanel extends JFrame {
    private FilledPanel filledPanel;
    private FilledPanelWithLine filledPanelWithLine;
    public CallingFilledPanel() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calling Filled Panel");
        this.setSize(400, 400);
//        this.setLocation(300, 300);

        filledPanel = new FilledPanel(120,200,120,100, Color.gray, Color.blue);
        filledPanelWithLine = new FilledPanelWithLine(120,200,120,100, Color.gray, Color.blue);
        this.add(filledPanel);
//        this.add(filledPanelWithLine);
    }
    public static void main(String[] args) {
        CallingFilledPanel frame = new CallingFilledPanel();
        frame.setVisible(true);
    }
}
