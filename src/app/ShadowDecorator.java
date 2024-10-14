package app;

/**
 * Class {@code ShadowDecorator} extends {@link FigureDecorator}.
 * Adds shadow for the figure.
 * @author Kusovskyi Kyrylo
 */
public class ShadowDecorator extends FigureDecorator{

    /**
     * Constructor of this class
     * @param decoratedFigure - figure to decorate
     */
    public ShadowDecorator(Figure decoratedFigure) {
        super(decoratedFigure);
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " with shadow";
    }

    /**
     * Draws described figure with shadow
     * @param x the x coordinate
     * @param y the y coordinate
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Draw shadow");
        super.draw(x, y);
    }
}
