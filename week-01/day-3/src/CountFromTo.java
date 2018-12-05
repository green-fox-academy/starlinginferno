import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number (1/2): ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter a number (2/2): ");
        int num2 = scanner.nextInt();

        int i;

        if (num1 >= num2) {
            System.out.println("The second number should be bigger.");
        }
        else {
            for (i= num1; i <= num2; i++) {
                System.out.println(i);
            }
        }

    }
}
