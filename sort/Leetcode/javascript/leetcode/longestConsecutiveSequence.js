//const nums = [100,4,200,1,3,2]
//const nums = [0,3,7,2,5,8,4,6,0,1];
//const nums = [1,3,7,2,5,4,8,4,6,9,0,1];
//const nums = [0,1,1,2,3,4,5,6,7,8,9];
//const nums = [0,3,7,2,5,8,4,6,0,1];
//const nums = [0,1,1,2];
const nums = [100,4,200,1,3,2];

let answer = longestSequence(nums);
console.log(answer);

function longestSequence(nums) {
    if(nums.length == 0) {
      return 0;
    } else if (nums.length == 1) {
      return 1;
    } 

    nums.sort(function(a, b){return a - b});  
    nums = uniq(nums); 
    nums.sort(function(a, b){return a - b});  

    
    console.log(nums);
    var longestSequence = 0;
    var sequenceSet = new Set();
    let currentNum = nums[0];
    let previousNum = -10;
  
    for (let i = 0; i < nums.length; i++) {
      if(i !== 0) {
        currentNum = nums[i]
        previousNum = nums[i-1]
      }
  
      if(currentNum - previousNum == 1 || i == 0) {
        sequenceSet.add(currentNum);
      } else {
        sequenceSet.clear();
        sequenceSet.add(currentNum);
      }
      longestSequence = Math.max(longestSequence, sequenceSet.size)
    //console.log(nums[i] + " " + currentNum + " " + previousNum);
    //console.log(sequenceSet);
    //console.log(longestSequence);
    //console.log("______")
    }
    return longestSequence;    
  
}

  
function uniq(a) {
    return a.sort().filter(function(item, pos, ary) {
        return !pos || item != ary[pos - 1];
    });
}
/*

function longestConsecutive(nums) {
    let longestSequence = 0;

    for (var i = 0; i < nums.length; i++) {
        console.log(nums[i]);
    }

    return longestSequence;

}

*/

