// Define the Flyable interface with the fly_obj() method
interface Flyable {
    void fly_obj();
}

// Class Spacecraft implements the Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The spacecraft is launching into space.");
    }
}

// Class Airplane implements the Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The airplane is flying in the sky.");
    }
}

// Class Helicopter implements the Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The helicopter is hovering in the air.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        // Instantiate objects of the classes
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        // Call the fly_obj() method for each object
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
