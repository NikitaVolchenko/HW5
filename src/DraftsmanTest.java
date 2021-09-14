import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DraftsmanTest {

    @Test
    public void test() {

        Coordinates coordinates = new Coordinates(1, 2);
        Square square = new Square(coordinates);
        assertEquals(1, square.getCoordinates().getX());
        assertEquals(2, square.getCoordinates().getY());

        Coordinates coordinates1 = new Coordinates(3, 4);
        Circle circle = new Circle(coordinates1);
        assertEquals(3, circle.getCoordinates().getX());
        assertEquals(4, circle.getCoordinates().getY());

        Coordinates coordinates2 = new Coordinates(5, 6);
        Triangle triangle = new Triangle(coordinates2);
        assertEquals(5, triangle.getCoordinates().getX());
        assertEquals(6, triangle.getCoordinates().getY());

        Draftsman draftsman = new Draftsman();
        System.out.println(draftsman.draw(square, circle, triangle));

        Square square1 = new Square();
        assertNull(square1.getCoordinates());
        assertNull(square1.getCoordinates());
        System.out.println(draftsman.draw(circle, triangle, square1));

    }
}