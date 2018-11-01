import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println((x + "*" + i + " = " + x * i));
        }


    }
}
