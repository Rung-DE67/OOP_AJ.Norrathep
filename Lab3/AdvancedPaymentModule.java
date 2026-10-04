public class AdvancedPaymentModule extends PaymentModule {
    public AdvancedPaymentModule() {
        super();
    }

    public void payment(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            payment(employees[i]);
        }
    }
}
