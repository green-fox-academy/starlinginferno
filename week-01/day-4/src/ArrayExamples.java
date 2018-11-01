public class ArrayExamples {
    public static void main(String[] args) {
        int john = 2;
        int jane = 3;
        int[] numbers = new int[10];
        System.out.println(numbers.toString());
        System.out.println(numbers);
        System.out.println(numbers[0]);
        numbers[9] = 10;
        System.out.println(numbers.length);
        int[] copyOfNumbers = numbers;
        numbers[numbers.length - 1] = 101;
        System.out.println("=========");
        System.out.println(numbers[9]);
        System.out.println(copyOfNumbers[9]);
        System.out.println("=========");
        int[][] matrix;
     //   matrixAsWell[0][1];
        final boolean[] booleans = new boolean[2];
        booleans[0] = true;
    }
}
