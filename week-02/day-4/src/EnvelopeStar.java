import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){

        rajzolj(graphics);


    }

    public static void rajzolj (Graphics graphics) {

        graphics.setColor(Color.GREEN);

        int j= 0;
        int k = 160;

        for (int i = 160; i <= 320; i += 10) {      //top right

            graphics.drawLine(160, j, i, 160);
            j= j+ 10;
        }
        for (int i = 320; i >= 160; i -= 10) {      // bottom left

            graphics.drawLine(k, 160, 160, i);
            k= k - 10;
        }
        k= 160;
        for (int i = 0; i <= 160; i += 10) {        //top left

            graphics.drawLine(160, i, k, 160);
            k-=10;
        }
        k= 160;
        for (int i = 320; i >= 160; i -= 10) {      //bottom right

            graphics.drawLine(i, 160, 160, k);
            k = k + 10;
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