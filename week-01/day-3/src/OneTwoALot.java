import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

        int x;

        System.out.println("Please enter a number above zero: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x <= 0)
        System.out.println("Not enough");
        if (x == 1)
            System.out.println("One");
        if (x == 2)
            System.out.println("Two");
        if (x > 2)
            System.out.println("A lot");




    }
}
