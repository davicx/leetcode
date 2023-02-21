//const s = "))()())()())(((()"
//const s = "((()"
const s = ")(()()"
//const s = ")("

let answer = longestValidParentheses(s) 
console.log("answer " + answer);

function longestValidParentheses(s) {
    var maxCount = 0;
    var stack = [s.charAt(0)];
    var stackTop ;

    for (let i = 1; i < s.length; i++) {
        currentChar = s.charAt(i);

        if(stack.length == 0) {
            stackTop = '*';
        } else {
            stackTop = stack[stack.length - 1];
        }

        if(currentChar == '(' && stackTop == ')' || currentChar == ')' && stackTop == '(') {
            stack.push(currentChar);
        } else if (currentChar == '(' && stackTop == '(' || currentChar == '(' && stackTop == '*') {   
            stack = [];
          
            
            stack.push(currentChar);
        } else if (currentChar == ')' && stackTop == ')' || currentChar == ')' && stackTop == '*') {
            stack = [];    
            stack.push(currentChar); 

        } else {
            console.log('error');
        }

        maxCount = Math.max(maxCount, stack.length);
        console.log(stack);
        
        
        console.log("MAX " + maxCount + " " + i + " " +stackTop + " " + currentChar + " " + stack.length);
    }

    if(stack.length == 2) {
        if(stack[0] == '(' && stack[1] == ')') {
            return 2;
        } else {
            return 0;
        }


    } else if (maxCount % 2 != 0) {
        return maxCount - 1;
    } else {
        return maxCount;
    }


};

/*
    stack.push('(')
    stack.push(')')
    console.log(stack.length)
    
    console.log(stackTop)
*/
/*
if(s.charAt(i) == left && s.charAt(i + 1) == right) {
    //console.log("YES " + s.charAt(i) + " " + s.charAt(i + 1))
    s = removeMatch(s, i)
} else {
    //console.log("NO " + s.charAt(i) + " " + s.charAt(i + 1))
}
*/