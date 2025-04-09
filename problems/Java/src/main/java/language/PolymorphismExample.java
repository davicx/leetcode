package language;

public class PolymorphismExample {
    public static void main(String[] args) {
        FarmAnimal myHorse = new Horse();
        FarmAnimal myCow = new Cow();

        myHorse.makeSound(); // Output: Neigh!
        myCow.makeSound();   // Output: Moo!

        // Array of FarmAnimals
        FarmAnimal[] animals = { new Horse(), new Cow() };
        for (FarmAnimal animal : animals) {
            animal.makeSound(); // Polymorphic behavior
        }
    }
}

interface FarmAnimal {
    void makeSound();
}

class Horse implements FarmAnimal {
    @Override
    public void makeSound() {
        System.out.println("Neigh!");
    }
}

class Cow implements FarmAnimal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}


