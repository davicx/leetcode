package language;

public class simpleAbstract {
    public static void main(String[] args) {
        WoodElf legolas = new WoodElf();
        legolas.sayHello();
    }
}

abstract class Elf {
    public abstract void sayHello();

    //Regular method
    public void sleep() {
        System.out.println("I am sleeping!");
    }
}

class WoodElf extends Elf {
    public void woodElfFight() {
        System.out.println("I use a bow!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hi I am a woodelf!");
    }
}

