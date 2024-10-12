package app;

public class Main {

    public static void main(String[] args) {

        Figure figure = new ConcreteFigure("circle", "red");

        Figure borderedFigure = new BorderDecorator(figure, 2);

        Figure borderedFigureWithShadow = new ShadowDecorator(borderedFigure);

        System.out.println(borderedFigureWithShadow.getDescription());
        borderedFigureWithShadow.draw(10, 5);
    }
}
