package sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private Sum sum;

    @BeforeEach
    void setUp() {
        sum = new Sum();
    }

    @Test
    void sumElements() {
        ArrayList<Integer> sumTest = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, sum.sumElements(sumTest));
    }

    @Test
    void sumElementsWithEmptyList() {
        ArrayList<Integer> sumTest = new ArrayList<>(Arrays.asList());
        assertEquals(0, sum.sumElements(sumTest));
    }

    @Test
    void sumElementsWithOneElementList() {
        ArrayList<Integer> sumTest = new ArrayList<>(Arrays.asList(3));
        assertEquals(3, sum.sumElements(sumTest));
    }

    @Test
    void sumElementsWithNull() {
        assertThrows(NullPointerException.class, () -> {
            sum.sumElements(null);
        });
    }
}