import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int numFirst = scanner.nextInt();
        int a = 0;
        int sum = 0;

        while (a < numFirst) {
            System.out.println("Please enter a number:");
            int num = scanner.nextInt();
            a++;
            sum=sum + num;

        }

        int average = sum/numFirst;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
