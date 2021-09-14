public class Triangle extends Figure {

    Triangle() {
        name = "Triangle";
    }

    Triangle(Coordinates coordinates) {
        this.coordinates = coordinates;
        name = "Triangle";
    }

    @Override
    public String draw() {
        return "I'm " + name;
    }
}
