package language;



public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Output: Bark
        myDog.eat();   // Output: This animal is eating
    }
}

interface Animal {
    void sound(); // abstract method

    // Default method
    default void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    // You can optionally override the default method
    // @Override
    // public void eat() {
    //     System.out.println("Dog is eating kibble");
    // }
}
