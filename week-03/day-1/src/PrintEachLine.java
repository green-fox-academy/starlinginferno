import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        Path filePath = Paths.get("./my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(String.join("\n", lines));
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
