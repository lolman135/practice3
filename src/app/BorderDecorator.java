package app;

public class BorderDecorator extends FigureDecorator{

    private int borderWidth;

    public BorderDecorator(Figure decoratedFigure, int borderWidth) {
        super(decoratedFigure);
        this.borderWidth = borderWidth;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + borderWidth + "px. width border";
    }

    @Override
    public void draw(int x, int y) {
        System.out.printf("Draw border, width: %dpx.\n", borderWidth);
        super.draw(x, y);
    }
}
