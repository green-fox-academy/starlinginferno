import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls are at the party?");
        int girls = scanner.nextInt();

        System.out.println("How many boys are at the party?");
        int boys = scanner.nextInt();

        if (girls == 0){
            System.out.println("Sausage party");}
        else if (girls != boys && (boys + girls >= 20)) {
            System.out.println("Quite cool party!");}
        else if (girls + boys < 20) {
            System.out.println("Average party...");}
        else if (girls == boys && (girls + boys >= 20)) {
            System.out.println("The party is excellent!");}


    }
}
