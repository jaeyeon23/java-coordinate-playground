package rent;

public class K5 extends Car {
    private final double distance;

    public K5(double distance) {
        this.distance = distance;
        this.name = "K5";
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return distance;
    }
}
