package countletters;

import java.util.Collections;
import java.util.Map;

public class countLetters {

    public Map<Character, Integer> letterCounter(String str) {

        Map<Character, Integer>dictionary = Collections.<Character, Integer>emptyMap();
        for (int i = 0; i < str.length(); i++) {
            if (dictionary.containsKey(str.charAt(i))) {
                int counter = dictionary.get(i);
                dictionary.put(str.charAt(i), counter+1);

            }else {
                dictionary.put(str.charAt(i), 1);
            }
        }
        return dictionary;
    }
}
