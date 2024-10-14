package app;

/**
 * Interface {@code Figure} describes behavior of other figures that implements this interface.
 * @author Kusovskyi Kyrylo
 */
public interface Figure {

    /**
     * @return description of this figure
     */
    String getDescription();

    /**
     * Draws described figure
     * @param x the x coordinate
     * @param y the y coordinate
     */
    void draw(int x, int y);
}
