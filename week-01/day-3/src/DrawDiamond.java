import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an odd number:");
        int star = scanner.nextInt();
        int space = star - 1;
        int odd1 = 1;
        int odd2 = star -2;

        if (star % 2 == 0) {
            System.out.println("Please enter an odd number.");
        }
        else {
            for (int i=1; i <=(star+1)/2; i++) {
                for (int k = 1; k < space; k++) {
                    System.out.print(" ");

                }
                for (int j = 1; j <= odd1; j++){
                    System.out.print("*");

                }
                space= space-1;
                odd1 = odd1 + 2;
                System.out.println(" ");
            }
            for (int i=1; i <=(star+1)/2; i++) {
                for (int k = 0; k <= space; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= odd2; j++){
                    System.out.print("*");

                }
                space= space+1;
                odd2 = odd2 - 2;
                System.out.println(" ");
            }
        }

    }}
