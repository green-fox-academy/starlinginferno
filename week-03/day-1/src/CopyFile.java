import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

        String file1 = "./copy1.txt";
        String file2 = "./copy2.txt";

        copying(file1, file2);


    }

    public static boolean copying (String file1, String file2) {
        Path filePath = Paths.get(file1);
        Path filePath2 = Paths.get(file2);
        try {
            List<String> hello = Files.readAllLines(filePath);
            Files.write(filePath2, hello);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
