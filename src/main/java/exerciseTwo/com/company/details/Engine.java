package exerciseTwo.com.company.details;

public class Engine {
    private String company;
    private int power;

    public Engine(String company, int power) {
        setCompany(company);
        setPower(power);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "company='" + this.getCompany() + '\'' +
                ", power=" + this.getPower() +
                '}';
    }
}
