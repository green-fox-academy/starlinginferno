import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x=0;
        int y=0;
        rajzolj(x,y,graphics);

    }

    public static void rajzolj (int x, int y, Graphics graphics) {
        int center = 160;
        for (int i = x; i <= 320; i += 20) {
            for (int j = y; j <= 320; j += 20) {
                if (i >=0 && j ==0) {
                    graphics.drawLine(i,0,center, center);
                }
                if (i == 320 && j >= 0) {
                    graphics.drawLine(320, j, center, center);
                }
                if (i >= 0 && j == 320) {
                    graphics.drawLine(i, 320, center, center);
                }
                if (i == 0 && j >= 0) {
                    graphics.drawLine (0, j, center, center);
                }
            }
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