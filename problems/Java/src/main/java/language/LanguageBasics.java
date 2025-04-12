package language;

public class LanguageBasics {
    public static void main(String[] args) {
        equals();
    }


    //EQUALS
    public static void equals() {
        Integer plotCount = 0;
        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a == b);        // false - different objects
        System.out.println(a.equals(b));   // true - same content

        //Primitives
        int x = 5;
        int y = 5;

        System.out.println(x == y);      // true Also .equals() doesn't work here because int is a primitive type.
    }

    // OVERLOADING
    public static void overloading() {
        greet();               // calls greet()
        greet("Java");         // calls greet(String name)
    }

    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // OVERRIDING
    public static void overriding() {
        AnimalLB a = new AnimalLB();
        AnimalLB d = new DogLB();

        a.sound();  // prints "Some generic animal sound"
        d.sound();  // prints "Bark!" (overridden method in Dog)
    }

}

// Superclass for overriding
class AnimalLB {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass for overriding
class DogLB extends AnimalLB {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}