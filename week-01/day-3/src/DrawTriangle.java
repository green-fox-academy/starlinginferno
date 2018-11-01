import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x; j++) {
                if (j <= i) {

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
