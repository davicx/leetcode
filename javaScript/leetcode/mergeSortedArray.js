var nums1 = [1,2,3,0,0,0];
var m = 3
var nums2 = [2,5,6]
var n = 3

//var nums1 = [1];
//var m = 1
//var nums2 = []
//var n = 0

let answer = merge(nums1, m, nums2, n);

for (let i = 0; i < answer.length; i++) {
    console.log(i + " " + answer[i])
}


function merge(nums1, m, nums2, n) {
    let leftPointer = 0;
    let rightPointer = 0;
    let max = 20
    let maxCount = 0;
    var finalArray = []

    if(m == 0) {
        nums1 = []
        for (let i = 0; i < num2.length; i++) {
            nums1.push(num2[i])
        }
        return nums1;
    }

    if(n == 0) {
        return nums1;
    }

    //remove zeroes 
    

    while(leftPointer < nums1.length && rightPointer < nums2.length){
    //while(leftPointer < m -1 && rightPointer < n - 1){
        //console.log(nums1[leftPointer], nums2[rightPointer])
        
        if(nums1[leftPointer] == nums2[rightPointer]){
            finalArray.push(nums1[leftPointer])
            finalArray.push(nums2[rightPointer])
            leftPointer = leftPointer + 1;
            rightPointer = rightPointer + 1;
        } else if (nums1[leftPointer] < nums2[rightPointer]){
            finalArray.push(nums1[leftPointer])
            leftPointer = leftPointer + 1;
        } else if (nums1[leftPointer] > nums2[rightPointer]){
            finalArray.push(nums1[rightPointer])
            rightPointer = rightPointer + 1;
        } 

        if(nums1[leftPointer] == undefined) {
            for (let i = rightPointer; i < nums2.length; i++) {
                //console.log(nums2[i])
                finalArray.push(nums2[i])
            }
        }
        
        if(nums2[rightPointer] == undefined) {
            for (let i = leftPointer; i < nums1.length; i++) {
                //console.log(nums1[i])
                finalArray.push(nums1[i])
            }
        }
        
    }

    nums1 = []

    for (let i = 0; i < finalArray.length; i++) {
        nums1.push(finalArray[i])
    }

    return nums1

}
