public class Draftsman {

    public String draw(Figure figure, Figure figure1, Figure figure2) {
        return figure.draw() + " " + figure1.draw() + " " + figure2.draw();
    }
}
