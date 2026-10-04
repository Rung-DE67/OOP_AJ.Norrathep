public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule();

        Employee[] employees = new Employee[4];
        employees[0] = new Fulltimer("Alice", 50000);
        employees[1] = new Hourly("Bob", 200, 80);
        employees[2] = new Manager("Charlie", 60000, 5);
        employees[3] = new Manager("Diana", 80000, 15);

        apm.payment(employees);
        System.out.println("Total pay after batch payment: " + apm.getTotalPay());

        // Test single payment still works
        apm.payment(new Fulltimer("Eve", 30000));
        System.out.println("Total pay after adding Eve: " + apm.getTotalPay());
    }
}
