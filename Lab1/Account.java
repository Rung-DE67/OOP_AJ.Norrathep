public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }
}