import java.util.Scanner;

public class DrawSquare{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number:");
            int symbol = scanner.nextInt();
     //       int space = symbol - 2;

            for (int i = 1; i <= symbol; i++){
                for (int j = 1; j <= symbol; j++){
                    if (i==1 || i == symbol || j==1 || j == symbol) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");}}
                System.out.println();
            }



        }
}
