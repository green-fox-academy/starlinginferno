import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int star = scanner.nextInt();
        int space = star -1;
        int odd = 1;

        for (int i=1; i <=star; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= odd; j++){
                System.out.print("*");

            }
            space--;
            odd = odd + 2;
            System.out.println(" ");
        }

    }
}
