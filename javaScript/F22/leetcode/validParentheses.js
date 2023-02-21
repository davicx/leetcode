//const s = "[()}()()[]()";
//const s = "[()]{}";
const s = ")(){}";

const answer = isValid(s)
console.log(answer);


//console.log(removeMatch(s,2));

function isValid(s) {
    if(s.length < 2) {
        return false;
    }
    var search = true;
    let count = 0;
    
    while(s.length > 0 && count < 1000) {
        s = check(s, '(', ')');
        s = check(s, '[', ']');
        s = check(s, '{', '}');
        count ++;
    }
    console.log(s);
    
    if(s.length >= 1) {
        return false;
    } else {
        return true;
    }


}

function check(s, left, right) {
    for (let i = 0; i < s.length-1; i++) {
        if(s.charAt(i) == left && s.charAt(i + 1) == right) {
            //console.log("YES " + s.charAt(i) + " " + s.charAt(i + 1))
            s = removeMatch(s, i)
        } else {
            //console.log("NO " + s.charAt(i) + " " + s.charAt(i + 1))
        }
    }
    return s;
}


function removeMatch(s, start) {
    return s.substr(0, start) + s.substr(start+2);
}



/*
if(s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
    for (let i = 0; i < s.length; i++) {
      
        if(s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
            console.log("MATCH " + s.charAt(i) + " " + s.charAt(i + 1))
            //let firstPart = s.slice(0, i);
            //let secondPart = s.slice(startIndex, i + 1);
            //let newString = firstPart.concat(secondPart);
            console.log("test")
            return true;
            //return newString;
        } else {
            console.log("NO " + s.charAt(i) + " " + s.charAt(i + 1))            
        }
    }
*/


/*
checkCircle();
    checkSquare();
    checkBracket();

let newS = isValid(s);
console.log(newS)

function isValid(s) {
    for (let i = 0; i < s.length; i++) {
      
        if(s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
            console.log("MATCH " + s.charAt(i) + " " + s.charAt(i + 1))
            //let firstPart = s.slice(0, i);
            //let secondPart = s.slice(startIndex, i + 1);
            //let newString = firstPart.concat(secondPart);
            console.log("test")
            return true;
            //return newString;
        } else {
            console.log("NO " + s.charAt(i) + " " + s.charAt(i + 1))            
        }
    }

    
}

function stringRemove(s, startIndex, endIndex) { 
    let firstPart = s.slice(0, startIndex);
    let secondPart = s.slice(startIndex, endIndex);
    const newString = firstPart.concat(secondPart);

    return newString;
}
*/
/*
const s = "1234";
var sArray = ['[','(',')','}'];

function isValid(sArray) {
    for (let i = 0; i < sArray.length; i++) {
        if(sArray[i] == '(' && sArray[i+1] == ')')  {
            sArray.splice(i,2);
        } 
    }

    return sArray;

}

let answer = isValid(sArray);

for (let i = 0; i < answer.length; i++) {
    console.log(answer[i]);
}


*/