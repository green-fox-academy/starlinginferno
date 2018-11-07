import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number (1/2): ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter a number (1/2): ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);}
        else if (num1 < num2) {
            System.out.println(num2 + " is bigger than " + num1);}
        else {
            System.out.println(num1 + " is equal to " + num2);}

    }
}
