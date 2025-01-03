package lab4;

/**
 * Implementation of a simple point primitive.
 */
public class Point implements PointPrimitive {
    private int x;
    private int y;

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing point at (" + x + ", " + y + ") in pixels.");
    }
}