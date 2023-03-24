//var s = "Hello World"
var s = "   fly me   to   the moon  "


let answer = lengthOfLastWord(s) 
console.log(answer);

function lengthOfLastWord(s) {
    s = s.trim()
    let wordsArray = []
    let tempWord = ""
    console.log(s)

    //Create words array 
    for (let i = 0; i < s.length; i++) {   
        if(s.charAt(i) == " ") {
            wordsArray.push(tempWord);
            tempWord = "";
        } else {
            tempWord = tempWord + s.charAt(i);
        }
    }
    wordsArray.push(tempWord);
    tempWord = "";

    //Count Last word
    let lastWord = wordsArray[wordsArray.length - 1]

    return lastWord.length
}   


/*
    let namePointer = 0;
    let typedPointer = 0;

    while(namePointer < name.length || typedPointer < typed.length) {
        
        //Case 1: They Match (Move both forward)
        if(name.charAt(namePointer) == typed.charAt(typedPointer)) {
            console.log("Case 1: " + name.charAt(namePointer) + " " + typed.charAt(typedPointer))
        }
    }

    for (let i = 0; i < nums.length; i++) {
        if(i == 0) {
        }
    }
*/