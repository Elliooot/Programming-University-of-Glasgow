import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

    JTextField text1;
//    JTextField text2;
    JLabel result;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton buttonAdd;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;
    JButton buttonClear;

    Calculator (){

        //JFrame
        JFrame frame = new JFrame();
        frame.setTitle("My Math");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,400);



        //JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);


        //JLabel
//        JLabel label1 = new JLabel("num1");
//        label1.setBounds(60,80,60,20);

//        JLabel label2 = new JLabel("num2");
//        label2.setBounds(60,110,60,20);

        result = new JLabel("");
        result.setBounds(140,150,180,20);
        result.setFont(new Font("New Times Roman", Font.BOLD, 17));	//Increasing the Font size


        //JTextField
        text1 = new JTextField();
        text1.setBounds(140,80,60,20);
//        text2 = new JTextField();
//        text2.setBounds(140,110,60,20);

        //JButton

        b1 = new JButton("1");
        b1.setBounds(60, 200, 70, 20);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(60, 200, 70, 20);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(60, 200, 70, 20);
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(60, 200, 70, 20);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(60, 200, 70, 20);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(60, 200, 70, 20);
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(60, 200, 70, 20);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(60, 200, 70, 20);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(60, 200, 70, 20);
        b9.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(60, 200, 70, 20);
        b0.addActionListener(this);

        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(60, 140, 70, 20);
        buttonAdd.addActionListener(this);	//Adding Action Listener

        buttonMinus = new JButton("Minus");
        buttonMinus.setBounds(60, 170, 70, 20);
        buttonMinus.addActionListener(this);	//Adding Action Listener

        buttonMultiply = new JButton("Multiply");
        buttonMultiply.setBounds(60, 200, 70, 20);
        buttonMultiply.addActionListener(this);

        buttonDivide = new JButton("Divide");
        buttonDivide.setBounds(60, 200, 70, 20);
        buttonDivide.addActionListener(this);

        buttonClear = new JButton("Clear");
        buttonClear.setBounds(60, 200, 70, 20);
        buttonClear.addActionListener(this);	//Adding Action Listener

        //JPanel
//        panel.add(label1);
//        panel.add(label2);
        panel.add(text1);
//        panel.add(text2);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b0);
        panel.add(buttonAdd);
        panel.add(buttonMinus);
        panel.add(buttonMultiply);
        panel.add(buttonDivide);
        panel.add(buttonClear);
        panel.add(result);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int a = Integer.parseInt(text1.getText());
//            int b = Integer.parseInt(text2.getText());
//            int sum = a+b;
//            int deduct = a-b;

            if(e.getSource().equals(buttonAdd))
            {
//                result.setText(sum +"");

            }else if(e.getSource().equals(buttonMinus))
            {
//                result.setText(deduct +"");

            }else
            {
                result.setText("");
                text1.setText("");
//                text2.setText("");
            }
        }catch(NumberFormatException n) {
            //	System.out.println("The field should not be null");
            result.setText("Field shouldn't be null");
            if(e.getSource().equals(buttonClear))
            {
                result.setText("");
                text1.setText("");
//                text2.setText("");
            }

        }


    }

}
