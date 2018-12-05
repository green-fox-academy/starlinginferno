import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        division(number);
    }

    public static void division (int num) {

        int x = 10;

        try {
            int result = x / num;
            System.out.println(result);
        } catch (ArithmeticException exception) {
                exception.printStackTrace();
            System.out.println("can't divide by zero");
        }

    }
}
