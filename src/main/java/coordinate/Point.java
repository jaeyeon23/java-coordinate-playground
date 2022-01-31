package coordinate;

import java.util.Objects;

public class Point {
    private static final int VALID_POINT = 24;
    private final int xPoint;
    private final int yPoint;

    public Point(int xPoint, int yPoint) {
        validPoint(xPoint, yPoint);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    private void validPoint(int xPoint, int yPoint) {
        if (xPoint > VALID_POINT) {
            throw new IllegalArgumentException("x포인터는 24를 초과할 수 없습니다.");
        }
        if (yPoint > VALID_POINT) {
            throw new IllegalArgumentException("y포인터는 24를 초과할 수 없습니다.");
        }
    }

    public double lineCalc(Point point) {
        return Math.sqrt(powCalc(point));
    }

    private double powCalc(Point point) {
        return Math.pow(this.xPoint - point.getxPoint(), 2) + Math.pow(this.yPoint - point.getyPoint(), 2);
    }

    public int getxPoint() {
        return xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return xPoint == point.xPoint && yPoint == point.yPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPoint, yPoint);
    }
}
