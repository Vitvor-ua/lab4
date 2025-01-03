import lab4.*;

public class Main {
    public static void main(String[] args) {
        PointPrimitive point = new Point();
        LineComposite pointAdapter = new PointAdapter(point);

        Line line = new Line();
        line.setX(2);
        line.setY(3);
        line.setSecondPoint(4, 6);

        pointAdapter.setX(1);
        pointAdapter.setY(2);
        pointAdapter.draw();

        line.draw();
    }
}