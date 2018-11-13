import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MatRev {
    public static void main(String[] args) {
        Path filePath = Paths.get("./hello.txt");

        String input = "Hello2";




    //    Files.write(filePath, inputList);

        try {
            List<String> lines = Files.readAllLines(filePath);
            List <String> inputList = new ArrayList<>(Arrays.asList(lines + "Hello2","Hello3"));
            Files.write(filePath, inputList);
      //      System.out.println(lines);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("file cannot be found");
        } finally {
            System.out.println("this block finally happened");
        }

        Scanner scanner = new Scanner(System.in);
        scanner.close();  //you can close the scanner in the finally part



    }
}
