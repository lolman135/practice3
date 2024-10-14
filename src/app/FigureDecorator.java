package app;

/**
 * Abstract class {@code FigureDecorator} decorating all
 * classes that implements {@link Figure} interface
 * @author Kusovskyi Kyrylo
 */
public abstract class FigureDecorator implements Figure {

    protected Figure decoratedFigure;

    /**
     * Constructor of this class
     * @param decoratedFigure figure to decorate
     */
    public FigureDecorator(Figure decoratedFigure) {
        this.decoratedFigure = decoratedFigure;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return decoratedFigure.getDescription();
    }

    /**
     * Draws described figure with decorations
     * @param x the x coordinate
     * @param y the y coordinate
     */
    @Override
    public void draw(int x, int y) {
        decoratedFigure.draw(x, y);
    }
}
