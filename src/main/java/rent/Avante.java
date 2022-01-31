package rent;

public class Avante extends Car {
    private final double distance;

    public Avante(double distance) {
        this.distance = distance;
        this.name = "Avante";
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return distance;
    }
}
