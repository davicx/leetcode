package leetcode;

public class Notes {

}


//MOVE ZEROS
/*
package leetcode;

import java.util.ArrayList;

public class MoveZeroes {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0);
        nums.add(1);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(3);
        nums.add(12);

        ArrayList<Integer> answer = moveZeroes(nums);
        System.out.println(answer);
    }





    public static ArrayList<Integer> moveZeroes(ArrayList<Integer> nums) {
        ArrayList<Integer> answer;
        Integer masterPointer = 0;
        Integer searchPointer = 1;

        while(masterPointer < nums.size() - 1) {
            System.out.println("NEW LOOP: " + masterPointer);
            //pause(5000);
            System.out.println(nums);

            if(masterPointer >= nums.size()) {
                break;
            }

            //Case 1: Both not zero (1,1)
            if (nums.get(masterPointer) != 0 && nums.get(searchPointer) != 0) {
                System.out.println("Case 1: " + nums.get(masterPointer) + " " + nums.get(searchPointer));
                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            //Case 2: Left not zero right zero (1,0)
            } else if (nums.get(masterPointer) != 0 && nums.get(searchPointer) == 0) {
                System.out.println("Case 2: " + nums.get(masterPointer) + " " + nums.get(searchPointer));
                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            //Case 3: Left zero right not zero (0,1)
            } else if (nums.get(masterPointer) == 0 && nums.get(searchPointer) != 0) {
                System.out.println("Case 3: " + nums.get(masterPointer) + " " + nums.get(searchPointer));
                swapElements(nums, masterPointer, searchPointer);

                //DONE: Check if done
                Boolean isDone = checkIfDone(nums);

                if(isDone == true) {
                    return nums;
                }

                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            //Case 4: Both zero  (0,0)
            } else if (nums.get(masterPointer) == 0 && nums.get(searchPointer) == 0) {
                System.out.println("Case 4: " + nums.get(masterPointer) + " " + nums.get(searchPointer));

                while(nums.get(searchPointer) == 0 && searchPointer < nums.size()) {
                    System.out.println("Case 4: While Swap " + " [" + masterPointer + "] " +  nums.get(masterPointer) + " [" + searchPointer + "] " + nums.get(searchPointer));
                    searchPointer = searchPointer + 1;
                    //pause(2000);
                }

                System.out.println("FOUND SWAP AT ");
                System.out.println("[" + masterPointer + "] " +  nums.get(masterPointer) + " [" + searchPointer + "]" + nums.get(searchPointer));

                swapElements(nums, masterPointer, searchPointer);

                //DONE: Check if done
                Boolean isDone = checkIfDone(nums);

                if(isDone == true) {
                    return nums;
                }

                masterPointer = masterPointer + 1;
                searchPointer = masterPointer + 2;

                System.out.println(nums);

                //pause(2000);

            } else {
                System.out.println("hi");
            }

            //checkIfDone(nums);
        }

        return nums;
    }



    public static Boolean checkIfDone(ArrayList<Integer> nums) {
        System.out.println("look for all nums and zeros");
        Boolean zeroFound = false;

        for (int i = 0; i < nums.size(); i++) {

            if(zeroFound == true && nums.get(i) != 0) {
                return false;
            }

            if(nums.get(i) == 0) {
                zeroFound = true;
            }

        }

        return true;
    }

    public static ArrayList<Integer> swapElements(ArrayList<Integer> nums, Integer leftPosition, Integer rightPosition) {
        Integer leftValue = nums.get(leftPosition);
        Integer rightValue = nums.get(rightPosition);

        nums.set(leftPosition, rightValue);
        nums.set(rightPosition, leftValue);


        return nums;
    }

    public static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.err.println("Pause interrupted: " + e.getMessage());
        }
    }
}






 */
        /*
        Integer masterPointer = 0;
        Integer searchPointer = 1;

        swapElements(nums, 2, 3);


        while(currentPointer < nums.size()) {
            System.out.println(nums.get(currentPointer));


            //Case: Current Pointer is a Zero need to fix
            if(currentPointer == 0) {

                while(nums.get(searchPointer) != 0) {
                    searchPointer = searchPointer + 1;
                    System.out.println("Search Moved Value: " + nums.get(searchPointer));

                }

            //Case: Current Pointer is not a Zero need to move both up by 1
            } else {
                currentPointer = currentPointer + 1;
                searchPointer = searchPointer + 1;

            }
        }
         */

                /*
                while(searchPointer < nums.size()) {
                    currentNum = nums.get(searchPointer);

                    //SWAP
                    if (currentNum != 0) {
                        System.out.println("Case 4: Swap IF " + nums.get(masterPointer) + " " + nums.get(searchPointer));
                        swapElements(nums, masterPointer, searchPointer);
                        searchPointer = searchPointer + 1;
                        masterPointer = masterPointer + 1;
                        pause(2000);
                    } else {
                        System.out.println("Case 4: Swap ELSE " + nums.get(masterPointer) + " " + nums.get(searchPointer));
                        searchPointer = searchPointer + 1;
                        pause(2000);
                    }

                    if (nums.get(searchPointer) == 0 && searchPointer >= nums.size()) {
                        System.out.println("DONE");
                        pause(2000);
                        break;
                    }


                }
                 */

