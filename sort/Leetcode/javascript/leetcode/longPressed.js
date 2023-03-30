//const s = "aabaabc"
const s = "aaabcc"
//const realName = "alex"
//const typed = "aaleex"

const realName = "saeed"
const typed = "ssaaedd"

var answer = isLongPressedName(realName, typed)
 
console.log(answer);

function isLongPressedName(name, typed) {
    const nameMap = createLetterMap(name);
    const typedMap = createLetterMap(typed);

    nameMap.forEach(function (pair, index) {
        console.log(pair[0], pair[1]);
    });
    typedMap.forEach(function (pair, index) {
        console.log(pair[0], pair[1]);
    });

    if(nameMap.length != typedMap.length) {
        console.log("lengths don't match " + nameMap.length, typedMap.length)
        return false; 
    } else {
        console.log("Same length")
    }

    for (let i = 0; i < nameMap.length; i++) {
        console.log("letter " + nameMap[i][0], typedMap[i][0] + " Amount " + nameMap[i][1], typedMap[i][1])
        if(nameMap[i][0] != typedMap[i][0] || nameMap[i][1] > typedMap[i][1]) {
            return false;
        }
    }
    
    return true;
}

//Count in String 
function createLetterMap(s) {
    var charMap = []
    let previousChar = null;
    let currentChar = s.charAt(0);
    let currentCharCount = 1;
    
    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        if(i > 0) {
            previousChar = s.charAt(i-1);
        }

        if(currentChar == previousChar) {
            currentCharCount = currentCharCount + 1;
        } else {
            currentCharCount = 1;
        }
        
        if(currentChar != s.charAt(i + 1)) {
            charMap.push([currentChar, currentCharCount]);
        } 
    }    

    return charMap;
}

/*
answer.forEach(function (charArr, index) {
    console.log(charArr[0], charArr[1]);
});
*/

/*

//Count in String 
function createLetterMap(s) {
    const map1 = new Map();
    map1.set('a', 1);


    let charMap = []
    let previousChar = null;
    let currentChar;
    let currentCharCount = 0;

    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i); 
        if(i > 0) {
            previousChar = s.charAt(i - 1);
        }

        //Match 
        if(currentChar != previousChar) {
            let currentCharPair = {}
            console.log("no match " + currentCharCount)
            currentCharPair[currentChar] = currentCharCount
            console.log(currentCharPair)
            charMap.push(currentCharPair);
            currentCharCount = 1;

        //No Match  
        } else {
            currentCharCount = currentCharCount + 1;
            console.log("match " + currentCharCount)

        }
    }

    return charMap;

}

*/
/*
function countOccurencesInOrder(s) {
    var letterArray = {}
    previousChar = null;
    [{a:2, b:1, a:2, b:1, c:1 }]

    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);        
        let currentCharMap = {currentChar: 1}

        if(currentChar != previousChar) {
            let currentCount = currentCharMap[currentChar];
            currentCharMap[currentChar] = currentCount + 1;

        } else {
            currentCharMap= {}
        }
        previousChar = currentChar
        console.log(currentCharMap)

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