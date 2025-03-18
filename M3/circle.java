public class Circle {
    private double radius;

    // Constructor
    public Circle(double r) {
        radius = r;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
