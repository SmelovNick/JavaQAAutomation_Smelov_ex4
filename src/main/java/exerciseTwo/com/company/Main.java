package exerciseTwo.com.company;

import exerciseTwo.com.company.details.Engine;
import exerciseTwo.com.company.professions.Driver;
import exerciseTwo.com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "universal",
                new Engine("VAZ", 115),
                new Driver(35, "Достоевский Федор Михайлович", 10));

        System.out.println(car);
    }
}
