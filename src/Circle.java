public class Circle extends Figure {

    Circle() {
        name = "Circle";
    }

    Circle(Coordinates coordinates) {
        this.coordinates = coordinates;
        name = "Circle";
    }

    @Override
    public String draw() {
        return "I'm " + name;
    }
}
