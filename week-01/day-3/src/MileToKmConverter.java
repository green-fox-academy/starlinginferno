import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.print("Please enter km you wish to convert to miles: ");

        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();

        System.out.println(km * 0.621371);


    }
}
