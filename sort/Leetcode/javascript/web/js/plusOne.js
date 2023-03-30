const digits = [9,9,9]
//const digits = [1,2,3]
//const digits = [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]

let answer = plusOne(digits);

function plusOne(digits) {
    var stack = [];
    let carry = 1;

    for (let i = digits.length-1; i >= 0; i--) {
        let newNumber = digits[i] + carry;
  
        if(newNumber > 9) { 
            stack.unshift(0);
            carry = 1;
        } else {
            stack.unshift(newNumber);
            carry = 0;
        }
        
        if (i == 0 && carry == 1) { 
            stack.unshift(1);
        }
    }

    return stack;

}


for (let i = 0; i < answer.length; i++) {
    console.log(i + " is " + answer[i]);
}

/*

function plusOne(digits) {
    var answer = []
    for (let i = 0; i < digits.length; i++) {
        //console.log(digits[i]);     
        answer.push(digits[i]);
        
        if(i == digits.length - 1) {
            console.log("this is the last loop " + digits[i])
            if(digits[i] === 9) {
                answer.push(1);
            }
        }
        

   }

    for (let i = digits.length-1; i >= 0; i--) {
         console.log(digits[i]);
    }
    

    return answer;
}


*/



function plusOneNumToBig(digits) {
    var numString = "";
    var num;
    var answer = [];

    for (let i = 0; i < digits.length; i++) {
        numString = numString + digits[i];
        //console.log(digits[i]);
    }
    //console.log(numString)
    
    //6145390195186705543
    //6145390195186705000

    num = parseInt("6145390195186705543");
    console.log(num)
    num = num + 1;
    numString = num.toString();

    for (let i = 0; i < numString.length; i++) {
        answer[i] = numString.charAt(i);
    }

    return answer;
}





