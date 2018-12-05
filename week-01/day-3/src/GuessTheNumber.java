import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int num = 12;

        do {
            System.out.println("Guess the number:");
            guess = scanner.nextInt();
            if (guess < num) {
                System.out.println("The stored number is higher");
            } else if (guess > num) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + num);
            }
        } while (guess != num);

    }
}
