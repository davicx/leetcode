const s = "aabccc"


reorganizeString(s)

function reorganizeString(s) {
    let letterMap = {}
    let newString = {}
    letterMap = countOccurences(s)   
    for (var char in letterMap) {
        if (letterMap.hasOwnProperty(char)) {
            console.log("Char: " + char + " " + letterMap[char]);
        }
    } 

    letterMap['a'] = 1
    //letterMap['b'] = 2
    delete letterMap['b']
    letterMap['c'] = 2

    console.log("_____________")

    for (var char in letterMap) {
        if (letterMap.hasOwnProperty(char)) {
            console.log("Char: " + char + " " + letterMap[char]);
        }
    }

    delete letterMap['a']
    console.log(isEmpty(letterMap)) 
    delete letterMap['c']
    console.log(isEmpty(letterMap)) 
    
    function isEmpty(obj) {
        return Object.keys(obj).length === 0;
    }

    /*

    for (var char in letterMap) {
        if (letterMap.hasOwnProperty(char)) {
            let currentCharCount = letterMap[char]
            if(currentCharCount == 1) {

            } else {
                currentCharCount

            }
            //console.log("Char: " + char + " " + letterMap[char]);
        }
      } 
      */

};




//Count in String 
function countOccurences(s) {
    var letterMap = {}

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
