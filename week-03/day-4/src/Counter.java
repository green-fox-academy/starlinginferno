import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        counter(num);
    }

    public static int counter(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return n * counter(n-1);
        }
    }
}
