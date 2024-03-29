package language;

public class simpleInterface {
    public static void main(String[] args) {
        OceanDwarf gimli = new OceanDwarf();
        gimli.fight();
        gimli.sleep();
        //gimli.hello = "ohh";
        System.out.println(gimli.hello);
    }
}

interface Dwarf {
    public String hello = "hiya";
    public void fight(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
    default void defaultMethod() {
        // default method implementation
    }
}

class OceanDwarf implements Dwarf {
    public void fight() {
        System.out.println("gimli swings his ax!");
    }

    @Override
    public void run() {
        System.out.println(hello);
        System.out.println("run");

    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
