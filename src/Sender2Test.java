import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Sender2Test {

    @Test
    public void test() {

        Sender2 sender2 = new Sender2();
        sender2.send("Bye!");
    }
}