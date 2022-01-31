package rent;

public class Sonata extends Car {
    private final double distance;

    public Sonata(double distance) {
        this.distance = distance;
        this.name = "Sonata";
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return distance;
    }
}
