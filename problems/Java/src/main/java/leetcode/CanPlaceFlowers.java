package leetcode;

import java.util.ArrayList;


//NOT DONE
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};

        int n = 1;

        Boolean answer = canPlaceFlowers(flowerbed, n);
        System.out.println("ANSWER: " + answer);

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        Integer plotCount = 0;
        Integer count = 0;

        if (flowerbed.length < n) {
            return false;
        }

        /*
        Is the current spot empty?
        Is the left spot empty or out of bounds?
        Is the right spot empty or out of bounds
        */

        //Loop Over Flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            int currentGardenType = flowerbed[i];

            if(currentGardenType == 0) {
                System.out.println("Can Plant here " + flowerbed[i]);
            } else {
                System.out.println("Can NOT Plant here " + flowerbed[i]);
            }






        }

        return true;
    }









/*
        if (i == flowerbed.length- 1) {
                System.out.println("Last loop " + flowerbed.length);
            }
 */





    public static boolean canPlaceFlowersChat(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // place flower
                    count++;
                    if (count >= n) return true;
                }
            }
        }

        return count >= n;
    }


    public static boolean canPlaceFlowersArrayList(ArrayList<Integer> flowerbed, Integer n) {
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

/*
    ArrayList<Integer> flowerbed = new ArrayList<Integer>();
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(1);
        flowerbed.add(0);
        flowerbed.add(0);
 */
