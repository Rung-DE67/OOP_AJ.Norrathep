public class TriangleTest {
    public static void main(String[] args) {
        Triangle eq = new EquilateralTriangle(5);
        Triangle rt = new RightTriangle(3, 4, 5);

        System.out.println("Equilateral Triangle: ");
        System.out.println("Longest side: " + eq.getLongestSideLength());
        System.out.println("Largest angle: " + eq.getLargestAngle());
        System.out.println("Perimeter: " + eq.getPerimeter());

        System.out.println("\nRight Triangle:");
        System.out.println("Longest side: " + rt.getLongestSideLength());
        System.out.println("Largest angle: " + rt.getLargestAngle());
        System.out.println("Perimeter: " + rt.getPerimeter());
    }
}
