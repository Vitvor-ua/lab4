package lab4;

/**
 * Adapter to allow a Point to be used as part of a LineComposite.
 */
public class PointAdapter implements LineComposite {
    private final PointPrimitive point;

    /**
     * Constructor for the PointAdapter.
     *
     * @param point the PointPrimitive to adapt
     */
    public PointAdapter(PointPrimitive point) {
        this.point = point;
    }

    @Override
    public void setX(double x) {
        // Convert centimeters to pixels (assuming 1 cm = 37.795 pixels).
        int xInPixels = (int) Math.round(x * 37.795);
        point.setX(xInPixels);
    }

    @Override
    public void setY(double y) {
        // Convert centimeters to pixels (assuming 1 cm = 37.795 pixels).
        int yInPixels = (int) Math.round(y * 37.795);
        point.setY(yInPixels);
    }

    @Override
    public void draw() {
        point.draw();
    }
}