//Two positive numbers as strings and return the sum of them
const string1 = "3.444"
//const string1 = "3.14"
const string2 = ".9"
addStrings(string1, string2);

function addStrings(string1, string2) {
    const s1Number = string1.split(".")[0];
    const s1DecimalRaw = string1.split(".")[1];
    const s2Number = string2.split(".")[0];
    const s2DecimalRaw = string2.split(".")[1];

    let decimals = padDecimal(s1DecimalRaw, s2DecimalRaw) 
    const s1Decimal = decimals[0];
    const s2Decimal = decimals[1];
    //addDecimals(s1Decimal, s2Decimal)
    console.log(decimals[0]);
    console.log(decimals[1]);

    for (let i = s1Decimal.length; i >= 0; i--) {
        let s1Num = s1Decimal.charAt(i);
        let s2Num = s2Decimal.charAt(i);
        console.log([i] + " " + s1Num  + " " + s2Num);
 
    }

}

/*
function addDecimals(s1Decimal, s2Decimal) {
    for (let i = s1Decimal.length; i >= 0; i++) {
        let currentNum = s1Decimal.charAt(i);
        console.log(currentNum);
    }
}
*/
 
function padDecimal(s1Decimal, s2Decimal) {
    const s1Length = s1Decimal.length;
    const s2Length = s2Decimal.length;

    if(s1Length == s2Length) {
        return [s1Decimal, s2Decimal]

    } else if(s1Length < s2Length) {
        //console.log("else if ");
        let paddingSize = s2Length - s1Length;
        //console.log("padding size " + paddingSize)
        var padding = "";

        for (let i = 0; i < paddingSize; i++) {
            //console.log("padding loop")
            padding = padding + "0";
        }     
        //console.log("padding " + padding)
        let newS1 = s1Decimal + padding;
        
        return [newS1, s2Decimal];

    } else {
        //console.log("else ");
        let paddingSize = s1Length - s2Length;
        //console.log("padding size " + paddingSize)
        var padding = "";

        for (let i = 0; i < paddingSize; i++) {
            //console.log("padding loop")
            padding = padding + "0";
        }     
        //console.log("padding " + padding)
        let newS2 = s2Decimal + padding;
        
        return [s1Decimal, newS2];
    }
}