package leetcode;

import java.util.*;

public class CountStringChars {
    public static void main(String[] args) {
        Map<Character, Integer> answer = new HashMap<>();
        String s = "hhiyahi";
        answer = countChars(s);
        System.out.println(answer);
        answer = sortMapValue(answer);
        System.out.println(answer);
        //findPermutations(s);


    }

    public static Map<Character, Integer> sortMapValue(Map<Character, Integer> map) {
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(map.entrySet());
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
            return temp;
    }

    public static void findPermutations(String s) {

    }
    public static Map<Character, Integer> countChars(String s) {
        Character currentChar;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0)+ 1);
        }

        return map;
    }

}
