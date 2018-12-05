import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MatReview2 {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        graphics.setColor(Color.YELLOW);
        graphics.drawLine(80, 160, 240, 160);
        graphics.setColor(new Color (0, 0, 0, 60));
        graphics.drawRect(100, 100, 200, 200);

        graphics.fillRect(400,500,100,100);
        graphics.setColor(Color.ORANGE);
        int xpoints[] = {25,145,25,145,25};
        int ypoints[] = {25,25,145,145,25};
        int npoints = 5;
        graphics.drawPolygon(xpoints,ypoints,npoints);

        for (int i = 0; i < 60; i+=30) {
            graphics.fillRect(i, i, 20, 20);
        }

        int max = 30;
        int min = 0;
        int n = (int) Math.random() * (max-min + 1) + min;  // max -min
        // 0.99 * (10-0+1) + 0
        // 0.99 * 11 + 0
        //    10.89 + 0;
        // 10.9
        //10

        int n2 = (int) Math.random() * (101) + 10; // 10 -110

        // 0 * (max - min + 1) + min;
        // 0 * (10 -0 + 1) + 0;
        // 0 * 11 + 0
        //0 + 0
        // 0

    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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