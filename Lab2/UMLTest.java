public class UMLTest {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.setFirstName("Alice");
        String motherName = m.getFirstName();
        System.out.println(motherName);

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println(f.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName());
    }
}
