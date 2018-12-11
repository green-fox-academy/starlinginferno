import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    public void testFor1() {
        assertEquals(1, Main.fizzBuzz(1));
    }
}