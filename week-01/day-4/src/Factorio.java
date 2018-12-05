public class Factorio {
    public static void main(String[] args) {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        int num = 6;

        System.out.println((Factorio(num)));

    }

    public static int Factorio(int number) {
        int factorial = 2;
        for (int i = 3; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
