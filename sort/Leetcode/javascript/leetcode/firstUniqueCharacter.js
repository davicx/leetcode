const s = "leetcode";

const answer = firstUniqChar(s);
console.log(answer);

function firstUniqChar(s) {
    var charMap = {}
    let currentChar; 

    for(let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        if(charMap.hasOwnProperty(currentChar)) {
            //console.log("has");
            let currentCount = charMap[currentChar];
            charMap[currentChar] = currentCount + 1;
        } else {
            charMap[currentChar] = 1;
            //console.log("no");
        }
    }
    let valueFound = -1;

    for(let i = 0; i < s.length; i++) {
        let currentChar = s.charAt(i);
        let value = charMap[currentChar];
        if (value == 1) {
            valueFound = currentChar;
            return valueFound;
        }
        console.log(currentChar + " " + value);
    }
    return valueFound;

};

/*
const mySet1 = new Set()

mySet1.add(1)           
mySet1.add(5)           
mySet1.add(5)           

mySet1.has(1)              
mySet1.size         
*/


/*
function firstUniqChar(s) {
    var charMap = {}
    let currentChar; 

    for (let i = 0; i < s.length; i++) {
        currentChar = s.charAt(i);
        if(charMap.hasOwnProperty(currentChar)) {
            console.log("has");
            let currentCount = charMap[currentChar];
            charMap[currentChar] = currentCount + 1;
        } else {
            charMap[currentChar] = 1;
            console.log("no");
        }
    }
    for (var key in charMap) {
        if (charMap.hasOwnProperty(key)) {
            console.log(key + " " + charMap[key]);
        }
    } 
};
*/