public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        System.out.println(
                "Name: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
    }

    public void printAllEmployeeDetails() {
        System.out.println("Name: " + boss.getFirstName() + " " + boss.getLastName() + " " + boss.getSalary());
        this.printEmployeeDetails();
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary > 0) {
            if (boss.getFirstName().equals(firstname)) {
                boss.setSalary(newSalary);
            }
            if (employee.getFirstName().equals(firstname)) {
                employee.setSalary(newSalary);
            }
        }

    }

    public void giveRaiseToAllEmployees() {
        boss.addRaise();
        employee.addRaise();
    }

}
