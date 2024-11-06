import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    JButton b1, b2, b3, b4, b5;

    public GridLayoutDemo() {
        this.setTitle("Grid of Buttons");
        this.setSize(500, 300);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 2)); // 2 columns, as many rows as we need

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Long-named Button 4");
        b5 = new JButton("Button 5");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }

    public static void main(String[] args) {
        GridLayoutDemo gld = new GridLayoutDemo();
        gld.setVisible(true);
    }
}
