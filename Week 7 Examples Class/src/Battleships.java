import javax.swing.*;
import java.awt.*;

public class Battleships extends JFrame{
    private FilledPanel filledPanel1, filledPanel2, filledPanel3;
    public Battleships(){
        int UNIT = 20;
        this.setLocation(20, 20);
        this.setTitle("Battleships");
        this.setSize(30 * UNIT, 30 * UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));

        this.add(new FilledPanel(6*UNIT, 3*UNIT, UNIT, 3*UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(2*UNIT, 4*UNIT,UNIT,5*UNIT, Color.gray,Color.darkGray));
        this.add(new FilledPanel(2*UNIT, 3*UNIT, 2*UNIT, UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(UNIT, UNIT, 8*UNIT, 8*UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(UNIT, UNIT, UNIT, UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(UNIT, 6*UNIT, 7*UNIT, 2*UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(4*UNIT, 2*UNIT, 4*UNIT, UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(7*UNIT, 7*UNIT, UNIT, UNIT, Color.gray, Color.darkGray));
        this.add(new FilledPanel(UNIT, 2*UNIT, 4*UNIT, 2*UNIT, Color.gray, Color.darkGray));
    }

    public static void main(String[] args){
        Battleships gui = new Battleships();
        gui.setVisible(true);
    }
}
