package apples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getApple() {
        Apples appleTest = new Apples();
        assertEquals("Apple", appleTest.getApple());
    }
}