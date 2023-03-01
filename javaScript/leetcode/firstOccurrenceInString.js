var haystack = "sadbutsad"
var needle = "sad"

let answer = strStr(haystack, needle)

console.log(answer);

function strStr(haystack, needle) {
    let needleLength = needle.length;
    let currentSubstring = ""

    for (let i = 0; i < haystack.length; i++) {
        currentSubstring = haystack.substring(i, i + needleLength);
        if(currentSubstring.length < needleLength) {
            break;
        }
        if(currentSubstring.localeCompare(needle) == 0) {
            return i;
        }
    }
    return -1
}


//

