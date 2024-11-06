import javax.swing.*;

public class CallingComponentExample extends JFrame {
    private SimpleComponent myComponent;

    public CallingComponentExample() {
        this.setTitle("JFrame calling a component");
        this.setSize(400, 200);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myComponent = new SimpleComponent();

        this.add(myComponent);
    }

    public static void main(String[] args) {
        CallingComponentExample frame = new CallingComponentExample();
        frame.setVisible(true);
    }
}
