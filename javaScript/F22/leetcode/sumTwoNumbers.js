const numOne = "14.1111"
const numTwo = "2.22"

function padNumbers(numOne, numTwo) {
    var num1 = numOne
    var num2 = numTwo
    const num1Arr = num1.split(".");
    const num2Arr = num2.split(".");
    let num1Decimal = num1Arr[1];
    let num2Decimal = num2Arr[1];
    let num1Length = num1Decimal.length
    let num2Length = num2Decimal.length    
    var difference = 0;

    if(num1Length > num2Length) {
        difference = num1Length - num2Length
        let num2Padded = num2;

        for(let i = num1.length; i < num1.length + difference; i++) {
            num2Padded = num2Padded + "0"
        }
        return [num1, num2Padded]

    } else if(num1Length < num2Length) {
        difference = num2Length - num1Length
        let num1Padded = num1;

        for(let i = num2.length; i < num2.length + difference; i++) {
            num1Padded = num1Padded + "0"
        }
        
        return [num1Padded, num2]    

    } else {
        return [num1, num2]
    }
}

let newNumberArray = padNumbers(numOne, numTwo)
console.log("Answer")
console.log(newNumberArray)