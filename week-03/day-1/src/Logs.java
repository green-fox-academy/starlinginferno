import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

        try {
            Path filePath = Paths.get("./logs.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(unique(lines));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static List<String> unique (List<String> inputArray) {

        List<String> IPArray = new ArrayList<>();
        List<String> filteredArray = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            String IPs = inputArray.get(i);
            IPs = IPs.substring(27,38);
            IPArray.add(IPs);  //filtered out the ip addresses
            if (!filteredArray.contains(IPs)) {
                filteredArray.add(IPs);
            }
        }

        return filteredArray;

    }


}
