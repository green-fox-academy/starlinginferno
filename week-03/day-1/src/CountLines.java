import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        String name = "./my-file.txt";
        System.out.println(linecounting (name));
    }

    public static int linecounting (String lines) {
        Path filePath = Paths.get(lines);
        try {
            List<String> allLines = Files.readAllLines(filePath);
            int numberOfLines = allLines.size();
            return numberOfLines;
        } catch (IOException e) {
            return 0;
        }
    }
}
