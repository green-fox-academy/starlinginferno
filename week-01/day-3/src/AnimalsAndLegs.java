import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens have you got?");
        int chickens = scanner.nextInt();

        System.out.println("How many pigs have you got?");
        int pigs = scanner.nextInt();

        System.out.println("Altogether your animals have got " + ((chickens * 2) + (pigs * 4)) + " legs.");
    }
}
