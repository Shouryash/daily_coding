// Abstract class Shape with an abstract method calculateArea
abstract class Shape {
    abstract double calculateArea();
}

// Circle class inherits from Shape
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inherits from Shape
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea method for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate area calculation
public class AreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(10, 20); // Rectangle with length 10 and width 20

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
