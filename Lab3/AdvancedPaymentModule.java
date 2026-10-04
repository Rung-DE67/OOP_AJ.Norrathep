public class AdvancedPaymentModule extends PaymentModule {
    public void payment(Employee[] employees) {
        for (Employee employee : employees) {
            payment(employee);
        }
    }
}
