import javax.swing.JFrame;

public class Ex7 extends JFrame {
    public Ex7() {
        setTitle("Border Layout for JFrame");
        setSize(400, 400);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderPanel myPanel = new BorderPanel();
        this.add(myPanel);
    }
    public static void main(String[] args) {
        Ex7 frame = new Ex7();
        frame.setVisible(true);
    }
}
