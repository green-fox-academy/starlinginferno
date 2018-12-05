import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

     //   System.out.println(ticTacResult("win-x.txt"))
        // Should print "X"

     //   System.out.println(ticTacResult("draw.txt"))
        // Should print "Draw"

    }

        public static char[][] ticTacResult (String fileName){
            Path filePath = Paths.get(fileName);
            char[][] characters= new char[3][3];
     //       List<String> XOArray = new ArrayList<>();
            try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                    characters[i][j] = lines.get(i).charAt(j);
                    return characters;
                }
            }

            }catch (IOException e) {
                e.printStackTrace();
            }
            return null;

        }

}