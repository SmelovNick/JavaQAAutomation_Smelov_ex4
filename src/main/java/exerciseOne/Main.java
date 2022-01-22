package exerciseOne;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("рыбка", "дом", true),
                new Dog("сухой корм", "задний двор", false, true),
                new Horse("зерно", "конюшня", false)
        };
        for(Animal animal : animals){
            Veterinarian.treatAnimal(animal);
        }
    }
}
