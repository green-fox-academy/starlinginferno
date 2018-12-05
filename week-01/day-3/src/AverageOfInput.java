import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number (1/5): ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter a number (2/5): ");
        int number2 = scanner.nextInt();


        System.out.print("Please enter a number (3/5): ");
        int number3 = scanner.nextInt();


        System.out.print("Please enter a number (4/5): ");
        int number4 = scanner.nextInt();


        System.out.print("Please enter a number (5/5): ");
        int number5 = scanner.nextInt();

        int sum = number1 + number2 + number3 + number4 + number5;
        double average = (double) sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + average);



    }
}
