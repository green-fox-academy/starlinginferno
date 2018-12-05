import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size = 1;
        int pos = 160;

        for (int i = 0; i < 320; i++) {
    //        int rgb = (int )(Math.random() * 255255255 + 0);
    //        graphics.setColor(new Color (rgb));
            if (i < 320) {
                graphics.setColor(new Color(231, 0, 0));
            }
            if (i < 267) {
                graphics.setColor(new Color(255, 140, 0));
            }
            if (i < 214) {
                graphics.setColor(new Color(255, 239, 0));
            }
            if (i < 161) {
                graphics.setColor(new Color(0, 129, 31));
            }
            if (i < 108) {
                graphics.setColor(new Color(0, 68, 255));
            }
            if (i < 55) {
                graphics.setColor(new Color(118, 0, 137));
            }

            graphics.drawRect(pos, pos, size, size);
            size ++;
            pos = 160 - (size / 2);
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