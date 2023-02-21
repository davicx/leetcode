//let d = ['3C','3D','4C','4D']

let a = ['1A','1B','2A','2B']
let b = ['1C','1D','2C','2D']
let c = ['3A','3B','4A','4B']
let d = ['3C','3D','4C','4D']

var board = [a,b,c,d]
let answer = checkSquares(board) 
console.log(answer)

function checkSquares(board) {
    const squareStep = 2;
    const squareSize = 4
    //var rowPosition = 0;
    //var columnPosition = 0;

    for(let i = 0; i < squareSize; i = i + squareStep) {
        for(let j = 0; j < squareSize; j =  j + squareStep) {
            let rowPosition = i;
            let columnPosition = j;    
            let currentAnswer = checkIndividualSquare(board, rowPosition, columnPosition)
            if(currentAnswer == false) {
                return false
            }
        }
    }

    return true;
}

function checkIndividualSquare(board, rowPosition, columnPosition) {
    const squareLength = 2;
    const squareHeight = 2;
    var mySet = new Set()
    
    for(let i = rowPosition; i < squareLength + rowPosition; i++) {
        for(let j = columnPosition; j < squareHeight + columnPosition; j++) {
            let currentValue = board[i][j]
            if(currentValue != '.') {
                if(mySet.has(currentValue)) {
                    //console.log("duplicate found " + i + " " + currentValue);
                    return false;
                } else {
                    mySet.add(currentValue)
                    //console.log("new! " + i + " " + currentValue);
                }
            }  
        }
    }    
     
    return true;
}


/*  var mySet = new Set()

    for(let i = 0; i < board.length; i++) {
        let num = board[i][column];
        if(num != '.') {
            if(mySet.has(num)) {
                return false;
                //console.log("duplicate found " + i + " " + num);
            } else {
                mySet.add(num)
                //console.log("new! " + i + " " + num);
            }
        }
        //console.log(board[i][column]);
    }
    return true;
*/

 