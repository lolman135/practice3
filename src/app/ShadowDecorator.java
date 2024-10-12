package app;

public class ShadowDecorator extends FigureDecorator{

    public ShadowDecorator(Figure decoratedFigure) {
        super(decoratedFigure);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and with shadow";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw shadow");
        super.draw(x, y);
    }
}
