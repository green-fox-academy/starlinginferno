// import java.util.Arrays;
public class PrintAll {
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`
public static void main(String[] args) {

    int[] numbers = {4, 5, 6, 7};
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }

//    System.out.println(Arrays.toString(numbers));
}
}
