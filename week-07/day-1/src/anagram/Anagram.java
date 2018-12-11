package anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Anagram {
    public static void main(String[] args) {

    }

    public static String nagaram(String inputWord) {
        String anagram = inputWord;
        Random rand = new Random();
        int n = rand.nextInt(inputWord.length()-1);
        for (int i = 0; i < anagram.length(); i++) {
     //       anagram.charAt(i) = inputWord.charAt(n);
        }
        try {
            List<String> dictionaryLines = Files.readAllLines(Paths.get("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt"));
            if (dictionaryLines.contains(anagram)) {
                return anagram;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
