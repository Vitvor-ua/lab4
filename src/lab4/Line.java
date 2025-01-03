package lab4;

/**
 * A simple line composed of points.
 */
public class Line implements LineComposite {
    private double x1, y1, x2, y2;

    @Override
    public void setX(double x) {
        this.x1 = x;
    }

    @Override
    public void setY(double y) {
        this.y1 = y;
    }

    /**
     * Sets the second point of the line.
     *
     * @param x the X coordinate in centimeters
     * @param y the Y coordinate in centimeters
     */
    public void setSecondPoint(double x, double y) {
        this.x2 = x;
        this.y2 = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") in centimeters.");
    }
}