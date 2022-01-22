package exerciseTwo.com.company.vehicles;

import exerciseTwo.com.company.details.Engine;
import exerciseTwo.com.company.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private Engine engine;
    private Driver driver;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String marka, String carClass, Engine engine, Driver driver) {
        this.marka = marka;
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
