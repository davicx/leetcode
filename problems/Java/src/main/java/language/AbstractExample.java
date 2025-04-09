package language;


public class AbstractExample {
    public static void main(String[] args) {
        Pet myCat = new Cat();
        myCat.makeSound();  // Output: Meow
        myCat.sleep();      // Output: Animal is sleeping
    }
}

// Abstract class
abstract class Pet {
    // Abstract method (must be implemented by subclass)
    abstract void makeSound();

    // Concrete method (has implementation)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass
class Cat extends Pet {
    void makeSound() {
        System.out.println("Meow");
    }
}
