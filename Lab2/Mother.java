public class Mother extends Parent {
    private Father husband;

    public Mother() {
        super(0);
    }

    @Override
    public String getFirstName() {
        String name = super.getFirstName();
        return "Ms." + name;
    }
}
