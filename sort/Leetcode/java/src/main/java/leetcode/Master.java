import java.util.*;

public class Master {
    public static void main(String[] args) {

        //ARRAYS
        //Basic Array
        String[] myArray = {"david", "frodo", "sam"};

        //Array List
        ArrayList<String> myArrayList = new ArrayList<String>();

        //HashSet
        Set<String> stringSet = new HashSet<>();

        //HashMap
        Map<Integer, String> map = new HashMap<>();

        //USING
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        map.put(1, "david");

        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        Map<String, Integer> mapCounter = new HashMap<>();
        mapCounter.put("david", mapCounter.getOrDefault("david", 0)+ 1);
        mapCounter.put("david", mapCounter.getOrDefault("david", 0)+ 1);
        mapCounter.put("frodo", mapCounter.getOrDefault("frodo", 0)+ 1);
        System.out.println(mapCounter);

        //Hash Set
        stringSet.add("hiya");
        stringSet.contains("hiya");
        System.out.println(stringSet);

        //CLASS
        User currentUser = new User(1, "davey");
        currentUser.addFriend("frodo");
        System.out.println(currentUser.getFriends());


    }

    //FUNCTION (Takes a String and returns array list of strings)
    public static ArrayList<String> middleEarthPeople(String friend) {
        ArrayList<String> shirePlaces = new ArrayList<String>();
        shirePlaces.add(friend);
        shirePlaces.add("davey");
        shirePlaces.add("frodo");

        return shirePlaces;
    }

    //CLASS
    class shirePlaces {
        public String inn;

        //Constructor
        public shirePlaces(String inn) {
            this.inn = inn;
        }

    }

}





//SORT
/*
        ArrayList<Integer> userOne = new ArrayList<Integer>();
        userOne.add(1);
        userOne.add(2);
        userOne.add(5);
        userOne.add(7);

        ArrayList<Integer> userTwo = new ArrayList<Integer>();
        userTwo.add(1);
        userTwo.add(2);
        userTwo.add(3);
        userTwo.add(7);

        ArrayList<Integer> userThree = new ArrayList<Integer>();
        userThree.add(1);
        userThree.add(2);
        userThree.add(7);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 8; i++) {
            map.put(userOne.get(i), map.getOrDe fault(userOne.get(i), 0)+ 1);
            map.put(userTwo.get(i), map.getOrDefault(userOne.get(i), 0)+ 1);
            map.put(userThree.get(i), map.getOrDefault(userOne.get(i), 0)+ 1);
        }
*/
/*

public class Main {
    public static void main(String[] args) {

        //PART 1: Primitives
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 0;

		//PART 2: Arrays
        int[] nums = {2, 7, 11, 15, 2, 3, 4, 2, 4};

        ArrayList<Integer> millionInts = new ArrayList<Integer>();
        Random rand = new Random();
        int currentNumber = 0;

        for (int j = 0; j<1000000; j++) {
            currentNumber = rand.nextInt(50);
            //System.out.println(currentNumber);
            millionInts.add(currentNumber);
        }

        //System.out.println(millionInts.size());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < millionInts.size(); i++) {
            map.put(millionInts.get(i), map.getOrDefault(millionInts.get(i), 0)+ 1);
        }


        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        //PART 3: Data Structures
        //Simple Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        char[] inputString = {'h','e','l','l','o'};

        //Loop over array

        int[] myArray = {2,7,11,15};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


        //Hash Map
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


        //PART 4: Control Statements
        //If Statements
        if (1 == 1) {
            System.out.println("One is one");
        } else {
            System.err.println("Nope");
        }

        //For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
*/