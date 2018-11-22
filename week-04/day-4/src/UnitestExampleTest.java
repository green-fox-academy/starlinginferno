import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitestExampleTest {

    private UnitestExample unitestExample = new UnitestExample();

    @BeforeEach
    void setUp() {
        System.out.println("This is when the BeforeEach runs.");
    }

    @Test
    void addingNumbersTest() {
        int input1 = 2;
        int input2 = 2;
        int expectedResult = 4;
        assertEquals(expectedResult, unitestExample.addingNumbers(input1, input2));
    }
}