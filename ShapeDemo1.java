// Define the Drawable interface with the draw method
interface Drawable {
    void draw();
}

// Circle class implements the Drawable interface
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Rectangle class implements the Drawable interface
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Triangle class implements the Drawable interface
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

// Main class to demonstrate drawing different shapes
public class ShapeDemo {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
