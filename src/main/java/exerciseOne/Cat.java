package exerciseOne;

public class Cat extends Animal{
    boolean isCatchesMice;

    public Cat (String food, String location, boolean isCatchesMice){
        super(food, location);
        this.isCatchesMice = isCatchesMice;
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу-мяу");
    }

    @Override
    void eat() {
        System.out.println("Кошка съела вискас");
    }

    @Override
    void sleep() {
        System.out.println("Кесулькен уснул");
    }
}
