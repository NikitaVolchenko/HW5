public abstract class Figure {

    Coordinates coordinates;
    String name;

    Figure() {
    }

    Figure(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    Figure(Coordinates coordinates, String name) {

        this.coordinates = coordinates;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public abstract String draw();
}
