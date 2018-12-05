import java.util.Scanner;

public class DrawReversePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int star = scanner.nextInt();
        int space = star -1;
        int odd = star * 2 -1;

        for (int i=1; i <=star; i++) {
            for (int k = 2; k <= space; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= odd; j++){
                System.out.print("*");

            }
            space++;
            odd = odd - 2;
            System.out.println(" ");
        }

    }
}
