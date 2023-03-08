//Input: s = "babad"
var s = "aaaaaabeggggggggggggg";
var answer = longestPalindrome(s)

console.log("ANSWER " + answer);

function longestPalindrome(s) {
    if(s.length == 1) {
        return s;
    }

    if(s.length == 2) {
        if(s.charAt(0) == s.charAt(1)) {
            return s
        } else {
            return s.charAt(0);
        }
    }

    const longestSingle = checkSingle(s) 
    const longestDouble = checkDouble(s) 

    return Math.max(longestSingle, longestDouble);

}

function checkSingle(s) {
    var longestS = 0

    for (let i = 0; i < s.length; i++) {
        if(Math.max(checkRadiateSingle(i, s), longestS))
        longestS = Math.max(checkRadiateSingle(i, s), longestS);
        console.log(longestS)
    }
    return longestS;
}

function checkDouble(s) {
    var longestS = 0

    for (let i = 0; i < s.length; i++) {
        longestS = Math.max(checkRadiateDouble(i, s), longestS);
    }
    return longestS;
}

function checkRadiateDouble(startPoint, inputString) {
    var longestDoublePalindrome = 0;
    let middleLeft = startPoint;
    let middleRight = startPoint + 1;
    
    if(middleLeft < 0 || middleRight > inputString.length - 1) {
        console.log("Out of bounds")
        return 0;
    }

    let left = middleLeft;
    let right = middleRight;

    if(s.charAt(middleLeft) == s.charAt(middleRight)) {
        longestDoublePalindrome = longestDoublePalindrome + 2;
        for (let i = startPoint; i < inputString.length; i++) {
            left = left - 1;
            right = right + 1;
    
            if(left < 0 || right > inputString.length - 1) {
                break;
            }

            //Check if left and right match;
            if(s.charAt(left) == s.charAt(right)) {
                console.log(s.charAt(middleLeft), s.charAt(middleRight))
                console.log(s.charAt(middleLeft), s.charAt(middleRight))
                longestDoublePalindrome = longestDoublePalindrome + 2;
            } else {
                return longestDoublePalindrome;
            }
    
            console.log(left + " " + middleLeft, middleRight + " " + right);
    
        }    
    } else {
         return longestDoublePalindrome;
    }

    return longestDoublePalindrome;
}

function checkRadiateSingle(startPoint, inputString) {
    var longestS = 1;
    let left = startPoint;
    let middle = startPoint;
    let right = startPoint;

    for (let i = startPoint; i < s.length; i++) {
        left = left - 1;
        
        if(left < 0) {
            break;
        }
        right = right + 1;

        if(right > 4) {
            break;
        }
        
        if(inputString.charAt(left) == inputString.charAt(right)) {
            longestS = longestS + 2;
        } else {
            return longestS
        }

        //console.log(inputString.charAt(left), inputString.charAt(middle),inputString.charAt(right))
    }

    return longestS;

}
