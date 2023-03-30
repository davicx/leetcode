//let rightName = "alex";
let rightName = "12345";
let typed = "aaleex"

isLongPressedName(rightName)

function isLongPressedName(rightName) {
    let currentChar;
    let previousChar;

    for (let i = 0; i < rightName.length; i++) {
        currentChar = rightName.charAt(i);
        if(i > 0) {
            previousChar = rightName.charAt(i - 1);
        } else {
             previousChar = null;
        }

        console.log(previousChar + " " + currentChar);

    }

};


 