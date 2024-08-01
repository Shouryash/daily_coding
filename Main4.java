class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Demonstrate method overriding
        genericAnimal.makeSound(); // Output: "The animal makes a sound."
        dog.makeSound(); // Output: "The dog barks."
        cat.makeSound(); // Output: "The cat meows."
    }
}
