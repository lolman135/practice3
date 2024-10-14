package app;

/**
 * Class {@code BorderDecorator} extends {@link FigureDecorator}.
 * Adds border for the figure.
 * @author Kusovskyi Kyrylo
 */
public class BorderDecorator extends FigureDecorator{

    private int borderWidth;

    /**
     * Constructor of this class
     * @param decoratedFigure figure to decorate
     * @param borderWidth width of the border
     */
    public BorderDecorator(Figure decoratedFigure, int borderWidth) {
        super(decoratedFigure);
        this.borderWidth = borderWidth;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + borderWidth + "px. width border";
    }

    /**
     * Draws described figure with border
     * @param x the x coordinate
     * @param y the y coordinate
     */
    @Override
    public void draw(int x, int y) {
        System.out.printf("Draw border, width: %dpx.\n", borderWidth);
        super.draw(x, y);
    }
}
