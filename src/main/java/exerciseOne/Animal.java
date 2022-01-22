package exerciseOne;

public abstract class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location){
        this.setFood(food);
        this.setLocation(location);
    }

    abstract void makeNoise();

    abstract void eat();

    abstract void sleep();
}
