package language;

public class simplePolymorphism {
    public static void main(String[] args) {
        MainHero main = new MainHero();
        MainHero bowman = new Bowman();
        Legolas legolas = new Legolas();
        main.sayHi();
        bowman.sayHi();
        legolas.sayHi();
    }
}

class MainHero {
    public void sayHi() {

        System.out.println("The Hero Says hi!");
    }
}

class Bowman extends MainHero {
    public void sayHi() {
        System.out.println("The bowman says hi");
    }
}

class Legolas extends MainHero {
    public void sayHi() {
        System.out.println("Legolas says hi!!");
    }
}
