package leetcode;

import java.util.ArrayList;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        //int[] myArray = new int[3];
        //int[] flowerbed = {1, 0, 0, 0, 1};
        //1,0,1,0,1,0,1
        //Check Left and Right
        ArrayList<Integer> flowerbed = new ArrayList<Integer>();
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(0);

        Integer n = 1;

        Boolean answer = canPlaceFlowers(flowerbed, n);
        System.out.println("ANSWER: " + answer);

    }


    public static boolean canPlaceFlowers(ArrayList<Integer> flowerbed, Integer n) {
        Integer plotCount = 0;
        Integer count = 0;

        if(flowerbed.size() < n) {
            return false;
        }

        //Loop Over Flowerbed
        for (int i = 0; i < flowerbed.size(); i++) {
            System.out.println(flowerbed.get(i));

            if(i == flowerbed.size() - 1) {
                System.out.println("Last loop " + flowerbed.get(i));
            }

            //Open Space in Garden
            if(flowerbed.get(i) == 0) {
                count = count + 1;

                if(count == 3) {
                    plotCount = plotCount + 1;
                    count = 1;
                }

                //Last Loop Check
                if(i == flowerbed.size() - 1) {
                    System.out.println("Last loop " + flowerbed.get(i));
                    if(count == 2) {
                        plotCount = plotCount + 1;
                        count = 1;
                    }
                }

            //No Open Space
            } else {
                count = 0;
            }
        }

        //Return Answer
        if(plotCount >= n) {
            return true;
        } else {
            return false;
        }
    }
}
