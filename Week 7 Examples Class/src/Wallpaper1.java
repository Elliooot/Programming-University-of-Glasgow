import javax.swing.*;
import java.awt.*;

public class Wallpaper1 extends JFrame {
    public Wallpaper1() {
        final int UNIT = 20;
        this.setLocation(20, 20);
        this.setTitle("Wallpaper1");
        this.setSize(30 * UNIT, 30 * UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,2));

        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.red, Color.white));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.white, Color.green));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.green, Color.blue));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.blue, Color.yellow));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.yellow, Color.cyan));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.cyan, Color.red));
    }

    public static void main(String[] args) {
        Wallpaper1 gui = new Wallpaper1();
        gui.setVisible(true);
    }
}
