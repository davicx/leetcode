//var num1 = '1119'
//var num2 = '123'

//var num1 = "9"
//var num2 = "9"

var num1 = "123456789";
var num2 = "987654321";

let answer = addStrings(num1, num2);
console.log(123456789 + 987654321)
console.log(answer)

function addStrings(num1, num2) {
    const maxLength = Math.max(num1.length,num2.length);
    var remainder = 0
    var answer = '';

    num1 = num1.padStart(maxLength, '0')
    num2 = num2.padStart(maxLength, '0')
 
    for (let i = maxLength - 1; i >= 0; i--) {
        num1Int = parseInt(num1.charAt(i));
        num2Int = parseInt(num2.charAt(i));   
        currentSum = num1Int + num2Int + remainder;
        
        remainder = Math.floor(currentSum / 10);
        currentNum = (currentSum % 10);

        currentChar = currentNum.toString();
        remainderChar = remainder.toString();

        answer = answer + currentChar;

        if(i == 0 && remainder == 1) {
            answer = answer + '1'
        }
        //console.log(answer);

    }
    return answer.split("").reverse().join("");
 
}

/*
if(i == 0 && remainder == 1) {
    answerArr.push(remainder)
}
if(currentSum >= 10) {
    answerArr.push(currentSum % 10)
    remainder = 1;
} else {
    answerArr.push(currentSum)
    remainder = 0;
}
*/

 
/*
for (let i = 0; i < s.length; i++) {
    currentChar = s.charAt(i);
}
*/

/*
function addStrings(num1, num2) {
    let num = 12;

    console.log(22 % 10)
    console.log(Math.max(4,5))
    console.log( Math.floor(39 / 10))

}
function addStrings(num1, num2) {
    let answerArr =[];

    let arrays = createArrays(num1, num2);
    let arr1 = arrays[0]
    let arr2 = arrays[1]
    var currentSum = 0;
    var remainder = 0;

    for (let i = arr1.length - 1; i >= 0; i--) {
        
        currentNum1 = parseInt(arr1[i]);
        currentNum2 = parseInt(arr2[i]);
        currentSum = currentNum1 + currentNum2 + remainder;
        
        if(currentSum >= 10) {
            answerArr.push(currentSum % 10)
            remainder = 1;
        } else {
            answerArr.push(currentSum)
            remainder = 0;
        }
        
        console.log(currentSum + " " + remainder)

        if(i == 0 && remainder == 1) {
            answerArr.push(remainder)
        }
        
    }

    answerArr.reverse()
    let answer = "";
    for (let i = 0; i < answerArr.length; i++) {
        answer = answer + answerArr[i]
    }

    return answer;
};

function createArrays(num1, num2) {
    let arr1 = []
    let arr2 = []
 
    for (let i = 0; i < num1.length; i++) {
        currentNum = num1.charAt(i);
        arr1.push(currentNum)
    }

    for (let i = 0; i < num2.length; i++) {
        currentNum = num2.charAt(i);
        arr2.push(currentNum)
    }

    if(num1.length > num2.length) {
        const numDiff = num1.length - num2.length;
        for (let i = 0; i < numDiff; i++) {
            arr2.unshift('0');
        }    
    } else {
        const numDiff = num2.length - num1.length;     
        for (let i = 0; i < numDiff; i++) {
            arr1.unshift('0');
        }    
    }

    return [arr1, arr2]

}

*/