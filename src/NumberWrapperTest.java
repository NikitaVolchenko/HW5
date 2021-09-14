import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberWrapperTest {

    @Test
    public void test() {

        NumberWrapper numberWrapper = new NumberWrapper();
        assertNull(numberWrapper.getNum());

        Number number = new Number(32);
        numberWrapper.setNum(number);
        assertEquals(32, numberWrapper.getNum().getNumber());
    }
}