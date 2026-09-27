public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("Oak", "Boss", 100000);
        Employee staff = new Employee("Chakrakron", "Staff", 20000);

        EmployeeTeam team = new EmployeeTeam(boss, staff);

        System.out.println("===== Empoyee Details =====");
        team.printEmployeeDetails();
        System.out.println("===== All Employees Details =====");
        team.printAllEmployeeDetails();
        System.out.println("===== Update " + staff.getFirstName() + " Salary to 30000 =====");
        team.updateSalaryOfEmployee("Chakrakron", 30000);

        team.printAllEmployeeDetails();

        System.out.println("===== Give All Raise 10% =====");
        team.giveRaiseToAllEmployees();

        team.printAllEmployeeDetails();
    }
}