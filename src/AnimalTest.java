import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void test() {

        Animal animal = new Animal("Cat", 2);
        Animal animal1 = new Animal("Dog", 5);

        assertFalse(animal.compare(animal1));

        animal1.setName("Cat");
        animal1.setAge(2);
        assertTrue(animal.compare(animal1));

        Human human = new Human();
        assertFalse(animal.compare(human));
    }

}