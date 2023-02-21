//const s = "abcdba"
//const s = "abcba"
//const s = "abc @ $ cba"
//const s = "A man, a plan, a canal: Panama";
const s = "ab_a"

let answer = isPalindrome(s)
console.log(answer);

function isPalindrome(s) {
    if(s.length == 0) {
        return false;
    }

    s = s.replace(/\W/g, '');
    s = s.toLowerCase();
    s = s.replace(/_/g, "");
    let j = s.length - 1;

    console.log(s);
    for (let i = 0; i < s.length; i++) {
        if(i >= j) {
            break;
        }        
        leftChar = s.charAt(i);
        rightChar = s.charAt(j);
        console.log(i + " " + j);
        console.log(leftChar + " " + rightChar);
        if(leftChar !== rightChar) {
            return false;
        }
        j--;
    }
   return true;   
}; 