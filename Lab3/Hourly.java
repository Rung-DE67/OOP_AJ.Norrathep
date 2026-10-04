public class Hourly extends Employee {
    private double rate;
    private int hour;

    public Hourly(String name, double hourlyRate, int hours) {
        this.name = name;
        hour = hours;
        rate = hourlyRate;
    }

    @Override
    public double computePay() {
        return hour * rate;
    }
}
