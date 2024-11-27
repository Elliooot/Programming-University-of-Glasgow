import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintTextGUI extends JFrame implements ActionListener {
    //instance variables are all the components
    private JPanel top, middle, bottom;
    private JTextField text;
    private JLabel label;
    private JButton printButton, clearButton;

    // The constructor adds all the components to the frame
    public PrintTextGUI(){
        // normal JFrame stuff
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocation(500, 300);
        this.setTitle("PrintText");
        // set layout:
        layoutComponents();
    }

    private void layoutComponents(){
        // top panel is white and contains a button
        top = new JPanel();
        top.setBackground(Color.white);
        // create buttons with listeners and add to the top panel
        printButton = new JButton("Print text");
        printButton.addActionListener(this);
        top.add(printButton);

        clearButton = new JButton("Clear text");
        clearButton.addActionListener(this);
        top.add(clearButton);
        // middle panel is green, contains label + text field
        middle = new JPanel();
        middle.setBackground(Color.green);
        // add a label and a text field to the middle panel
        JLabel enterlabel = new JLabel("Enter text here: ");
        middle.add(enterlabel);
        text = new JTextField(10);
        middle.add(text);
        // add empty label to bottom panel
        bottom = new JPanel();
        bottom.setBackground(Color.green);
        label = new JLabel("");
        bottom.add(label);
        // then add panels to content pane
        add(top, BorderLayout.NORTH);
        add(middle, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
    }
    // handle button events
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == printButton) printText();
        else if(e.getSource() == clearButton) clearText();
    }
    // helper method - action if print button pressed
    private void printText(){
        String s = text.getText();
        label.setText("You entered: \"" + s + "\"");
        text.setText("");
    }
    // helper method - action if clear button pressed
    private void clearText(){
        label.setText("");
        text.setText("");
    }
}
