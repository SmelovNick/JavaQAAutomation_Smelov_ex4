package exerciseOne;

public class Horse extends Animal{

    boolean isCargoHorse;

    public Horse(String food, String location, boolean isCargoHorse) {
        super(food, location);
        this.isCargoHorse = isCargoHorse;
    }

    @Override
    void makeNoise() {
        System.out.println("И-го-го!");
    }

    @Override
    void eat() {
        System.out.println("Лошадка жуёт сено");
    }

    @Override
    void sleep() {
        System.out.println("Лошадь стоит и спит");
    }
}
