package exerciseTwo.com.company.professions;

public abstract class Person {
    private int age;
    private String fullName;

    public Person(int age, String fullName) {
        setAge(age);
        setFullName(fullName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
