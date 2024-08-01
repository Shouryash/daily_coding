public class Rectangle {
    private double length;
    private double width;

    // Constructor (optional)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create a rectangle with length 5 units and width 3 units
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());

        // Modify values using setters
        rectangle.setLength(7);
        rectangle.setWidth(4);

        System.out.println("\nUpdated values:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
