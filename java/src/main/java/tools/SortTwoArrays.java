package tools;

import java.util.*;

public class SortTwoArrays {
    public static void main(String[] args) {
        //intervals = [[1,3],[2,6],[8,10],[15,18]]
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        one.add(1);
        one.add(1);
        two.add(2);
        two.add(2);
        three.add(3);
        three.add(3);
        intervals.add(three);
        intervals.add(one);
        intervals.add(two);

        //System.out.println(intervals);

        //Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        //Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        //Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        //Arrays.sort(data, (String[] s1, String[] s2) -> s1[0].compareTo(s2[0]));


        //Integers

        List<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        numbers.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        numbers.add(new ArrayList<Integer>(Arrays.asList(3,3)));
        numbers.add(new ArrayList<Integer>(Arrays.asList(2,2)));
        System.out.println(numbers);
        Collections.sort(numbers, (o1, o2) -> o1.get(0).compareTo(o2.get(0)));
        System.out.println(numbers);
        System.out.println(" ");

        //Strings
        List<ArrayList<String>> namesAndNumbers = new ArrayList<ArrayList<String>>();
        namesAndNumbers.add(new ArrayList<String>(Arrays.asList("Mike", "(805) 766-4920")));
        namesAndNumbers.add(new ArrayList<String>(Arrays.asList("Emily", "(705) 668-9292", "(705) 555-1060")));
        namesAndNumbers.add(new ArrayList<String>(Arrays.asList("James", "(605) 965-2000")));
        System.out.println(namesAndNumbers);
        Collections.sort(namesAndNumbers, (o1, o2) -> o1.get(0).compareTo(o2.get(0)));
        System.out.println(namesAndNumbers);




    }

}
