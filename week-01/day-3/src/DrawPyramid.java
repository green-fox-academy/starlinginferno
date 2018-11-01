import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x-i; j++) {
                System.out.print(" ");
                }
                for (int k=0;k<=i;k++){
                    System.out.print("*");

            }
            System.out.println();

        }


    }
}
