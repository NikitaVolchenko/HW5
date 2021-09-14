import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void test() {

        Calculator calculator = new Calculator();
        assertEquals(256, calculator.calc(255, 1, new Add()));
        assertEquals(64, calculator.calc(128, 64, new Sub()));
        assertEquals(1024, calculator.calc(64, 16, new Mult()));
        assertEquals(-20, calculator.calc(100, -5, new Div()));

    }
}