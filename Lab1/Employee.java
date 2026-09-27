public class Employee {
    private String first_name;
    private String last_name;
    private double salary;

    public Employee(String first_name, String last_name, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public Employee(String first_name, String last_name) {
        this(first_name, last_name, 0.0);
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getYearlySalary() {
        return salary * 12;
    }

    public void addRaise() {
        double raiseTotal;
        raiseTotal = salary * 0.10;
        salary = salary + raiseTotal;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rungaroon", "Sangaunrit", 60000);
        Employee emp2 = new Employee("Asmin", "Doraka", 100000);

        System.out.println("Yearly Salary of: " + emp1.getFirstName() + " " + emp1.getLastName() + " is "
                + emp1.getYearlySalary());
        System.out.println("Yearly Salary of: " + emp2.getFirstName() + " " + emp2.getLastName() + " is "
                + emp2.getYearlySalary());
        emp1.addRaise();
        emp2.addRaise();
        System.out.println(
                emp1.getFirstName() + " " + emp1.getLastName() + " After raise 10% = " + emp1.getYearlySalary());
        System.out.println(
                emp2.getFirstName() + " " + emp2.getLastName() + " After raise 10% = " + emp2.getYearlySalary());
    }
}
