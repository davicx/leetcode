//var intervals = [[1,4],[5,7],[6,8],[10,12]]
//var intervals = [[1,4],[0,4]]
var intervals = [[1,3],[2,6],[8,10],[15,18]]
 
let answer = mergeIntervals(intervals) 

function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }

    intervals.sort(sortFunction)
    let answer = []
    let currentStart = intervals[0]
    let currentEnd = intervals[1]
 
    for (let i = 0; i < intervals.length; i++) {
        console.log(intervals[i])

        //STEP 1: if 3 is less then 6 add the interval 

        //If 3 is greater then or equal to 6 merge the intervals 
        

    }
 
}



function sortFunction(a, b) {
    if (a[0] === b[0]) {
        return 0;
    }
    else {
        return (a[0] < b[0]) ? -1 : 1;
    }
}


//ANSWER
/*
for (let i = 0; i < answer.length; i++) {
    console.log("[" + answer[i][0] + "]" + "[" + answer[i][1] + "]");
}
*/
