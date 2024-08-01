class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to calculate fuel efficiency
    public double calculateFuelEfficiency() {
        // Implementation depends on the type of vehicle and its properties
        return 0;
    }

    // Method to calculate distance traveled
    public double calculateDistanceTraveled(double fuel) {
        // Implementation depends on the type of vehicle and its fuel efficiency
        return 0;
    }

    // Method to get maximum speed
    public double getMaximumSpeed() {
        // Implementation depends on the type of vehicle
        return 0;
    }
}

class Truck extends Vehicle {
    // Truck-specific properties and methods
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Implement truck-specific methods
}

class Car extends Vehicle {
    // Car-specific properties and methods
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Implement car-specific methods
}

class Motorcycle extends Vehicle {
    // Motorcycle-specific properties and methods
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Implement motorcycle-specific methods
}

public class Main1 {
    public static void main(String[] args) {
        // Create instances of each vehicle type and demonstrate functionality
        Truck truck = new Truck("Volvo", "FH16", 2021, "Diesel");
        Car car = new Car("Toyota", "Corolla", 2020, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, "Petrol");

        // Example usage of methods
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Car Distance Traveled: " + car.calculateDistanceTraveled(10));
        System.out.println("Motorcycle Maximum Speed: " + motorcycle.getMaximumSpeed());
    }
}
