//var nums = [100,4,200,1,3,2]
//var nums = [0,0,0]
var nums = [1,2,0,1]

let answer = longestConsecutive(nums)
console.log("Answer: " + answer) 

function longestConsecutive(nums) {
    nums.sort(sortNums);
    let maxCount = 1
    let currentCount = 1
    let previous = null
    let current = null

    if(nums.length == 0) {
        return 0;
    }

    if(nums.length == 1) {
        return 1;
    }

    for (let i = 0; i < nums.length; i++) {
        if(i == 0) {
            current = i;
        }

        current = nums[i];
        previous = nums[i -1];
        
        if(current - previous != 0) {
            if(current - previous == 1) {
                currentCount = currentCount + 1;
                console.log("Add One: ", current, previous, currentCount)
                
                maxCount = Math.max(maxCount, currentCount)
            } else {
                console.log("Stop Counting: ", current, previous, currentCount)
                currentCount = 1
            }
        }   
    }

    return maxCount;

}


function sortNums(a, b){
    return a-b
}