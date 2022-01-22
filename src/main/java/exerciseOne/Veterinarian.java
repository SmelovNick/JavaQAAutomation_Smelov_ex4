package exerciseOne;

public class Veterinarian {
    public static void treatAnimal(Animal animal){
        System.out.println("Это животное ест " + animal.getFood() + " и дом его - " + animal.getLocation());
    }
}
