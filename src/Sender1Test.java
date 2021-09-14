import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Sender1Test {

    @Test
    public void test() {

        Sender1 sender1 = new Sender1();
        sender1.send("What's up?");
    }
}