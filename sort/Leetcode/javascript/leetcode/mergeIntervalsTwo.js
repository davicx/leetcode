var intervals = [[1,4],[5,7],[6,8],[10,12]];

let answer = mergeIntervals(intervals);

function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }

    var answerArray = [];

    intervals.sort(sortFunction);   

    for (let i = 0; i < intervals.length; i++) {
        if(answerArray.length == 0 || intervals[i][0] > answerArray[answerArray.length-1][1]) {
            answerArray.push(intervals[i])
        } else {
            answerArray[answerArray.length - 1][1] = Math.max(intervals[i][1], answerArray[answerArray.length-1][1])
        }
    }
    return answerArray;
};


function sortFunction(a, b) {
    if (a[0] === b[0]) {
        return 0;
    }
    else {
        return (a[0] < b[0]) ? -1 : 1;
    }
}



//ANSWER
for (let i = 0; i < answer.length; i++) {
    console.log("[" + answer[i][0] + "]" + "[" + answer[i][1] + "]");
}