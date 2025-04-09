package leetcode;


import java.util.HashMap;
import java.util.Map;


//NOT DONE
public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        //String str1 = "ABCABC";
        //String str2 = "ABC";
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String answer = gcdOfStrings(str1, str2);
        System.out.println(answer);
    }

    public static String gcdOfStrings(String str1, String str2) {
        String answer = "";
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        //Put Items in Map 1
        for (int i = 0; i < str1.length(); i++) {
            String charString = Character.toString(str1.charAt(i));
            map1.put(charString, map1.getOrDefault(charString, 0)+ 1);
        }

       //Put Items in Map 2
        for (int i = 0; i < str2.length(); i++) {
            String charString = Character.toString(str2.charAt(i));
            map2.put(charString, map2.getOrDefault(charString, 0)+ 1);
        }

        //Loop over and Compare
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int map1Value = map1.get(key);
                int map2Value = map2.get(key);
                int resultGCD = gcd(map1Value, map2Value);

                //System.out.println("Key: " + key + " | Map1 Value: " + map1.get(key) + " | Map2 Value: " + map2.get(key));
                //System.out.println(map1GCD.gcd(map2GCD));

                //Add to string
                for(int i = 0; i < resultGCD; i++) {
                    System.out.println(answer);
                    answer = answer + key;
                }

            } else {
                return "";
            }
        }

        return answer;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Ensure the GCD is positive
    }

}


//WORKS
/*

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        //String str1 = "ABCABC";
        //String str2 = "ABC";
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String answer = gcdOfStrings(str1, str2);
        System.out.println(answer);
    }

    public static String gcdOfStrings(String str1, String str2) {
        String answer = "";
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        //Put Items in Map 1
        for (int i = 0; i < str1.length(); i++) {
            String charString = Character.toString(str1.charAt(i));
            map1.put(charString, map1.getOrDefault(charString, 0)+ 1);
        }

       //Put Items in Map 2
        for (int i = 0; i < str2.length(); i++) {
            String charString = Character.toString(str2.charAt(i));
            map2.put(charString, map2.getOrDefault(charString, 0)+ 1);
        }

        //Loop over and Compare
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                BigInteger map1GCD = new BigInteger(String.valueOf(map1.get(key)));
                BigInteger map2GCD = new BigInteger(String.valueOf(map2.get(key)));
                //System.out.println("Key: " + key + " | Map1 Value: " + map1.get(key) + " | Map2 Value: " + map2.get(key));
                Integer gCD = map1GCD.gcd(map2GCD).intValue();
                //System.out.println(map1GCD.gcd(map2GCD));

                //Add to string
                for(int i = 0; i < gCD; i++) {
                    System.out.println(answer);
                    answer = answer + key;
                }

            } else {
                return "";
            }
        }

        return answer;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Ensure the GCD is positive
    }



}

 */

/*
//Output "TAUX"
//Correct: "TAUXX"

map.entrySet().forEach(entry->{
    System.out.println(entry.getKey() + " " + entry.getValue());
});

BigInteger a = new BigInteger("56");
BigInteger b = new BigInteger("98");

System.out.println("GCD: " + a.gcd(b)); // Output: 14


public static int gcd(int a, int b) {
if (b == 0) {
    return a; // Base case
}
return gcd(b, a % b); // Recursive call
}

public static int gcdWhile(int a, int b) {
while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
}
return a;
}


public static String gcdOfStrings(String str1, String str2) {
Set<String> set1 = new HashSet<String>();
Set<String> set2 = new HashSet<String>();

//Put Items in Set 1
for (int i = 0; i < str1.length(); i++) {
    String charString = Character.toString(str1.charAt(i));
    set1.add(charString);
}

//Put Items in Set 2
for (int i = 0; i < str2.length(); i++) {
    String charString = Character.toString(str2.charAt(i));
    set2.add(charString);
}

if (set1.equals(set2)) {
    return String.join("", set1);
} else {
    return "";
}
}
 */