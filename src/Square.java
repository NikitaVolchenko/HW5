public class Square extends Figure {

    Square() {
        name = "Square";
    }

    Square(Coordinates coordinates) {
        this.coordinates = coordinates;
        name = "Square";
    }

    @Override
    public String draw() {
        return "I'm " + name;
    }
}
