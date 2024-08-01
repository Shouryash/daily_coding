// Base class Shape
abstract class Shape {
    // Abstract method to calculate the area of the shape
    public abstract double getArea();
}

// Subclass Circle
class Circle extends Shape {
    private int radius;

    // Constructor for Circle that takes the radius as an input parameter
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override the getArea() method for Circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Subclass Square
class Square extends Shape {
    private int length;

    // Constructor for Square that takes the length as an input parameter
    public Square(int length) {
        this.length = length;
    }

    // Override the getArea() method for Square
    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor for Rectangle that takes width and height as input parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override the getArea() method for Rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Instantiate Circle, Square, and Rectangle
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 7);

        // Call getArea() method and print the area for each shape
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
