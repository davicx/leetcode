const height = [4,3,2,1,4];

const answer = maxArea(height);
console.log("____");
console.log(answer);

function maxArea(height) {
    var answer = 0;
    var water = 0;
   
    for (let i = 0; i < height.length; i++) {
        for (let j = i + 1; j < height.length; j++) {
            //console.log(height[i] + " " + height[j] + " " + i + " " + j);
            water = (j - i) * Math.min(height[i], height[j]);
            console.log(water);
            answer = Math.max(answer, water);
        }
    }
    return answer;
};









//Java
/*
class Solution {
    public int maxArea(int[] height) {

        int maxVolume = 0;
        int currentVolume = 0;
        int distance;
        int lowerWall;

        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                distance = j - i;
                lowerWall = Math.min(height[i], height[j]);
                currentVolume = lowerWall * distance;
                maxVolume = Math.max(maxVolume, currentVolume);
            }
        }
        
        return maxVolume;
    }
}
*/