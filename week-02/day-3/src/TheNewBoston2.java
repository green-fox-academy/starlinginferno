import javax.swing.*;
import java.awt.*;

public class TheNewBoston2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TheNewBoston3 p = new TheNewBoston3();
        f.add(p);
        f.setSize(500,270);
        f.setVisible(true);
    }
}
