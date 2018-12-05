import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        String fileName = "./duplicated-chars.txt";
        System.out.println(decrypt(fileName));

    }

    public static String decrypt (String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(filePath);
            String text = String.join("\n", lines);
            return  text;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}