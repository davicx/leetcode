package leetcode;


//STATUS: Done and Accepted
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,2,3,4};

        int answer = maxArea(height);

        System.out.println(" ");
        System.out.println("Answer: " + answer);
    }


    public static int maxArea(int[] height) {
        int maxArea = 0;
        int currentArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftHeight = 0;
        int rightHeight = 0;
        int distance = rightPointer - leftPointer;


        for (int i = 0; i < height.length; i++) {
            leftHeight = height[leftPointer];
            rightHeight = height[rightPointer];
            distance = rightPointer - leftPointer;

            currentArea = Math.min(leftHeight, rightHeight) * distance;
            maxArea = Math.max(maxArea, currentArea);

            //Adjust pointers
            if(leftHeight < rightHeight) {
                leftPointer = leftPointer + 1;
            } else {
                rightPointer = rightPointer - 1;
            }

            //Stop if we reach middle
            if(leftPointer == rightPointer) {
                break;
            }

        }

        return maxArea;
    }



}


/*

    //Original
    public static int maxAreaOriginal(int[] height) {
        int maxArea = 0;
        int currentMaxArea = 0;

        for (int i = 0; i < height.length; i++) {
           currentMaxArea = maxSingleArea(height, i);
           maxArea = Math.max(maxArea, currentMaxArea);
        }

        return maxArea;
    }

    //Find Max Single
    public static int maxSingleArea(int[] height, int start) {
        int maxArea = 0;
        int distanceBetweenContainerWalls = 0;
        int containerHeight = 0;
        int leftWall = 0;
        int rightWall = 0;

        int containerMaxArea = 0;

        for (int i = start + 1; i < height.length; i++) {
            distanceBetweenContainerWalls = i - start;
            leftWall = height[start];
            rightWall = height[i];
            containerHeight = Math.min(leftWall, rightWall);
            containerMaxArea = distanceBetweenContainerWalls * containerHeight;
            maxArea = Math.max(maxArea, containerMaxArea);
            System.out.println("distanceBetweenContainerWalls " + distanceBetweenContainerWalls + " containerHeight " + containerHeight + " leftWall " + leftWall + " rightWall " + rightWall);
            System.out.println("containerMaxArea " + containerMaxArea);
            System.out.println(" ");
        }

        return maxArea;
    }
 */