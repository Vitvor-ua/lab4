package lab4;

/**
 * Interface for composite graphical objects like Line.
 */
public interface LineComposite {
    /**
     * Sets the X coordinate of a point in the line in centimeters.
     *
     * @param x the X coordinate in centimeters
     */
    void setX(double x);

    /**
     * Sets the Y coordinate of a point in the line in centimeters.
     *
     * @param y the Y coordinate in centimeters
     */
    void setY(double y);

    /**
     * Draws the line.
     */
    void draw();
}