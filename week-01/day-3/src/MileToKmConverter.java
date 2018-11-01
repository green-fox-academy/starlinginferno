import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Please enter the amount of miles you would like to convert to kilometers: ");
        Scanner miles = new Scanner(System.in);
        double distanceInMiles = miles.nextDouble();

        System.out.println(distanceInMiles + " miles is " + (distanceInMiles * 1.60934) + " kilometers.");


    }
}
