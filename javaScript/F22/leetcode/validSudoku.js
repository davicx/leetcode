//let a = ['1','1','7','.']
//let b = ['1','1','7','.']
//let c = ['.','.','2','.']
//let d = ['.','.','7','.']

//let a = ['1A','1B','2A','2B']
//let b = ['1A','1D','2C','2D']
//let c = ['3A','3B','4A','4B']
//let d = ['3C','3D','4C','4D']

let a = ['1A','1B','2A','2B']
let b = ['1C','1D','2C','2D']
let c = ['3A','3B','4A','4B']
let d = ['3C','3D','4C','4D']

var board = [a,b,c,d]
const answer = isValidSudoku(board)
console.log("ANSWER " + answer);

function isValidSudoku(board) {
    let squareAnswer = checkAllSquares(board);
    let acrossAnswer = checkAllAcross(board);
    let downAnswer = checkAllDown(board);
    console.log("SQUARE " + squareAnswer);
    console.log("ACROSS " + acrossAnswer);
    console.log("DOWN " + downAnswer);
    console.log();

    for(let i = 0; i < squareAnswer.length; i++) {
        if(!squareAnswer[i]) {
            console.log("false");
            return false;
        }
    }
 
    for(let i = 0; i < acrossAnswer.length; i++) {
        if(!acrossAnswer[i]) {
            console.log("false");
            return false;
        }
    }
 
    for(let i = 0; i < downAnswer.length; i++) {
        if(!downAnswer[i]) {
            console.log("false");
            return false;
        }
    }
 
    return true;

}


//CHECK ALL SQUARES
function checkAllSquares(board) {
    var squareAnswer = [];
    //console.log(squareAnswer);
    let step = 2;
    const gridSize = 2;
    
    //This checks all the squares
    for(let i = 0; i < step * gridSize; i = i + step) {
        for(let j = 0; j < step * gridSize; j = j + step) {
            //console.log(i + " " + j);      
            let squareValid = checkSquare(board, i, j, gridSize);
            squareAnswer.push(squareValid);
            //console.log(squareValid);
        }
    }    

    return squareAnswer;
}

function checkSquare(board, column, row, gridSize) {
    var mySet = new Set()
    let columnStop = column + gridSize;
    let rowStop = row + gridSize;

    //Check Upper Left Grid
    //console.log("_______________");   
    for(let i = column; i < columnStop; i++) {
        for(let j = row; j < rowStop; j++) {
            //console.log(i + " " + j + " " + board[i][j]);  

            //Check for Unique Value
            if(board[i][j] != '.') {             
                if(mySet.has(board[i][j])) {
                    return false;
                } else {
                    mySet.add(board[i][j])     
                }
            }
        }
    }    
     
    return true;
}

//CHECK: All Across
function checkAllAcross(board) {
    var allAcross = [];
    for(let i = 0; i < board.length; i++) {
        let across = checkAcross(board, i);
        allAcross.push(across);
        //console.log("Across for row " + i + " " + across);
    }
    return allAcross;
}

//CHECK: All Down
function checkAllDown(board) {
    var allDown = [];
    for(let i = 0; i < board[0].length; i++) {
        let down = checkDown(board, i);
        allDown.push(down);
        //console.log("Down for column " + i + " " + down);
    }
    return allDown;
}

//CHECK: Check across the board 
function checkAcross(board, row_index) {
    const row = board[row_index];
    var mySet = new Set()

    for(let i = 0; i < row.length; i++) {
        let num = row[i];
        if(num != '.') {
            if(mySet.has(num)) {
                //console.log("duplicate found " + i + " " + num);
                return false;
            } else {
                mySet.add(num)
                //console.log("new! " + i + " " + num);
            }
        }

        //console.log(row[i]);
    }
    return true;
}

//CHECK: Check down the board 
function checkDown(board, column) {
    var mySet = new Set()

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
}







//checkSquare(board, column, row, gridSize);
//WORKS 
/*
var column = 0;
var row = 0;
const gridSize = 2;

checkSquare(board, column, row, gridSize);

function checkSquare(board, column, row, gridSize) {
    let columnStop = column + gridSize;
    let rowStop = row + gridSize;
    
    //Check Upper Left Grid
    for(let i = column; i < columnStop; i++) {
        for(let j = row; j < rowStop; j++) {
            console.log(i + " " + j + " " + board[i][j]);                
        }
    }    
    console.log("_______________");    
}
*/

/*
var acrossStop = 0;
var downStop = 0;

//checkSquare(board, acrossStart, downStart, step);

function checkSquare(board, acrossStart, downStart, step) {
    acrossStop = acrossStart + step;
    downStop = downStart + step;

    for(let i = acrossStart; i < acrossStop; i++) {
        for(let j = downStart; j < downStop; j++) {
            console.log(i + " " + j + " " + board[i][j]);            
        }
        return true;
    }
}
*/

/*

//1A
console.log(board[0][0]);     
  
//1D
console.log(board[1][1]);     

//2A
console.log(board[0][2]);     

//2D
console.log(board[1][3]);     
*/


/*
function checkSquare(board, acrossStart, downStart, step) {
    var mySet = new Set()
    acrossStop = acrossStart + step;
    downStop = downStart + step;

    for(let i = acrossStart; i < acrossStop; i++) {
        for(let j = downStart; j < downStop; j++) {
            //console.log(i + " " + j + " " + board[i][j]);
            
            let num = board[i][j];
            if(num != '.') {
                if(mySet.has(num)) {
                    //console.log("duplicate found " + i + " " + num);
                    return false;
                } else {
                    mySet.add(num)
                    //console.log("new! " + i + " " + num);
                }
            }
            
        }
        return true;
    }
}
*/

//CHECK: Check Squares


/*
    var acrossStart = 0;
    var downStart = 0;
    var acrossStop = 0;
    var downStop = 0;
    const step = 2;

    //CHECK: All Squares
    var currentOutcome = "";
    for(let i = 0; i < 4; i = i + step) {
        acrossStart = acrossStart + i;
        for(let j = 0; j < 4; j = j + step) {
            downStart = downStart + j;
            currentOutcome = checkSquare(board, i, j, step);
            console.log("Square " + currentOutcome);
            //console.log("_________");
        }
    }

*/






/*
//CHECK: All Across
//let across = checkAcross(board, 0);
//let down = checkDown(board, 1)

for(let i = 0; i < board.length; i++) {
    let across = checkAcross(board, i);
    //console.log(across);
}

//CHECK: All Down
for(let i = 0; i < board[0].length; i++) {
    let down = checkDown(board, i)
    //console.log(down);
}
*/


/*
//WORKS
function checkSquare(board, acrossStart, downStart, step) {
    var mySet = new Set()
    acrossStop = acrossStart + step;
    downStop = downStart + step;

    for(let i = acrossStart; i < acrossStop; i++) {
        for(let j = downStart; j < downStop; j++) {
            console.log(i + " " + j + " " + board[i][j]);
        }
    }
}
*/



/*
function printAcross(board, row_index) {
    const row = board[row_index];
    var mySet = new Set()

    for(let i = 0; i < row.length; i++) {
        let num = row[i];
        if(mySet.has(num)) {
            console.log("duplicate found " + i + " " + num);
        } else {
            mySet.add(num)
            console.log("new! " + i + " " + num);
        }
        //console.log(row[i]);
    }
}

function printDown(board, column) {
    var mySet = new Set()

    for(let i = 0; i < board.length; i++) {
        let num = board[i][column];
        if(mySet.has(num)) {
            console.log("duplicate found " + i + " " + num);
        } else {
            mySet.add(num)
            console.log("new! " + i + " " + num);
        }
        console.log(mySet)
        //console.log(board[i][column]);
    }
}

*/
