const nums = [1,2,3,4,5,6,7]
const k = 3

//const nums = [1,2,3,4,5,6,7] //[5,6,7,1,2,3,4]
//const k = 3;

let answer = rotate(nums, k);

function rotate(nums, k) {
    let answerArray = [];
    let newPosition;
    k = k % nums.length;
  
    for (let i = 0; i < nums.length; i++) {
        newPosition = (i + k) % nums.length;
        answerArray[newPosition] = nums[i];
    }
    
    for (let i = 0; i < answerArray.length; i++) {
        nums[i] = answerArray[i];
    }

    return nums;
}

for (let i = 0; i < answer.length; i++) {
    //console.log(answer[i]);
}


//rotate(nums, k);


/*
function rotate(nums, k) {
    let answerArray = [];
    const rotation = k % nums.length;
    const rotationDifference = nums.length - rotation;
    console.log(rotation + " " + rotationDifference)
 
    for (let i = rotationDifference; i < nums.length; i++) {
        console.log(nums[i]);
        //answerArray.push(nums[i]);
    }
    
    for (let i = 0; i < nums.length - k; i++) {
        console.log(nums[i]);
        //answerArray.push(nums[i]);
    }
    
    for (let i = 0; i < answerArray.length; i++) {
        //nums[i] = answerArray[i];
        //console.log(answerArray[i])
    }

    return nums;
}

*/
/*


function rotate(nums, k) {
    for (let i = 0; i < nums.length; i++) {
        //console.log(nums[i]);
    }
}


for (let i = 0; i < nums.length; i++) {
    console.log(nums[i]);
}
let tempOne = nums[1];
let tempTwo = nums[4];

nums[1] = tempTwo;
nums[4] = tempOne;
console.log("After");
for (let i = 0; i < nums.length; i++) {
    console.log(nums[i]);
}
*/


