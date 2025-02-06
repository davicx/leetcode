//let a = ['a1','a2','a3','a4']
//let b = ['b1','b2','b3','b4']
//let c = ['c1','c2','c3','c4']
//let d = ['d1','d2','d3','d4']

let a = ['-','-','-','-']
let b = ['-','-','-','-']
let c = ['-','-','-','-']
let d = ['-','-','-','-']


var board = [a,b,c,d]
const playerOne = 'p1';
const playerTwo = 'p2';
var currentPlayer = playerOne;

dropPiece(1) 
dropPiece(1) 
dropPiece(2) 
dropPiece(2) 
dropPiece(1) 

printBoard() 

var totalPieces = 0;

function dropPiece(row) {
    row = row - 1;
    for(let i = board.length-1; i >= 0; i--) {
        
        //If the Current Spot does not equal Player 1 or Player 2 you can go there and then stop the loop 
        let currentSpot = board[i][row];
        //console.log(currentSpot + " " + currentSpot.localeCompare(playerOne) + " " + currentSpot.localeCompare(playerTwo))
        if(currentSpot.localeCompare(playerOne) == 0 || currentSpot.localeCompare(playerTwo) == 0) {
            //console.log("you CANT go here " + currentSpot);
        } else {
            //console.log("you CAN go here " + currentSpot);    
            //console.log("Piece placed by " + currentPlayer)  
            
            //Place the Piece
            board[i][row] = currentPlayer;

            //Switch Players
            if(currentPlayer.localeCompare(playerTwo) == 0) {
                currentPlayer = playerOne;
            } else {
                currentPlayer = playerTwo;
            }

            //Break out of the Loop 
            break;
        }
    }
}



function printBoard() {
    for(let i = 0; i < board.length; i++) {
        for(let j = 0; j < board[i].length; j++) {
            console.log(board[i][j]);
        }
    }
}



    /*
    //Switch Players 

    
    for(let i = board.length-1; i >= 0; i--) {
        let currentSpot = board[i][row];

        //Break the Loop if you are at the top of the board 
        if(i == 0) {
            console.log("You have reached the top of the board")
            break
        }

        //Break the Loop If you place the item 
        if(currentSpot.localeCompare(playerOne) != 0 && currentSpot.localeCompare(playerTwo) != 0)  {
            board[i][row] = currentPlayer;
            break;
        }
    }
    */

/*
for (let i = 0; i < a.length; i++) {
    if(playerOne.toUpperCase() !== a[i].toUpperCase()) {
        console.log(playerOne + " Does not equal " + a[i]);
    } else {
        console.log("MATCH! " + playerOne + " Does equal " + a[i]);
    }
    
}
*/


function printBoard() {
    for (let i = 0; i < board.length; i++) {
        console.log("Board "+ i + " " + board[i]);
    }
}

/*
let a1 = ['-','-','-','-']
let a2 = ['-','-','-','-']
let a3 = ['-','-','-','-']
let a4 = ['a','b','c','d']

var board = [a1,a2,a3,a4]

const a = 0;
const b = 1;
const c = 2;
const d = 3;

//printBoard();
dropPiece(b);
//printBoard()            

function dropPiece(row) {
    //board[row][0] = '1';
    console.log(board[3][row]);
    console.log(board.length)
    //console.log(board[row][0])
    //console.log(board[row][1])
    //console.log(board[row][2])
    //console.log(board[row][3])
}


*/



