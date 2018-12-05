package anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram nagaram;

    @BeforeEach
    void setUp() {
        nagaram = new Anagram();
    }

    @Test
    void anagramChecker() {
        String s1 = "software";
        String s2 = "swear oft";
        assertTrue(nagaram.anagramChecker(s1, s2));
    }
}