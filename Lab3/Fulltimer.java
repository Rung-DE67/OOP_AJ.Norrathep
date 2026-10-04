public class Fulltimer extends Employee {
    private double salary;

    public Fulltimer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double computePay() {
        return salary;
    }
}
