package app;

/**
 * Class {@code ConcreteFigure} is concrete realization of interface {@link Figure}
 * @author Kusovskyi Kyrylo
 */
public class ConcreteFigure implements Figure{

    private String shape;
    private String color;

    /**
     * Constructor of this class
     * @param shape shape of the figure
     * @param color color of the figure
     */
    public ConcreteFigure(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    /**
     * @return description of this figure
     */
    @Override
    public String getDescription() {
        return firstLetterToUpperCase(color) + " " + shape;
    }

    /**
     * Draws described figure
     * @param x the x coordinate
     * @param y the y coordinate
     */
    @Override
    public void draw(int x, int y) {
        System.out.printf("Draw %s %s at position (%d;%d)\n", color, shape, x, y);
    }

    /**
     * @param string word or sentence to up first letter
     * @return input string with first letter at upper case
     */
    private String firstLetterToUpperCase(String string){
        return string.substring(0 ,1).toUpperCase() + string.substring(1);
    }
}
