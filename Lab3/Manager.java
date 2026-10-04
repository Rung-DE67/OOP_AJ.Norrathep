public class Manager extends Fulltimer {
    private int workYear;

    public Manager(String name, double salary, int workYears) {
        super(name, salary);
        workYear = workYears;
    }

    public int getWorkYear() {
        return workYear;
    }

    @Override
    public double computePay() {
        return super.computePay() * workYear;
    }
}
