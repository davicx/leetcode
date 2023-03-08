var n = 121


console.log(isPalindrome(n))


function isPalindrome(n) {
    let s = n.toString()
    let length = s.length;
    
    if(length < 2){
        return true;
    }

    if(isEven(length) == true){
        return checkEven(s)
    } else {
        return checkOdd(s)      
    }
} 

function checkEven(s) {
    console.log("check even")
    var half = s.length / 2;

    for (let i = 0; i < half; i++) {
        let leftPointer = i;
        let rightPointer = s.length - 1 - i;
        //console.log(leftPointer + " " + rightPointer)
        if (s.charAt(leftPointer) !== s.charAt(rightPointer)) {
            return false
        }
    }
    return true

} 

function checkOdd(s) {
    console.log("check odd")
    var half = (s.length - 1) / 2;

    for (let i = 0; i < half; i++) {
        let leftPointer = i;
        let rightPointer = s.length - 1 - i;
        console.log(s.charAt(leftPointer) + " " + s.charAt(rightPointer))
        //console.log(leftPointer + " " + rightPointer)
        //console.log(leftPointer + " " + rightPointer)
        if (s.charAt(leftPointer) !== s.charAt(rightPointer)) {
            return false
        }
        
    }
    return true
} 


function isEven(n) {
    return n % 2 == 0;
}
 

