import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics){

        rajzolj(graphics);


    }

    public static void rajzolj (Graphics graphics) {


        for (int i = 0; i <= 160; i += 10) {        //top left
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(i, 0, 160, i);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, i, i, 160);
        }
        for (int i = 160; i <= 320; i += 10) {      //bottom right
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(i, 160, 320, i);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(160, i, i, 320);
        }
        int j= 0;
        for (int i = 160; i <= 320; i += 10) {          // top right
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(i, 0, 320, j);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(160, j, i, 160);
            j= j+ 10;
        }
        int k = 160;
        for (int i = 320; i >= 160; i -= 10) {          // bottom left
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(k, 160, 160, i);

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, i, k, 320);
            k= k - 10;
        }
    }
  //      int a=0;
 //       forloop1(a);

  //      }


 /*       for (int i = 160; i <= 320; i += 20) {
            for (int j = 0; j <= 160; j += 20) {
                graphics.setColor(Color.MAGENTA);
                graphics.drawLine(i, 0, 320, j);

                graphics.setColor(Color.GREEN);
                graphics.drawLine(160, j, i, 160);
            }
        } */

 /*   public static int forloop1 (int x) {
        for (int i = 160; i <= 320; i += 20) {
            x= i;

        }
        return x;

        }


    public static int forloop2 (int y) {
        for (int j = 0; j <= 160; j += 20) {
            y = j;
        }
        return y;
    } */



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