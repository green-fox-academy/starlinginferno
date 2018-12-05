package countletters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class countLettersTest {

    countLetters object;

    @BeforeEach
    void setUp() {
        object = new countLetters();
    }

    @Test
    void letterCounter() {

        Map<Character, Integer> dict = new HashMap<>();
        dict.put('a', 1);
        dict.put('p', 2);
        dict.put('l', 1);
        dict.put('e', 1);
        assertEquals(dict, object.letterCounter("apple"));
    }
}