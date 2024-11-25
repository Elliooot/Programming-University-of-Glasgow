import javax.swing.*;
import java.awt.*;

public class Wallpaper3 extends JFrame {
    public Wallpaper3() {
        final int UNIT = 20;
        this.setLocation(20, 20);
        this.setTitle("Wallpaper3");
        this.setSize(30 * UNIT, 30 * UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new GridLayout(3,2));
        JPanel container = new JPanel(new GridLayout(3, 2, UNIT / 2, UNIT / 2));

//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.red, Color.white));
//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.white, Color.green));
//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.green, Color.blue));
//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.blue, Color.yellow));
//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.yellow, Color.cyan));
//        this.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.cyan, Color.red));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.red, Color.white));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.white, Color.green));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.green, Color.blue));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.blue, Color.yellow));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.yellow, Color.cyan));
        container.add(new FilledPanelWithLine(UNIT, UNIT, UNIT, UNIT, Color.cyan, Color.red));

        this.add(container);
    }

    public static void main(String[] args) {
        Wallpaper3 gui = new Wallpaper3();
        gui.setVisible(true);
    }
}
