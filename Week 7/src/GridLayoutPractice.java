import javax.swing.*;
import java.awt.*;

public class GridLayoutPractice extends JFrame {
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
//    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;

    public GridLayoutPractice() {
        this.setTitle("Grid Layout Practice");
        this.setSize(500, 400);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 3));

        b1 = new JButton("This is cell 1, 1");
        b2 = new JButton("This is cell 1, 2");
        b3 = new JButton("This is cell 1, 3");
        b4 = new JButton("This is cell 2, 1");
        b5 = new JButton("This is cell 2, 2");
        b6 = new JButton("This is cell 2, 3");
        b7 = new JButton("This is cell 3, 1");
        b8 = new JButton("This is cell 3, 2");
        b9 = new JButton("This is cell 3, 3");
        b10 = new JButton("This is cell 4, 1");
        b11 = new JButton("This is cell 4, 2");
        b12 = new JButton("This is cell 4, 3");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
    }

    public static void main(String[] args) {
        GridLayoutPractice glp = new GridLayoutPractice();
        glp.setVisible(true);
    }
}
