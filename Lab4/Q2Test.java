import java.util.Scanner;

public class Q2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();

            UndergradStudent u = new UndergradStudent(age, gpa);
            GradStudent g = new GradStudent(age, gpa);

            System.out.println("Both student created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
