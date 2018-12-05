package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fib;

    @BeforeEach
    void setUp() {
        fib = new Fibonacci();
    }

    @Test
    void FibonacciIterative() {
        assertEquals(8, fib.FibonacciIterative(6));
    }
}