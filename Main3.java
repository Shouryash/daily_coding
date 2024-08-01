package com.shouryash;

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea() for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class (subclass of Shape)
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle with radius 5 units
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();
        System.out.println("Area of the circle: " + circleArea);

        // Create a Rectangle with length 4 units and width 6 units
        Rectangle rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
