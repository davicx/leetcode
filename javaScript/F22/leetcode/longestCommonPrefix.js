strs = ["flower","flow","flight"]

let answer = longestCommonPrefix(strs);
console.log(answer);

function longestCommonPrefix() {
    if(strs.length == 0) {
        return "";
    }
    
    let charPosition = 0;
    var charSet = new Set();
    var prefixLength = 0;
    var smallestLength = Math.min(...strs.map(({ length }) => length));
        
    while(charPosition < smallestLength) {
        for (let i = 0; i < strs.length; i++) {
            charSet.add(strs[i].charAt(charPosition))
        }
        if(charSet.size == 1) {
            prefixLength++;
            //console.log("ok");
        } else {
            return strs[0].substring(0, prefixLength);
            //console.log("nope ");
        }
        charSet.clear();
        charPosition = charPosition + 1;
    }
    return strs[0].substring(0, prefixLength);
}
