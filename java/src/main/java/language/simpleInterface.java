package language;

public class simpleInterface {
    public static void main(String[] args) {
        OceanDwarf gimli = new OceanDwarf();  // Create a Pig object
        gimli.fight();
        gimli.sleep();
    }
}

interface Dwarf {
    public void fight(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}

class OceanDwarf implements Dwarf {
    public void fight() {
        System.out.println("gimli swings his ax!");
    }

    @Override
    public void run() {
        System.out.println("run");

    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
