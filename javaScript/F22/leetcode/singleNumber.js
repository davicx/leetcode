const nums = [2,2,1]
const answer = singleNumber(nums)
console.log(answer)


function singleNumber(nums) {
    const numSet = new Set();
    
    for (const num of nums){
        if(numSet.has(num)) {
            numSet.delete(num)
            console.log("has " + num)
        } else {
            numSet.add(num)
            console.log("No " + num)
        }
    }
    const [answer] = numSet;
    
    return answer
};