package lab4;

/**
 * Interface for basic graphical primitives like Point.
 */
public interface PointPrimitive {
    /**
     * Sets the X coordinate of the point in pixels.
     *
     * @param x the X coordinate in pixels
     */
    void setX(int x);

    /**
     * Sets the Y coordinate of the point in pixels.
     *
     * @param y the Y coordinate in pixels
     */
    void setY(int y);

    /**
     * Draws the point.
     */
    void draw();
}