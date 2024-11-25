import javax.swing.*;
import java.awt.*;

public class Wallpaper2 extends JFrame {
    public Wallpaper2() {
        final int UNIT = 20;
        this.setLocation(20, 20);
        this.setTitle("Wallpaper2");
        this.setSize(30 * UNIT, 30 * UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,2));

        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.red, Color.white));
        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.white, Color.green));
        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.green, Color.blue));
        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.blue, Color.yellow));
        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.yellow, Color.cyan));
        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.cyan, Color.red));
    }

    public static void main(String[] args) {
        Wallpaper2 gui = new Wallpaper2();
        gui.setVisible(true);
    }
}
