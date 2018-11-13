import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics){

        rajzolj(graphics);


    }

    public static void rajzolj (Graphics graphics) {

        int parting = 4;   //how many times i want it drawn on one side - has to be even (or one)
        int Wmove = WIDTH / parting;  // how much it moves horizontally
        int Hmove = HEIGHT / parting;  // how much it moves vertically

        for (int i = 0; i <= WIDTH; i += 20) {
            for (int j = 0; j < parting; j++) {
                for (int k = 0; k < parting; k++) {
                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine(i / parting + j * Wmove, k * Hmove, WIDTH / parting + j * Wmove, i / parting + k * Hmove);
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(j * Wmove, i / parting + k * Hmove, i / parting + j * Wmove, WIDTH / parting + k * Hmove);
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