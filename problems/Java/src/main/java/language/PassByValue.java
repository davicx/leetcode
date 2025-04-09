package language;

public class PassByValue {
    public static void main(String[] args) {

        //Primitive Example
        int num = 5;
        modify(num);
        System.out.println(num); // Output: 5

        //Class
        Doggy myDog = new Doggy();
        myDog.name = "Rex";
        changeName(myDog);
        //System.out.println(myDog.name); // Output: Fido

        //Class with reference inside
        Doggy trigger = new Doggy();
        trigger.name = "Trigger";
        replaceDog(trigger);
        //System.out.println(trigger.name); // Output: Rex


    }

    //Primitive Example
    public static void modify(int x) {
        x = 100;
    }


    //Class
    public static void changeName(Doggy d) {
        /*
        The reference (i.e., memory address) to the object myDog is passed by value.
        So d in changeName(Dog d) is a copy of the reference to the same object.
        Both myDog and d point to the same Dog object in memory. So changing the object's fields affects the original object.
         */
        d.name = "Fido";
    }

    //Class
    public static void replaceDog(Doggy d) {
        d = new Doggy();       // This changes the local copy of the reference
        d.name = "Max";
    }
}

class Doggy {
    String name;
}


