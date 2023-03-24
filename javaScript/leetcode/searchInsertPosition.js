var nums = [1,3,5,6]
//var nums = [0,1,2,3,4]
//var nums = [0,1,2,4]

var target = 7

let answer = searchInsert(nums, target) 
console.log(answer)


//Not Correct Runtime learn Binary Search
function searchInsert(nums, target) {
    if(nums.length == 1) {
        if(nums[i] == target) {
            return i
        } else if(nums[i] < target) {
            return 1;
        } else {
            return 0;
        }
    }

    for (let i = 0; i < nums.length; i++) {
        if(nums[i] == target) {
            return i;
        } 

        console.log(target, nums[i])

        if(target < nums[i] && nums[i + 1] != target) {
            return i;
        }
    } 

    return nums.length

};

