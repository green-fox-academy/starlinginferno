import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles2 {

    public static void mainDraw(Graphics graphics) {

        int size = 20; //side of one triangle
        int moveX = size/2;
        int moveY= (int) Math.sqrt(size*size-moveX*moveX);

        for (int i =0; i <= HEIGHT; i ++) {
            for (int j = 0; j <= size; j ++) {
                graphics.drawLine(WIDTH/2 - moveX, moveY, WIDTH/2, 0);
                graphics.drawLine(WIDTH/2, 0, WIDTH/2 + moveX, moveY);
                graphics.drawLine(WIDTH/2 + moveX, moveY, WIDTH/2 - moveX, moveY);
            }
     //       size += moveX;
        }

    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
