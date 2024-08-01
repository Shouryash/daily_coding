// Define the BasicAnimal interface with eat() and sleep() methods
interface BasicAnimal {
    void eat();
    void sleep();
}

// Define the Monkey class with jump() and bite() methods
class Monkey {
    public void jump() {
        System.out.println("Monkey jumps.");
    }

    public void bite() {
        System.out.println("Monkey bites.");
    }
}

// Define the Human class that inherits from Monkey and implements BasicAnimal
class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human eats.");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        // Instantiate a Human object
        Human human = new Human();

        // Call the methods
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
    }
}
