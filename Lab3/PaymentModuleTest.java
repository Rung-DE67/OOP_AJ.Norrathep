public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule();

        Fulltimer f = new Fulltimer("Alice", 50000);
        Hourly h = new Hourly("Bob", 200, 80);
        Manager m1 = new Manager("Charlie", 60000, 5);
        Manager m2 = new Manager("Diana", 80000, 15);

        pm.payment(f);
        System.out.println("After paying Alice (Fulltimer, salary=50000): " + pm.getTotalPay());

        pm.payment(h);
        System.out.println("After paying Bob (Hourly, rate=200, hours=80): " + pm.getTotalPay());

        pm.payment(m1);
        System.out.println("After paying Charlie (Manager, salary=60000, workYear=5): " + pm.getTotalPay());

        pm.payment(m2);
        System.out.println("After paying Diana (Manager, salary=80000, workYear=15, doubled): " + pm.getTotalPay());
    }
}
