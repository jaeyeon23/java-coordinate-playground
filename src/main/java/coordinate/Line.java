package coordinate;

import java.util.List;

public class Line {
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public double calc() {
        return points.get(0).lineCalc(points.get(1));
    }
}
