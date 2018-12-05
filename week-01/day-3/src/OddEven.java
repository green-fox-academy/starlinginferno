import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        int x;

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
