//const s = ["h","e","l","l","o","s"];
//const s = ["H","a","n","n","a","h"];
const s = ["a"]


let answer = reverseString(s);

function reverseString(s) {
    const swaps = Math.floor(s.length / 2);
    var left = 0;
    var right = s.length-1;

    for(let i = 0; i < swaps; i++) {
        //console.log(left + " " + right);
        let tempChar = s[right];
        s[right] = s[left];
        s[left] = tempChar;
        //console.log(s);
        left = left + 1;
        right = right - 1;

    }
    
    return s;
}

for (let i = 0; i < answer.length; i++) {
    console.log(answer[i]);
}

//New Array
/*
function reverseString(s) {
    let reversedString = [];
    for (let i = s.length-1; i >=0; i--) {
        //console.log(s[i]);
        reversedString.push(s[i])
    }

    return reversedString;
    
}
*/
