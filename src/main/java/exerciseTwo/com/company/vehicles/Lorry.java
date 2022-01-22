package exerciseTwo.com.company.vehicles;

import exerciseTwo.com.company.details.Engine;
import exerciseTwo.com.company.professions.Driver;

public class Lorry extends Car{
    private double carrying;

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public Lorry(String marka, String carClass, Engine engine, Driver driver, double loadCapacity) {
        super(marka, carClass, engine, driver);
        setCarrying(loadCapacity);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "marka='" + this.getMarka() + '\'' +
                ", carClass='" + this.getCarClass() + '\'' +
                ", engine=" + this.getEngine() +
                ", driver=" + this.getDriver() +
                "loadCapacity=" + carrying +
                '}';
    }
}
