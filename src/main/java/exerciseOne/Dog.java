package exerciseOne;

public class Dog extends Animal{
    boolean isHunting;
    boolean isGuideDog;

    public Dog (String food, String location, boolean isGuideDog, boolean isHunting){
        super(food, location);
        this.isGuideDog = isGuideDog;
        this.isHunting = isHunting;
    }

    @Override
    void makeNoise() {
        System.out.println("Гав-гав!");
    }

    @Override
    void eat() {
        System.out.println("Собака где-то нашла и съела кость");
    }

    @Override
    void sleep() {
        System.out.println("Эта собака спит");
    }
}
