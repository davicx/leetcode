//const nums = [0,0,2,7,11,15];
//const target = 9;
const nums = [3,2,4]
const target = 6;


let answer = twoSum(nums, target)
console.log("ANSWER " + answer);

function twoSum(nums, target) {
    var sumMap = {}

    for(let i = 0; i < nums.length; i++) {
        sumMap[nums[i]] = i;
    }
    console.log(sumMap)
    for(let i = 0; i < nums.length; i++) {
        let searchDifference = target - nums[i]
  
        if(sumMap[searchDifference] != i && sumMap.hasOwnProperty(searchDifference)) {s
            return [i, sumMap[searchDifference]]
        } 
    }

}

