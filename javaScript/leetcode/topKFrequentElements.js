var nums = [1,1,1,2,2,3]
var k = 2

topKFrequent(nums, k)

function topKFrequent(nums, k) {
    let numMap = countOccurences(nums)

    let answer = []

    for (var number in numMap) {
        if (numMap.hasOwnProperty(number)) {
            console.log(number + " " + numMap[number]);

            //Push the First two
            if(answer.length < 2) {
                answer.push({number:number, count: numMap[number]})
            }

            //Add if greater 
        }
    }

    for (let i = 0; i < answer.length; i++) {
        console.log(answer[i])
    } 
    
}

function countOccurences(nums) {
    var numMap = {}

    for (let i = 0; i < nums.length; i++) {
        currentNum = nums[i];
        if(numMap.hasOwnProperty(currentNum)) {
            let currentCount = numMap[currentNum];
            numMap[currentNum] = currentCount + 1;
        } else {
            numMap[currentNum] = 1;
        }
    }    
    return numMap;
};
