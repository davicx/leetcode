//const nums = [0,1,0,2,7,0];
//const nums = [0,1,0,2,0,0];
const nums = [1,0,1,0,7,0,3];

moveZeroes(nums);

function moveZeroes(nums) {
    var rightPointer = nums.length - 1;
   
    for (let i = 0; i < nums.length; i++) {
        if(nums[i] == 0 ) {
            
            //Get the Right Position to do the Swap    
            while(nums[rightPointer] == 0) {
                rightPointer = rightPointer - 1;
                //console.log("Lowered rightPointer by 1 " + rightPointer);
            }
            if(i >= rightPointer) {
                console.log("STOP " + i + " " + rightPointer)
                return nums;
            }
            //console.log("RIGHT POINTER OK AT " + rightPointer);
            let tempNum = nums[rightPointer];
            nums[rightPointer] = nums[i];
            nums[i] = tempNum;  
        
        } else {
            //console.log("Nothing [" + i + "] " + nums[i]);
        }     
        console.log(i + " " + nums)

    }
    return nums;
};

/*
//rightPointer = swap(rightPointer, nums);
//console.log("Swap [" + i + "] " + nums[i]);
while(nums[rightPointer] == 0) {
    rightPointer = rightPointer - 1;
    console.log("Lowered rightPointer by 1 " + rightPointer);
}
console.log("RIGHT POINTER OK " + rightPointer);

*/
        

/*
    //SWAP HERE 
    let tempNum = nums[rightPointer];
    nums[rightPointer] = nums[i];
    nums[i] = tempNum;
    console.log(rightPointer + " " + nums)
*/




function swap(rightPointer, nums) {
    let rightPointerValue = nums[rightPointer]
    
    if(rightPointerValue != 0) {
        //console.log("Base " +  rightPointer);
        return rightPointer;
    } else {
        //console.log("Subtract One " +  rightPointer);
        rightPointer = rightPointer -1;
        return swap(rightPointer, nums);
    }
}

function swapArrayValues(leftIndex, rightIndex, nums) {
    let tempNum = nums[rightIndex];
    nums[rightIndex] = nums[leftIndex];
    nums[leftIndex] = tempNum;
    return nums
}

/*

            if(rightPointerValue == 0) {
                rightPointer = swap(rightPointer, nums);
            //Swap After Moving right Pointer to zero    
            } else {
                //console.log("Do it right away " + nums[i] + " " + rightPointer);
                //rightPointerValue = nums[rightPointer];
                //console.log("Move Pointer Before: "   + rightPointer + " " + rightPointerValue);
                //rightPointer = rightPointer - 1;
                //rightPointerValue = nums[rightPointer];
                //console.log("Move Pointer After " + rightPointer + " " + rightPointerValue);
            }

            //SWAP
            console.log("SWAP " + rightPointer)
            let tempNum = nums[rightPointer];
            nums[rightPointer] = nums[i];
            nums[i] = tempNum;

            
            //rightPointer = rightPointer - 1;
        
        
*/
/*
   let current = nums[i];
        let next = nums[i + 1];
        
        if(current == 0) {
            let tempIndex = i;
            while(tempIndex < nums.length) {
                console.log("MOVE Index " + tempIndex + " Nums " + current + " " + next)
                tempIndex++;
            }

        } else {
            console.log(current + " " + next);
        }
*/

//OLD
/*
//var nums = [0,1,2,0,7];

//moveZeroes(nums);

console.log("Before " + nums);
moveZeroes(nums);
console.log("After " + nums);


function moveZeroes(nums) {
    var rightPointer = nums.length - 1;
    var rightPointerValue = nums[rightPointer];
   
    for (var i = 0; i < nums.length; i++) {

        //Swap
        if(nums[i] == 0) {

            if(rightPointerValue == 0) {
                rightPointer = swap(rightPointer, nums);
            //Swap After Moving right Pointer to zero    
            } else {
                //console.log("Do it right away " + nums[i] + " " + rightPointer);
                //rightPointerValue = nums[rightPointer];
                //console.log("Move Pointer Before: "   + rightPointer + " " + rightPointerValue);
                //rightPointer = rightPointer - 1;
                //rightPointerValue = nums[rightPointer];
                //console.log("Move Pointer After " + rightPointer + " " + rightPointerValue);
            }

            //SWAP
            console.log("SWAP " + rightPointer)
            let tempNum = nums[rightPointer];
            nums[rightPointer] = nums[i];
            nums[i] = tempNum;

            
            //rightPointer = rightPointer - 1;
        
        
        } else {
            console.log("Nothing " + i + " " + nums[i]);
        }        
    }
};


function swap(rightPointer, nums) {
    let rightPointerValue = nums[rightPointer]
    
    if(rightPointerValue != 0) {
        //console.log("Base " +  rightPointer + "  " + rightPointerValue);
        return rightPointer;
    } else {
        //console.log("Swap " +  rightPointer + "  " + rightPointerValue);
        rightPointer = rightPointer -1;
        return swap(rightPointer, nums);
    }
}

function swapArrayValues(leftIndex, rightIndex, nums) {
    let tempNum = nums[rightIndex];
    nums[rightIndex] = nums[leftIndex];
    nums[leftIndex] = tempNum;
    return nums
}

*/
/*
   let current = nums[i];
        let next = nums[i + 1];
        
        if(current == 0) {
            let tempIndex = i;
            while(tempIndex < nums.length) {
                console.log("MOVE Index " + tempIndex + " Nums " + current + " " + next)
                tempIndex++;
            }

        } else {
            console.log(current + " " + next);
        }
*/