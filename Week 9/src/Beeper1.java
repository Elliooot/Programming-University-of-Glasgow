import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Toolkit; // This is where the beeper comes from

public class Beeper1 extends JFrame implements ActionListener {
    JButton button1, button2;
    int clickCount = 10;

    public Beeper1() {
        //JFrame title, close and size
        this.setTitle("Button with listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        button1 = new JButton("Please stay");
        this.add(button1, BorderLayout.WEST);
        button1.addActionListener(this);

        button2 = new JButton("Please go");
        this.add(button2, BorderLayout.EAST);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            //user has pressed the left button, increment counter
            clickCount++;
            //Button1 is pressed but outcome affects button2
            button2.setText(Integer.toString(clickCount));
        }else if(e.getSource() == button2){
            clickCount--;
            Toolkit.getDefaultToolkit().beep();

            if(clickCount > 0){
                button2.setText(Integer.toString(clickCount));
            }else{
                System.exit(0); // End program
            }
        }
    }

    public static void main(String[] args) {
        Beeper1 gui = new Beeper1();
        gui.setVisible(true);
    }
}
