package rent;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> listCar = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        listCar.add(car);
    }

    public String generateReport() {
        String str = "";
        for (Car car : listCar) {
            str += car.getName() + " : " + (int) car.getChargeQuantity() + "리터" + NEWLINE;
        }
        return str;
    }
}
