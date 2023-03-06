var name = "alex"
var typed = "aaleex"
//var name = "saeed"
//var typed = "ssaaedd"
//var name = "alex"
//var typed = "aaleexa"
//var name = "vtkgn"
//var typed = "vttkgnn"
//var name = "leelee"
//var typed = "lleeelee"

let answer = isLongPressedName(name, typed) 
console.log(answer);

function isLongPressedName(name, typed) {
    let namePointer = 0;
    let typedPointer = 0;

    while(namePointer < name.length || typedPointer < typed.length) {
        
        //Case 1: They Match (Move both forward)
        if(name.charAt(namePointer) == typed.charAt(typedPointer)) {
            console.log("Case 1: " + name.charAt(namePointer) + " " + typed.charAt(typedPointer))
        
            namePointer = namePointer + 1;
            typedPointer = typedPointer + 1;   
       
        //Case 2: They Don't match but the typed is the same as the previous name (keep moving typed pointer)    
        } else if (typed.charAt(typedPointer) != name.charAt(namePointer) && typed.charAt(typedPointer) == name.charAt(namePointer - 1)) {
            console.log("Case 2: " + name.charAt(namePointer) + " != " + typed.charAt(typedPointer) + " but " + typed.charAt(typedPointer) + " == " + name.charAt(namePointer - 1))
            typedPointer = typedPointer + 1; 

        //Case 3: They don't match. typed letter does not equal current name char or previous name char (break)
        } else {
            console.log("Case 3: " + name.charAt(namePointer) + " != " + typed.charAt(typedPointer))
            return false;
        }
    }
    
    return true;

}

/*
if(name.charAt(namePointer) == typed.charAt(typedPointer)) {
            namePointer = namePointer + 1;
            typedPointer = typedPointer + 1;   

            while(typed.charAt(typedPointer) == name.charAt(namePointer - 1)) {
                typedPointer = typedPointer + 1;
            }

        } else {
            return false;
        }
*/


//WORKS
/*
function isLongPressedName(name, typed) {
    let nameMap = countCharsArray(name)
    let typedMap = countCharsArray(typed)
    

    for (let i = 0; i < nameMap.length; i++) {
        console.log(nameMap[i][0], nameMap[i][1])
    }
 
    console.log("      ");
    for (let i = 0; i < typedMap.length; i++) {
        console.log(typedMap[i][0], typedMap[i][1])
    }
    console.log("      ");

    if(nameMap.length != typedMap.length ) {
        return false;
    }

    for (let i = 0; i < nameMap.length; i++) {
        if(typedMap[i][0] != nameMap[i][0] || nameMap[i][1] > typedMap[i][1]){
            return false;   
        }
    }
    
    return true;

}   

function countCharsArray(nameString) {
    let leftPointer = 0;
    let rightPointer = 0;
    let count = 0;
    let nameArray = []

    for (let i = 0; i < nameString.length; i++) {
        rightPointer = i
        //console.log(nameString.charAt(i))

        if(nameString.charAt(leftPointer) == nameString.charAt(rightPointer)) {
            //console.log("same")
            count = count + 1;

        } else {
            nameArray.push([nameString.charAt(leftPointer), count])
            //console.log("no same move")
            count = 1
            leftPointer = i;
        }
        if(i == nameString.length - 1) {
            nameArray.push([nameString.charAt(leftPointer), count])
        }
        //console.log(nameString.charAt(leftPointer) + " " + nameString.charAt(rightPointer))

    }

    return nameArray;
}
*/


//ANSWER 1: Doesn't work because the map adds all A
/*
var theName = "alex"
var typed = "aaleexa"
let answer = isLongPressedName(theName, typed) 
console.log("Answer: " + answer) 

function isLongPressedName(name, typed) {
    let nameMap = countChars(name)
    let typedMap = countChars(typed)

    console.log(nameMap);
    console.log(typedMap);

    let nameString = ""
    let typedString = ""

    //Check Letter 
    for (const letter in nameMap) {
        if (nameMap.hasOwnProperty(letter)) {
            nameString = nameString + letter;        }
    }

    for (const letter in typedMap) {
        if (typedMap.hasOwnProperty(letter)) {
            typedString = typedString + letter;        }
    }

    console.log(nameString);
    console.log(typedString);

    //Check Count 
    let nameCount = [];

    for (var count in nameMap) {
        if (nameMap.hasOwnProperty(count)) {
            //console.log(count + " " + nameMap[count]);
            nameCount.push(nameMap[count])
        }
    } 

    let typedCount = [];
 
    for (var count in typedMap) {
        if (typedMap.hasOwnProperty(count)) {
            //console.log(count + " " + nameMap[count]);
            typedCount.push(typedMap[count])
        }
    }    
    
    console.log(nameCount)
    console.log(typedCount)

    if(nameCount.length != typedCount.length) {
        console.log("nameCount.length != typedCount")
        return false;
    }
   
    if(nameString === typedString) {
        for (let i = 0; i < nameCount.length; i++) {
            if(nameCount[i] > typedCount[i]) {
                return false;
            } 
        }

        return true;

    } else {
        return false;
    }
}



function countChars(s) {
    var letterMap = new Map()

    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);

        if(letterMap.hasOwnProperty(currentChar)) {
            let currentCount = letterMap[currentChar];
            letterMap[currentChar] = currentCount + 1;
        } else {
            letterMap[currentChar] = 1;
        }
    }    
    return letterMap;
};

*/