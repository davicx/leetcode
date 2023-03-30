const s = "aab"
const words = ["david", "frodo", "david"]

var answerMap = {}
//answerMap = countChars(s)
answerMap = countWords(words)
//console.log(answerMap)

var wordMap = {
    "david": 2,
    "frodo": 1,
    "sam": 3
}

console.log(wordMap["sam"]);

//Type 1: Count in String 
function countChars(s) {
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

//Type 2: Count Words
function countWords(words) {
    var wordMap = {}

    for (let i = 0; i < words.length; i++) {
        currentWord = words[i];
        if(wordMap.hasOwnProperty(currentWord)) {
            let currentCount = wordMap[currentWord];
            wordMap[currentWord] = currentCount + 1;
        } else {
            wordMap[currentWord] = 1;
        }
    }    
    return wordMap;
};
