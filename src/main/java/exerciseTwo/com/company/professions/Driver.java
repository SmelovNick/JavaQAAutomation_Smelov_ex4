package exerciseTwo.com.company.professions;

public class Driver extends Person{
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        setExperience(experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + this.getAge() +
                ", fullName='" + this.getFullName() + '\'' +
                "experience=" + experience +
                '}';
    }
}
