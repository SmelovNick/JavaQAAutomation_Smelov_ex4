package exerciseTwo.com.company.vehicles;

import exerciseTwo.com.company.details.Engine;
import exerciseTwo.com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportCar(String marka, String carClass, Engine engine, Driver driver, int maxSpeed) {
        super(marka, carClass, engine, driver);
        setSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "marka='" + this.getMarka() + '\'' +
                ", carClass='" + this.getCarClass() + '\'' +
                ", engine=" + this.getEngine() +
                ", driver=" + this.getDriver() +
                "maxSpeed=" + speed +
                '}';
    }
}
