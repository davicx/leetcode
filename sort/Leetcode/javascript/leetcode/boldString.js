//Could just loop over and insert bold before and after hi
//const s = "xxhixxhihixxabcx";
const s = "aahihiaaabcaa";
const stringArray = ["hi", "abc"];
//const stringArray = ["hi", "hiya"];

let answer = boldString(s, stringArray);
console.log(answer);

//Funtion: Master 
function boldString(s, stringArray) {
    let intervals = createIntervals(s, stringArray);
    intervals.sort(sortIntervals);  
    intervals = mergeIntervals(intervals);
    for (let i = 0; i < intervals.length; i++) {
        console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
    }
    let boldedString = createBoldString(s,intervals);
    //showIntervals(intervals);
    return boldedString

}


//Function 2: Merge the Intervals
function mergeIntervals(intervals) {
    if(intervals.length <= 1) {
        return intervals;
    }

    var answerArray = [];
    intervals.sort(sortIntervals);   

    for (let i = 0; i < intervals.length; i++) {
        if(answerArray.length == 0 || intervals[i][0] - answerArray[answerArray.length-1][1] > 1) {
            answerArray.push(intervals[i])
        } else {
            answerArray[answerArray.length - 1][1] = Math.max(intervals[i][1], answerArray[answerArray.length-1][1])
        }
    }
    return answerArray;  

}

//Function 3: Created the Bolded String from intervals and string 
function createBoldString(s,intervals) {
    var answerString = ""
    var offset = 0;
    let sArray = []
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        sArray.push(currentChar);
    }

    //Insert Bold 
    for (let i = 0; i < intervals.length; i++) {
        //console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
        insertLeft = intervals[i][0] + offset;
        insertRight = intervals[i][1] + offset + 2;
        sArray.splice(insertLeft, 0, "<b>");
        sArray.splice(insertRight, 0, "</b>");
        offset = offset + 2;        
    }

    
    //Create Answer String Again
    for (let i = 0; i < sArray.length; i++) {
        answerString = answerString + sArray[i];
    }

    return answerString;
}


//Function A: Show Intervals 
function showIntervals(intervals) {
    for (let i = 0; i < intervals.length; i++) {
        console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
    }
}

//Function 1: Create the Intervals
function createIntervals(s, stringArray) {
    var intervals = [];
    
    for (let i = 0; i < stringArray.length; i++) {
        //console.log(stringArray[i]);
        let currentWord = stringArray[i];
        
        for (let i = 0; i < s.length; i++) {
            let sChar = s.charAt(i);
            if(sChar == currentWord.charAt(0)) {
                let wordOne = currentWord
                let wordTwo = s.slice(i,i + wordOne.length)
                if(wordOne == wordTwo) {
                    let start = i;
                    let stop = i + wordOne.length-1;
                    let tempArray = [start, stop]
                    intervals.push(tempArray)
                    i = i + currentWord.length -1;
                }
            } 
        } 
    }  
    return intervals;
}

function sortIntervals(a, b) {
    if (a[0] === b[0]) {
        return 0;
    }
    else {
        return (a[0] < b[0]) ? -1 : 1;
    }
}



/*
lengthOfSubString = intervals[i][1] - intervals[i][0] + 1;
insertOpen = intervals[i][0] + offset;
        
        //insertOpen = left;
        //insertClosed = right + subStringLength;


        insertClosed = intervals[i][1] + offset;
        console.log(lengthOfSubString + " " +  insertClosed)
        

subStringLength = right - left + 1;
//console.log("[" + left + "]" + "[" + right + "]");

//insertOpen = left;
//insertClosed = right + subStringLength;
sArray.splice(insertOpen, 0, "<b>");
offset = offset + 2;

insertClosed = intervals[i][1] + offset;
console.log(lengthOfSubString + " " +  insertClosed)
sArray.splice(insertClosed, 0, "</b>");

//offset = offset + 1;

//console.log(lengthOfSubString + " " + insertOpen + " " + insertClosed)

//console.log(offset)
*/
    /*
    console.log(arr.join()); // Jani,Hege,Stale,Kai Jim,Borge
    arr.splice(2, 0, "Lene");
    console.log(arr.join()); // Jani,Hege,Lene,Stale,Kai Jim,Borge
    let n = "";
    for (let i = 0; i < intervals.length; i++) {
        console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
    }
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        console.log(currentChar)

    }
    */
    //let intervalArray = []

/*

function createBoldString(s,intervals) {
    var offset = 0;
    var answerString = ""
    let sArray = []
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        sArray.push(currentChar);
    }
    var left;
    var right;
    var subStringLength;

    for (let i = 0; i < intervals.length; i++) {
        console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
        lengthOfSubString = intervals[i][1] - intervals[i][0] + 1;
        insertOpen = intervals[i][0] + offset;
        
        subStringLength = right - left + 1;
        //console.log("[" + left + "]" + "[" + right + "]");
        
        //insertOpen = left;
        //insertClosed = right + subStringLength;
        sArray.splice(insertOpen, 0, "<b>");
        offset = offset + 2;

        insertClosed = intervals[i][1] + offset;
        console.log(lengthOfSubString + " " +  insertClosed)
        sArray.splice(insertClosed, 0, "</b>");

        //offset = offset + 1;
        
        //console.log(lengthOfSubString + " " + insertOpen + " " + insertClosed)
        
        //console.log(offset)
    }
    console.log(sArray.join());

    for (let i = 0; i < sArray.length; i++) {
        answerString = answerString + sArray[i];
    }
    
    console.log(arr.join()); // Jani,Hege,Stale,Kai Jim,Borge
    arr.splice(2, 0, "Lene");
    console.log(arr.join()); // Jani,Hege,Lene,Stale,Kai Jim,Borge
    let n = "";
    for (let i = 0; i < intervals.length; i++) {
        console.log("[" + intervals[i][0] + "]" + "[" + intervals[i][1] + "]");
    }
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        console.log(currentChar)

    }
    
    //let intervalArray = []
    
    return answerString;
}


*/

/*

function createBoldString(s,intervals) {
    let n = "";
    let intervalArray = []
    
    //Create Single Array
    for (let i = 0; i < intervals.length; i++) {
        //console.log(intervals[i][0] + " " + intervals[i][1])
        intervalArray.push(intervals[i][0])
        intervalArray.push(intervals[i][1])
    }
    let open = true;
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        
        if(intervalArray.includes(i)) {
            if(open === true) {
                n = n + "<b>" + currentChar;
                open = false;
            } else {
                n = n + "</b>" + currentChar;
                open = true;
            }
            
        } else {
            n = n + currentChar;
        }
    }

    return n;
}
*/

//ANSWER

/*
for (let i = 0; i < answer.length; i++) {
    console.log("[" + answer[i][0] + "]" + "[" + answer[i][1] + "]");
}

*/

/*
function checkWord(s, currentWord) {
    var subArray = []
    for (let i = 0; i < s.length; i++) {
        let sChar = s.charAt(i);
        if(sChar == currentWord.charAt(0)) {
            let wordOne = currentWord
            let wordTwo = s.slice(i,i + wordOne.length)
            if(wordOne == wordTwo) {
                let start = i;
                let stop = i + wordOne.length
                let tempArray = [start, stop]
                subArray.push(tempArray)
                i = i + currentWord.length -1;
            }
        } 
    }
    return subArray;
}


*/
//const s = "hiyaoverthere";
//const stringArray = ["hi", "ya", "there"];

/*
const s = "ahiyah";
const stringArray = ["hi"];



checkWord(stringArray[0], s);

function checkWord(currentWord, s) {

    //WORD: Loop over the Chars in the String 
    for (let i = 0; i < s.length; i++) {
        let sChar = s.charAt(i);

        if(sChar == currentWord.charAt(0)) {
            let index = compareWords(s, currentWord, i);
        } 
    }
}

function compareWords(s, currentWord, startIndex) {
    const endIndex = currentWord.length + startIndex;
    const sWord = s.slice(startIndex, endIndex); 
    if(currentWord.toUpperCase() === sWord.toUpperCase()) {
        console.log(currentWord + " " + sWord + " are equal " + " index " + startIndex + " " + endIndex);
    } else {
        console.log(currentWord + " " + sWord + " are NOT equal");
    }
    return [startIndex, endIndex];
}

*/

//STRING: Loop over the String
/*
for (let j = 0; j < s.length; j++) {
    let stringChar = s.charAt(j);
    
    //They Match
    if(wordChar == stringChar) {
        console.log("MATCH- WORD: " + wordChar + " STRING: " + stringChar);
    } else {
        console.log("NOT A MATCH- WORD: " + wordChar + " STRING: " + stringChar);
    }
}  
*/



/*

let answer = boldString(s, stringArray);
 
for (let i = 0; i < answer.length; i++) {
    console.log(answer[i]);

}

function boldString(s, stringArray) {
    var wordIndex = [];
    for (let i = 0; i < stringArray.length; i++) {
        let currentWord = stringArray[i];

        //STRING:
        for (let i = 0; i < s.length; i++) {
            let stringChar = s.charAt(i);

            //WORD: Loop over see if the string is in the array
            for (let j = 0; j < currentWord.length; j++) {
                let wordChar = currentWord.charAt(j);
            
                if(wordChar == stringChar) {
                    console.log("Match " + wordChar + " " + stringChar + " " + i);
            
                    wordIndex.push(i);
                    break
                } else {
                 
                }
            } 
        }
    }
    return wordIndex;
    
}
*/
