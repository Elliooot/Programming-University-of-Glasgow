import javax.swing.*;
import java.awt.*;

public class WallPaper extends JFrame {
    private TripleFilledPanel tripleFilledPanel;
    public WallPaper(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TripleFilledPanel");
        this.setSize(400, 400);

        tripleFilledPanel = new TripleFilledPanel(100, 150, 100, 50, 50, 80, 50, 30, Color.red, Color.blue, Color.CYAN);
        this.add(tripleFilledPanel);
    }

    public static void main(String[] args){
        WallPaper gui = new WallPaper();
        gui.setVisible(true);
    }
}
