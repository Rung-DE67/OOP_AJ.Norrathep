public class Father extends Parent {
    private Mother wife;

    public Father(Mother wife) {
        super(1);
        this.wife = wife;
    }

    public Mother getWife() {
        return wife;
    }

    @Override
    public String getFirstName() {
        return "Mr." + super.getFirstName();
    }
}
