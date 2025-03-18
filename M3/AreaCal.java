public interface Shape {
    double getArea();
}

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculator {
    public double sumAreas(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 3);  // width=5, height=3
        shapes[1] = new Circle(4);       // radius=4

        // Create an AreaCalculator instance
        AreaCalculator calculator = new AreaCalculator();

        // Calculate the sum of the areas
        double totalArea = calculator.sumAreas(shapes);

        // Print the total area
        System.out.println("The total area is: " + totalArea);
    }
}
