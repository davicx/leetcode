var intervals = [[1,3],[2,9],[8,10],[15,18]]
//var intervals = [[1,3],[2,6]]

let answer = merge(intervals);


for(let i = 0; i < answer.length; i++) {
    //console.log(answer[i][0],answer[i][1]);
}

function merge(intervals) {
    var newIntervals = [];

    for (let i = 1; i < intervals.length; i++) {
        let tempInterval = [];
        //console.log(intervals[i][0],intervals[i][1]);

        if(i == 1) {
            tempInterval = [intervals[0][0],intervals[0][1]]
        }

        //console.log(intervals[i][1], intervals[i + 1][0])
       
        //Case 1: Merge the Intervals 
        if(tempInterval[1] >= intervals[i][0]) {
            console.log("merge")
            //Step 1: Update the temp array


        //Case 2: Don't Merge 
        } else {

            //Step 1: Push the current temp array
            //Step 2: Clear it out 
            //Step 3: Start a new temp array i[0,1]
        

        }

        

        

        /*
        if(intervals[i][1] >= intervals[i + 1][0]) {
            tempInterval = [intervals[i][0], intervals[i + 1][1]]
            newIntervals.push(tempInterval)
            i = i + 1;
        } else {
            newIntervals.push(intervals[i])
        }
        */
    
    }

    return newIntervals;s
}

