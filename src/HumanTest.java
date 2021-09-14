import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    @Test
    public void test() {

        Human human = new Human("Ivan", 20);
        Human human1 = new Human("Nikolay", 25);

        assertFalse(human.compare(human1));

        human1.setName("Ivan");
        human1.setAge(20);
        assertTrue(human.compare(human1));

        Animal animal = new Animal();
        assertFalse(human.compare(animal));
    }

}