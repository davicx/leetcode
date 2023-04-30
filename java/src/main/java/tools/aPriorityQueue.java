package tools;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class aPriorityQueue {
    public static void main(String[] args) {
        //simple();
        //withObjects();
        withObjectsReverse();
    }



    //Simple
    public static void simple() {
        PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        myQueue.add(4);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(1);

        //Current Queue
        Iterator iterator = myQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");

        // Printing the top element of PriorityQueue
        System.out.println("the top element " + myQueue.peek());

        // Printing the top element and removing it from the PriorityQueue
        System.out.println("removing top element " + myQueue.poll());

        // Printing the top element again
        System.out.println("new top element " + myQueue.peek());
        System.out.println("removing next element " + myQueue.remove());
    }

    //With Objects
    public static void withObjects(){
        User davey = new User(1, "davey");
        User frodo = new User(2, "frodo");
        User sam = new User(3, "sam");
        User merry = new User(4, "merry");
        User pippin = new User(5, "pippin");
        User aragon = new User(5, "aragon");

        PriorityQueue<User> userQueue = new PriorityQueue<User>(Comparator.comparing(User::getUserName));

        // Adding items to the pQueue using add()
        userQueue.add(sam);
        userQueue.add(pippin);
        userQueue.add(merry);
        userQueue.add(davey);
        userQueue.add(aragon);
        userQueue.add(frodo);

        System.out.println(userQueue.peek().userName);

    }

    //With Objects reverses
    public static void withObjectsReverse(){
        User davey = new User(1, "davey");
        User frodo = new User(2, "frodo");
        User sam = new User(3, "sam");
        User merry = new User(4, "merry");
        User pippin = new User(5, "pippin");
        User aragon = new User(5, "aragon");

        //.reverseOrder()
        PriorityQueue<User> userQueue = new PriorityQueue<User>(Comparator.comparing(User::getUserName).reversed());

        // Adding items to the pQueue using add()
        userQueue.add(sam);
        userQueue.add(pippin);
        userQueue.add(merry);
        userQueue.add(davey);
        userQueue.add(aragon);
        userQueue.add(frodo);

        System.out.println(userQueue.peek().userName);

    }

    /*
        //Sort with Lambda
        users.forEach((s)->System.out.println(s.userName));
        System.out.println("  ");
        //users.sort((User userOne, User userTwo)->userOne.getUserID()-userTwo.getUserID());
        users.sort(Comparator.comparingInt(User::getUserID));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");
        //users.sort((User userOne, User userTwo)->userOne.getUserName().compareTo(userTwo.getUserName()));
        users.sort(Comparator.comparing(User::getUserName));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");
     */

}

/*
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            System.out.println(word);
            //If word is in there put it in and add to count by one if not default to zero
            map.put(word, map.getOrDefault(word, 0)+ 1);


        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String word1, String word2) {
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);

                if(frequency1 == frequency2) {
                    return word2.compareTo(word1);
                }

                return frequency1 - frequency2;
            }
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k) {
                pq.poll();
            }
        }

        List<String> result = new ArrayList<>();

        //Add elements to list from the Priority Q
        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        System.out.println(result);

        return result;

    }


 */