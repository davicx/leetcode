package leetcode;


import static tools.Tools.pause;
import static tools.Tools.swapElements;

//STATUS: Done and Accepted
public class MoveZeroes {
    public static void main(String[] args) {
        //int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0, 0, 0,};

        int[] answer = moveZeroes(nums);

        for (int num : answer) {
            System.out.print(num + " ");
        }

    }

    public static int[] moveZeroes(int[] nums) {
        int nextPosition;

        for (int masterPointer = 0; masterPointer < nums.length; masterPointer++) {
            pause(1000);

            //Need Swap
            if (nums[masterPointer] == 0) {
                nextPosition = findNextNumber(masterPointer, nums);

                //All Done
                if(nextPosition == -1) {
                    System.out.println("done!!");
                    return nums;
                }

                swapElements(nums, masterPointer, nextPosition);

                for (int num : nums) {
                    System.out.print(num + " ");
                }

                System.out.println(" ");
            }
        }

        return nums;
    }


    public static int findNextNumber(int position, int[] nums) {
        int nextElementPosition = -1;

        for (int i = position; i < nums.length; i++) {
            if (nums[i] != 0) {
                nextElementPosition = i;
                return nextElementPosition;
            }
        }

        return nextElementPosition;
    }



}


/*

    //NOTES
    public static ArrayList<Integer> moveZeroesOLD(ArrayList<Integer> nums) {
        ArrayList<Integer> answer;
        Integer masterPointer = 0;
        Integer searchPointer = 1;

        checkIfDone(nums);

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


}
*/

//ORIGINAL
/*
class Solution {
    public void moveZeroes(int[] nums) {
        int masterPointer = 0;
        int searchPointer = 1;

        while (masterPointer < nums.length - 1) {

            if (masterPointer >= nums.length) {
                break;
            }

            // Case 1: Both not zero (1,1)
            if (nums[masterPointer] != 0 && nums[searchPointer] != 0) {
                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            // Case 2: Left not zero, right zero (1,0)
            } else if (nums[masterPointer] != 0 && nums[searchPointer] == 0) {
                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            // Case 3: Left zero, right not zero (0,1)
            } else if (nums[masterPointer] == 0 && nums[searchPointer] != 0) {
                swapElements(nums, masterPointer, searchPointer);

                // Check if done
                Boolean isDone = checkIfDone(nums);

                if (isDone == true) {
                    return;  // No need to return `nums`, just exit the method
                }

                masterPointer = masterPointer + 1;
                searchPointer = searchPointer + 1;

            // Case 4: Both zero (0,0)
            } else if (nums[masterPointer] == 0 && nums[searchPointer] == 0) {
                while (searchPointer < nums.length && nums[searchPointer] == 0) {
                    searchPointer = searchPointer + 1;
                }

                if (searchPointer < nums.length) {
                    swapElements(nums, masterPointer, searchPointer);

                    // Check if done
                    Boolean isDone = checkIfDone(nums);

                    if (isDone == true) {
                        return;  // Just exit, no need to return `nums`
                    }
                }

                masterPointer = masterPointer + 1;
                searchPointer = masterPointer + 2;
            }
        }
    }

    public static Boolean checkIfDone(int[] nums) {
        Boolean zeroFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (zeroFound == true && nums[i] != 0) {
                return false;
            }
            if (nums[i] == 0) {
                zeroFound = true;
            }
        }
        return true;
    }

    public static void swapElements(int[] nums, int leftPosition, int rightPosition) {
        int temp = nums[leftPosition];
        nums[leftPosition] = nums[rightPosition];
        nums[rightPosition] = temp;
    }
}

 */