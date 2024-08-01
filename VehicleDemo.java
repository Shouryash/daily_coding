class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor with all fields as parameters
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method to simulate driving
    public void drive() {
        System.out.println(make + " " + model + " Vehicle is driving.");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Override constructor
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Override constructor
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Instantiate Car class
        Car car = new Car("Toyota", "Corolla", 2020, 180);
        // Print Car attributes
        System.out.println("Car Make: " + car.make);
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Year: " + car.year);
        System.out.println("Car Maximum Speed: " + car.maximumSpeed);
        // Call drive method
        car.drive();

        System.out.println(); // Add a blank line between outputs

        // Instantiate Bike class
        Bike bike = new Bike("Yamaha", "YZF", 2019, 150);
        // Print Bike attributes
        System.out.println("Bike Make: " + bike.make);
        System.out.println("Bike Model: " + bike.model);
        System.out.println("Bike Year: " + bike.year);
        System.out.println("Bike Maximum Speed: " + bike.maximumSpeed);
        // Call drive method
        bike.drive();
    }
}
