//var intervals = [[1,3],[2,9],[8,10],[12,15]]
//var intervals = [[1,3],[2,9],[8,10],[12,15]]
//var intervals = [[1,3],[2,9],[8,14],[12,15]]
//var intervals = [[1,4],[0,4]]
var intervals = [[1,4],[2,3]]


let answer = merge(intervals);

console.log("")
console.log("ANSWER ")
for(let i = 0; i < answer.length; i++) {
    console.log("[" + answer[i][0] + "] " + "[" + answer[i][1] + "]");
}

function merge(intervals) {
    intervals.sort(sortFunction);
    if(intervals.length <= 1) {
        return intervals
    }

    console.log(intervals[0], intervals[1]) 
    var newIntervals = [];
    var tempArray = [];


    for (let i = 1; i < intervals.length; i++) {
        if(i == 1) {
            tempArray = intervals[0]
        }
 
        //Case 1: Dont Merge Intervals 
        if(intervals[i][0] <= tempArray[1]) {
            console.log("merging ")
            tempArray[1] = Math.max(intervals[i][1],tempArray[1]);
            console.log("Temp Array " + tempArray[0], tempArray[1] )

        //Case 2: Merge the Intervals
        } else {
            console.log("don't merge")
            //Step 1: Push the current temp array
            newIntervals.push(tempArray)

            //Step 2: Clear it out and  Start a new temp array i[0,1]  
            tempArray = intervals[i]
            console.log("New Temp array ")        
            console.log(tempArray)            

        }
    }

    newIntervals.push(tempArray)

    return newIntervals;

}

function sortFunction(a, b) {
    if (a[0] === b[0]) {
        return 0;
    }
    else {
        return (a[0] < b[0]) ? -1 : 1;
    }
}





