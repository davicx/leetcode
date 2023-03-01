//var s = "abbbba";
//var s = "abcde";
//var s = "cbbd"
//var s = "aaaa"
//var s = "aacabdkacaa"
//var s = "dabad"
var s = "abbcccbbbcaaccbababcbcabca"
//PART 1: Get Answer =
var answer = longestPalindrome(s);
console.log("ANSWER ");
console.log(answer);


function longestPalindrome(s) {
    const longestSingleSubstringArray = checkSingle(s) 
    const longestDoubleSubstringArray = checkDouble(s) 

    if(s.length == 1) {
        return s;
    }

    if(longestSingleSubstringArray[0] > longestDoubleSubstringArray[0]) {
        console.log("Single")
        console.log(longestSingleSubstringArray)
        return longestSingleSubstringArray[1]
    } else {
        console.log("Double")
        console.log(longestDoubleSubstringArray)
        return longestDoubleSubstringArray[1]
    }

}


//PART 2: Check Single
function checkSingle(s) {
    var longestSubstring = ""
    var maxStringLength = 0;

    for (let i = 0; i < s.length; i++) {
        let substring = s.substring(i, s.length)
        let currentStringOutput = checkRadiateSingle(i, s)

        if(currentStringOutput[0] > maxStringLength) {
            longestSubstring = currentStringOutput[1];
            maxStringLength = currentStringOutput[0];
        } 
        
    }
    
    return [maxStringLength, longestSubstring];

}

function checkRadiateSingle(startPoint, inputString) {
    let currentMaxStringLength = 0;
    let left = startPoint;
    let middle = startPoint;
    let right = startPoint;

    for(let i = startPoint; i < inputString.length; i++) {
        //console.log(inputString.charAt(left) + " | " + inputString.charAt(middle) + " | " + inputString.charAt(right))

        if(inputString.charAt(left) == inputString.charAt(right)) {
            if(i == startPoint) {
                currentMaxStringLength = currentMaxStringLength + 1
            } else {
                currentMaxStringLength = currentMaxStringLength + 2;
            }
        } else {
            break;
        }

        left = left - 1;
        right = right + 1;

        if(left < 0 || right > inputString.length) {
            break;
        }
    }
        //Get the String 
        let offset = Math.floor( currentMaxStringLength / 2);

        if(offset == 0) {
            localMaxSubstring = s.charAt(startPoint)
        } else {
            leftStringStart = startPoint - offset;
            rightStringStart = startPoint + offset + 1;
            //console.log(leftStringStart, rightStringStart)
            localMaxSubstring = inputString.substring(leftStringStart, rightStringStart);
        }

        return [currentMaxStringLength, localMaxSubstring];

}


//PART 3: Check Double 
function checkDouble(s) {
    var maxStringLength = 0
    var maxString = ""

    for (let i = 0; i < s.length; i++) {
        let substring = s.substring(i, s.length)
        let currentMaxArray = checkRadiateDouble(i, s);
        if(currentMaxArray[0] > maxStringLength) {
            maxStringLength = currentMaxArray[0];
            maxString = currentMaxArray[1];
        }
    }
    return [maxStringLength, maxString]

}


function checkRadiateDouble(startPoint, inputString) {
    var currentMax = 0;
    var maxSubstringLength = 0;
    var maxSubstring = ""

    let middleLeft = startPoint;
    let middleRight = startPoint + 1;
    let left = middleLeft;
    let right = middleRight;

    for (let i = startPoint; i < inputString.length; i++) {  
        //console.log("Left " + inputString.charAt(left) + " " +  " Middle " + inputString.charAt(middleLeft) + " " + inputString.charAt(middleRight) + " Right " + inputString.charAt(right))
        
        if(inputString.charAt(left) == inputString.charAt(right)) {
            maxSubstringLength = maxSubstringLength + 2;
            if(maxSubstringLength > currentMax) {
                //console.log(startPoint)

                //Get String
                offset = (maxSubstringLength - 2) / 2;
                //console.log(offset)
                if(offset == 0) {
                    //console.log(offset, "is at 0")
                    maxSubstring = inputString.substring(startPoint, startPoint + 2);
                } else {
                    //console.log(offset, "more then 0")
                    leftStringStart = startPoint - offset;
                    rightStringStart = startPoint + 2 + offset;
                    //console.log(leftStringStart, rightStringStart)
                    maxSubstring = inputString.substring(leftStringStart, rightStringStart);
                }
            }
        } else {
            break;
        }

        right = right + 1;
        left = left - 1;
        if(left < 0 || right > inputString.length){
            break
        }
    }

    return [maxSubstringLength, maxSubstring]
}

