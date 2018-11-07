public class TwoNumbers {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 13;

        int sum = num1 + num2;  //addition
        int sub = num1 - num2;  //subtraction
        int mult = num1 * num2; //multiplication
        double div = (double) num1 / num2;  //division
        int div2 = num1 / num2;  // division as integer
        int rem = num1 % num2;  //remainder

        System.out.println("22 + 13 = " + sum);
        System.out.println("22 - 13 = " + sub);
        System.out.println("22 * 13 = " + mult);
        System.out.println("22 / 13 = " + div + " (decimal)");
        System.out.println("22 / 13 = " + div2 + " (integer)");
        System.out.println("22 % 13 = " + rem);
    }


}
