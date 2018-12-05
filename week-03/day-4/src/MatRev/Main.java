package MatRev;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 //       List<String> strings = new ArrayList<>();   garbage collector
//        strings = new ArrayList<>();
//        thisIsRecursive();
        factorialWithRecursion(3);
        Path path = Paths.get("src");
        Files.isDirectory(path);
    }
    private static void thisIsRecursive() {
        System.out.println("RECURSION!");  // infinite loop
        thisIsRecursive();
    }

    public static int factorialWithRecursion(int n) {
        System.out.println("n's value is " + n);
        if (n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }
}
