var intervals = [[1,4],[5,7],[6,8],[10,12]]
var intervals = [[1,4],[0,4]]

let answer = mergeIntervals(intervals) 

function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }
    var answerArray = [];
    intervals.sort(sortFunction);

    for (let i = 0; i < intervals.length; i++) {
        if(answerArray.length == 0 || intervals[i][0] > answerArray[answerArray.length - 1][1]) {
            answerArray.push(intervals[i]);
        } else {
            answerArray[answerArray.length - 1][1] = Math.max(answerArray[answerArray.length - 1][1], intervals[i][1])
        }
        //console.log(intervals[i][0] + " " + answerArray[answerArray.length - 1][1]);
        //console.log(intervals[0][0] + " " + intervals[i][1]);
    }
    return answerArray;
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
for (let i = 0; i < answer.length; i++) {
    console.log("[" + answer[i][0] + "]" + "[" + answer[i][1] + "]");
}

/*

    var subArray = [];
    var subArrayFirst = intervals[0][0];
    var subArraySecond = intervals[0][1];
    var currentArrayEnd = intervals[0][1]; 
    var nextArrayStart = intervals[1][0]; 
           if(i != intervals.length - 1) {
            
            //Merge 
            if(currentArrayEnd >=  nextArrayStart) {
                nextArrayStart = intervals[i + 1][0];
                //console.log(i + " " + nextArrayStart);

            //Close Array and Create Subarray    
            } else {
                subArraySecond = intervals[i][1];
                subArray[0] = subArrayFirst; 
                subArray[1] = subArraySecond; 
                console.log("LOOP " + i + " " + subArrayFirst + " " + subArraySecond);
                
                answerArray.push();

                //Reset        
                subArray[0] = intervals[i + 1][0]; 
                //subArrayFirst = 
    
            }




*/

/*
        if(firstEnd >= secondStart) {
            console.log("MERGE " + firstEnd + " " + secondStart);
            //subArraySecond = intervals[i + 1][1];
            secondStart = intervals[i + 1][0]
        } else {
            
            console.log("NEW " + subArrayFirst + " " + subArraySecond);

        }

        if(i != intervals.length - 1) {
           //console.log(firstEnd + " " + secondStart);

        } else {
        }



//var intervals = [[1,3],[2,6],[5,10],[9,16]]
//var intervals = [[1,3],[2,6],[8,10],[15,18],[20,28]]
//var intervals = [[1,3],[2,8],[9,10],[15,16]]
//var intervals = [[1,3],[2,6],[8,10],[15,18]]
//var intervals = [[1,2],[2,3],[4,5],[7,8]]
//var intervals = [[1,2],[2,3]]
//var intervals = [[1,4],[5,6],[7,8],[9,10]];

    var answerArray = [];
    var arrayOneEnd;
    var arrayTwoStart;
    var subArray = [];

    for (let i = 0; i < intervals.length; i++) {

        //Keep Going 
        if (i != intervals.length - 1) {
            arrayOneEnd = intervals[i][1];
            arrayTwoStart = intervals[i + 1][0];
            console.log(arrayOneEnd + " " + arrayTwoStart)     
        } else {
            console.log("close out the array with " + intervals[i][1]);
        }
    
    }

    return answerArray;

*/












/*


function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }
    var grid = createGrid(intervals);
    var answerArray = [];
    var current;
    var previous;
    var open = -1;
    var closed = -1;

    for (const [key, value] of Object.entries(grid)) {

        //console.log("KEY " + key + " OPEN " + open + " CLOSED  " + closed)

        //console.log(key + " " + value);
        if(key == 0) {
            current = value
            previous = null;
            //console.log(key + " " + previous + " " + current); 
        } else {
            previous = current;
            current = value;
        }
        //console.log(key + " " + previous + " " + current); 
        
        //Solve
        let subArray = [];

        //Open an Array
        if(current == 1 && previous === null) {
            open = key;
            //console.log("Open " + open);

        } else if (current == 1 && previous == 0) {
            open = key;
            //console.log("Open " + open);
            
        //Close an Array    
        } else if (current == 0 && previous == 1) {
            closed = key - 1;
            subArray[0] = open;
            subArray[1] = closed;
            //console.log(key + " close " + "[" + open + "]" + "[" + closed + "]");

            answerArray.push(subArray);
        } else {
            //close = key;
        }
    }    
    return answerArray;
}


//Get Max Value 
function getMaxValue(intervals) {
    var maxValue = 0;
    for (let i = 0; i < intervals.length; i++) {
        maxValue = Math.max(maxValue, intervals[i][0]);
        maxValue = Math.max(maxValue, intervals[i][1]);
    }

    return maxValue;
}

//Create Grid
function createGrid(intervals) {
    var maxValue = getMaxValue(intervals);
    var grid = {}
    for (let i = 0; i < maxValue + 2; i++) {
        grid[i] = 0;
    }    
    
    var startValue;
    var endValue;
    for (let i = 0; i < intervals.length; i++) {
        startValue = intervals[i][0];
        endValue = intervals[i][1];
        for (let j = startValue; j <= endValue; j++) {
            grid[j] = 1;
        }      
    }

    return grid;
}

*/









/*
var currentInterval = intervals[0];
var outputArray = [];

outputArray.push(currentInterval);
currentInterval[1] = 1111;

currentInterval = intervals[3];
outputArray.push(currentInterval);
currentInterval[1] = 2222;
console.log(outputArray[0][1]);

var intervals = [[1,3],[2,6]];
const answer = mergeIntervals(intervals);

function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }
    intervals.sort(sortFunction);
    var currentInterval = intervals[0];
    var outputArray = [];
    outputArray.push(currentInterval);
    console.log(outputArray);

 
    for (let i = 0; i < intervals.length; i++) {
        let currentBegin = currentInterval[0];
        let currentEnd = currentInterval[1];
        let nextBegin = intervals[i][0];
        let nextEnd = intervals[i][1];
        //console.log(currentBegin + " " + currentEnd + " " + nextBegin + " " + nextEnd);
 
        if(currentEnd >= nextBegin) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);

        } else {
            currentInterval = intervals[i];
            //console.log(currentInterval)
            outputArray.push(currentInterval);
        }
    }
 
    currentInterval[1] = 77;
    currentInterval[1] = 22;
    for (let i = 0; i <= 5; i++) {
        currentInterval[1] = i;
    }

    
    
    

    return outputArray;
}

console.log("_________________________")
console.log(answer.length)

for (let i = 0; i < answer.length; i++) {
    console.log("Array: [" + answer[i][0] + ", " + answer[i][1]+ "]");
}

function sortFunction(a, b) {
    if (a[0] === b[0]) {
        return 0;
    }
    else {
        return (a[0] < b[0]) ? -1 : 1;
    }
}

*/



/*
function mergeIntervals(intervals) {
    intervals.sort(sortFunction);
    var answerArray = [];
    var currentInterval = intervals[0];
    var nextInterval = intervals[1];
    
    for (let i = 0; i < intervals.length; i++) {
        let currentBegin = currentInterval[0];
        let currentEnd = currentInterval[1];
        let nextBegin = nextInterval[0];
        let nextEnd = nextInterval[1];
        //console.log(intervals[i][0] + " " + intervals[i][1]);
        
        //Merge the Intervals
        if(currentEnd >= nextBegin) {
            currentInterval[1] = Math.max(currentEnd, nextEnd);
            nextInterval = intervals[1 + i];

        //Stop Merging
        } else {
            currentInterval = intervals[i];
            answerArray.push(currentInterval);
            //console.log("Current " + currentInterval);
            //Add Current Interval to Answer
            //
            //Reset current and next intervals 
            //currentInterval = intervals[i];
            //nextInterval = intervals[i + 1];
        }

    }

    return answerArray;
}

*/






/*
    let currentInterval = intervals[0];
    let nextInterval = intervals[1];
    let answerArray = currentInterval;

    for (let i = 0; i < intervals.length; i++) {
        let currentBegin = currentInterval[0];
        let currentEnd = currentInterval[0];
        let nextBegin = currentInterval[0];
        let currentEnd = currentInterval[0];
    }
*/

//a.sort(sortFunction);



/*
    for (let i = 0; i < intervals.length; i++) {
        let subArrayMin = intervals[i][0];
        let subArrayMax = intervals[i][1];
        console.log(subArrayMin + " " + subArrayMax);
 
        for (let j = subArrayMin; j <= subArrayMax; j++) {
            //console.log(j);
        }
    }
*/



 
/*
function mergeIntervals(intervals) {

    //STEP 1: Find the Minium and Maximum Values in the Array and pad out by one
    var min = intervals[0][0];
    var max = intervals[0][0];
    
    //Find Min and Max
    for (let i = 0; i < intervals.length; i++) {
        min = Math.min(min, intervals[i][0]);
        min = Math.min(min, intervals[i][1]);
        max = Math.max(max, intervals[i][0]);
        max = Math.max(max, intervals[i][1]);
    }
    min = min - 1;
    max = max + 2;

    //STEP 2: Create an Interval with 0 and 1
    var intervalArray = [];
    const length = max;
    
    for(let i = min; i < max; i++) {
        intervalArray.push(0);
    }

    for (let i = 0; i < intervals.length; i++) {               
        let left = intervals[i][0];
        let right = intervals[i][1];
         for(let k = left; k <= right; k++) {
            intervalArray[k] = 1;
        }
    }

    for(let j = 0; j < max; j++) {
        console.log(j + " " + intervalArray[j]);
    }


}








function mergeIntervalsOriginal(intervals) {
    if(!Array.isArray(intervals) || !intervals.length){
        return intervals;
    }
    
    var answerArray = [];
    var subAnswerArray = [];
    let previous = 0;
    let current = 0;
    var min = intervals[0][0];
    var max = intervals[0][0];
    
    //Find Min and Max
    for (let i = 0; i < intervals.length; i++) {
        min = Math.min(min, intervals[i][0]);
        min = Math.min(min, intervals[i][1]);
        max = Math.max(max, intervals[i][0]);
        max = Math.max(max, intervals[i][1]);
    }
    
    //Create an Interval to hold everything and fill it with 0
    var intervalArray = [];
    const length = max;
    
    for(var i = 0; i < length + 2; i++) {
        intervalArray.push(0);
    }
    
    //Create an array with zeros for empty spots and ones for an interval
    for (let i = 0; i < intervals.length; i++) {
              
        let left = intervals[i][0];
        let right = intervals[i][1];
        //console.log(left + " " + right);  
        for(let k = left; k <= right; k++) {
            //console.log(k);
            intervalArray[k] = 1;
        }
        //console.log("________________")
    }
    

    //Create the New Arrays
    for (let m = 0; m < intervalArray.length; m++) {
        if (m > 0) {
            previous = intervalArray[m-1];
        }
        current = intervalArray[m];
        //console.log("Array Count: " + m + " " + intervalArray[m]);
        
        //Start a new interval
        if(current == 1 && previous == 0) {
            subAnswerArray[0] = m;
            //console.log("start " + current + " " + previous + " " +  subAnswerArray[0])
    
        } else if (current == 0 && previous == 1) {
            //console.log("close " + current + " " + previous)
            subAnswerArray[1] = m - 1;
            //console.log(subAnswerArray[0] + " " + subAnswerArray[1]);
            answerArray.push(subAnswerArray);
            subAnswerArray = [];
        } else {
            //console.log("nadda " + current + " " + previous)
        }
    }
    
    return answerArray;
}

//Print Answer
/*
console.log("_________________________")
for (let i = 0; i < theAnswer.length; i++) {
    console.log("Array: [" + theAnswer[i][0] + ", " + theAnswer[i][1]+ "]");
}
*/

/*
//var intervals = [[1,3],[2,6],[8,10]]
var intervals = [[1,4],[5,6]]
var empty = [];
const theAnswer = mergeIntervals(intervals);

function mergeIntervals(intervals) {
    if(!Array.isArray(intervals) || !intervals.length){
        return [];
    }
    
    var answerArray = [];
    var subAnswerArray = [];
    let previous = 0;
    let current = 0;
    var min = intervals[0][0];
    var max = intervals[0][0];
    
    //Find Min and Max
    for (let i = 0; i < intervals.length; i++) {
        min = Math.min(min, intervals[i][0]);
        min = Math.min(min, intervals[i][1]);
        max = Math.max(max, intervals[i][0]);
        max = Math.max(max, intervals[i][1]);
    }
    
    //Create an Interval to hold everything and fill it with 0
    var intervalArray = [];
    const length = max;
    
    for(var i = 0; i < length + 2; i++) {
        intervalArray.push(0);
    }
    
    //Create an array with zeros for empty spots and ones for an interval
    for (let i = 0; i < intervals.length; i++) {
              
        let left = intervals[i][0];
        let right = intervals[i][1];
        //console.log(left + " " + right);  
        for(let k = left; k <= right; k++) {
            //console.log(k);
            intervalArray[k] = 1;
        }
        //console.log("________________")
    }
    

    //Create the New Arrays
    for (let m = 0; m < intervalArray.length; m++) {
        if (m > 0) {
            previous = intervalArray[m-1];
        }
        current = intervalArray[m];
        //console.log("Array Count: " + m + " " + intervalArray[m]);
        
        //Start a new interval
        if(current == 1 && previous == 0) {
            subAnswerArray[0] = m;
            //console.log("start " + current + " " + previous + " " +  subAnswerArray[0])
    
        } else if (current == 0 && previous == 1) {
            //console.log("close " + current + " " + previous)
            subAnswerArray[1] = m - 1;
            //console.log(subAnswerArray[0] + " " + subAnswerArray[1]);
            answerArray.push(subAnswerArray);
            subAnswerArray = [];
        } else {
            //console.log("nadda " + current + " " + previous)
        }
    }
    
    return answerArray;
}

//Print Answer
console.log("_________________________")
for (let i = 0; i < theAnswer.length; i++) {
    console.log("Array: [" + theAnswer[i][0] + ", " + theAnswer[i][1]+ "]");

}


*/