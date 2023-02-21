//const nums = [5,7,7,8,8,10];
const nums = [5,7,8,9,12,14,21,25,28,29,30];
const target = 29;

let answer = binarySearch(nums, target)
console.log(answer);
//console.log(Math.floor((3.5 + 5) / 2));

function binarySearch(nums, target) {
    var leftPointer = 0;
    var rightPointer = nums.length - 1;

    while(leftPointer <= rightPointer) { 
        let mid = Math.floor((leftPointer + rightPointer) / 2)
        //console.log(typeof(leftPointer) + " " + typeof(rightPointer) + " " + typeof(mid))
        //mid = Math.floor(mid);
        console.log(leftPointer + " " + rightPointer + " " + mid);
        
        if(nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            rightPointer = mid - 1;
        } else {
            leftPointer = mid + 1;
        }
        console.log("running")
        
    }
    return -1;
   
}





/*

function searchRange(nums, target) {
    

}

*/
