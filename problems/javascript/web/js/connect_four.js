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


